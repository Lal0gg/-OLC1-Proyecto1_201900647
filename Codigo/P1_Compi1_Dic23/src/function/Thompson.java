/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

;
import java.util.Stack;
/**
 *
 * @author edujr
 */

import java.util.HashSet;
import java.util.Set;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;
import function.NFA;
import function.State;



public class Thompson {

    private static int stateCounter = 0;
    private static StringBuilder contenidoParentesis = new StringBuilder();
    public static boolean dentroDeParentesis = false;
    public static boolean modoLiteral = false;
    private static StringBuilder literalBuilder = new StringBuilder();

    public static NFA buildNFAFromRegex(String regex) {
        Stack<NFA> stack = new Stack<>();

        for (int f = regex.length() - 1; f >= 0; f--) {
            char c = regex.charAt(f);

            if (c == '*') {
                if (!stack.isEmpty()) {
                    NFA nfa = stack.pop();
                    stack.push(closure(nfa));
                } else {
                    // Manejar el error
                }
            } else if (c == '.') {
                // Agregar este bloque para asegurarse de que todas las operaciones de concatenación se completen
                while (stack.size() >= 2) {
                    NFA a = stack.pop();
                    NFA b = stack.pop();
                    stack.push(concatenation(b, a));
                }
            } else if (c == '|') {
                if (stack.size() >= 2) {
                    NFA bOr = stack.pop();
                    NFA aOr = stack.pop();
                    stack.push(or(aOr, bOr));
                } else {
                    // Manejar el error
                }
            } else if (c == '_') {
                stack.push(basic(String.valueOf(c)));
            } else if (Character.isLetterOrDigit(c)) {
                // Verificar si estamos dentro de paréntesis o no
                if (dentroDeParentesis) {
                    //System.out.println(c);
                    contenidoParentesis.append(c);
                } else {
                    //System.out.println(c);
                    stack.push(createToken(String.valueOf(c)));
                }
            } else if (c == '+') {
                // Manejar la cerradura positiva
                if (!stack.isEmpty()) {
                    NFA nfa = stack.pop();
                    stack.push(positiveClosure(nfa));
                } else {
                    // Manejar el error
                }
            } else if (c == ')') {
                // Marcar que estamos dentro de un paréntesis
                dentroDeParentesis = true;
                //System.out.println(c);

                contenidoParentesis = new StringBuilder();
            } else if (c == '(') {
                // Marcar que estamos fuera de un paréntesis
                dentroDeParentesis = false;
                //System.out.println(dentroDeParentesis);
                // Agregar el contenido del paréntesis como un token si hay contenido
                if (contenidoParentesis.length() > 0) {
                    //System.out.println(contenidoParentesis);
                    stack.push(basic(contenidoParentesis.reverse().toString()));
                }
            }

            System.out.println("Stack content: " + stack);
        }

        // Asegurarse de que todas las operaciones de concatenación pendientes se completen al final
        while (stack.size()
                >= 2) {
            NFA a = stack.pop();
            NFA b = stack.pop();
            stack.push(concatenation(b, a));
        }

        if (stack.size()
                == 1) {
            return stack.pop();
        } else {
            // Manejar el error
            return null;
        }
    }

    public static NFA basic(String symbol) {
        State start = new State(stateCounter++);
        State accept = new State(stateCounter++);
        start.next1 = accept;
        return new NFA(start, accept, String.valueOf(symbol));
    }

    public static NFA concatenation(NFA b, NFA a) {
        a.accept.next1 = b.start;
        return new NFA(a.start, b.accept, b.accept.transition + b.start.transition);
    }

    public static NFA closure(NFA nfa) {
        State newStart = new State(stateCounter++);
        State newAccept = new State(stateCounter++);
        newStart.next1 = nfa.start;
        newStart.next2 = newAccept;
        nfa.accept.next1 = nfa.start;
        nfa.accept.next2 = newAccept;

        // Agregar transición "ε" a todos los nodos, excepto en el nodo de "a"
        addEpsilonTransitions(newStart, newAccept, nfa.start, nfa.accept);

        return new NFA(newStart, newAccept, "ε");
    }

    public static NFA positiveClosure(NFA nfa) {
        // Implementar la cerradura positiva basada en la cerradura de Kleene
        NFA kleeneClosure = closure(nfa);
        State newStart = new State(stateCounter++);
        State newAccept = new State(stateCounter++);
        newStart.next1 = nfa.start;
        nfa.accept.next1 = nfa.start;
        nfa.accept.next2 = newAccept;
        kleeneClosure.accept.next1 = newAccept;

        // Agregar transiciones "ε" desde newStart hasta newAccept excluyendo a.start y b.start
        return new NFA(newStart, newAccept, "ε");
    }

    private static NFA createToken(String token) {
        // Verificar si el token está precedido por '(' y seguido por ')'
        if (contenidoParentesis.length() > 0 && contenidoParentesis.charAt(contenidoParentesis.length() - 1) == '(') {
            return basic(token);
        } else {
            // Si no está precedido por '(', tratar como variable básica
            return createVariable(token);
        }
    }

    private static NFA createVariable(String variable) {
        State start = new State(stateCounter++);
        State accept = new State(stateCounter++);
        start.next1 = accept;
        return new NFA(start, accept, variable);
    }

    public static NFA or(NFA a, NFA b) {
        State newStart = new State(stateCounter++);
        State newAccept = new State(stateCounter++);
        newStart.next1 = b.start;
        newStart.next2 = a.start;
        a.accept.next1 = newAccept;
        b.accept.next1 = newAccept;

        // Agregar transiciones "ε" desde newStart hasta newAccept excluyendo a.start y b.start
        return new NFA(newStart, newAccept, "ε");
    }

    public static void generateDotFile(NFA nfa, String filename) {
        try ( PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("digraph NFA { \n rankdir=LR;");

            // Establecer la forma de los nodos
            writer.println("node[shape=circle]");

            if (nfa != null) {
                printTransitionsDot(nfa.start, writer, nfa.accept);
            } else {
                System.out.println("es nulo");
            }
            writer.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printTransitionsDot(State state, PrintWriter writer, State acceptState) {
        Set<State> visitedStates = new HashSet<>();
        printTransitionsDotHelper(state, writer, acceptState, visitedStates);
    }

    private static void printTransitionsDotHelper(State state, PrintWriter writer, State acceptState, Set<State> visitedStates) {
        if (state == null || visitedStates.contains(state)) {
            return;
        }

        visitedStates.add(state);

        // Verificar si el estado es el estado de aceptación
        String nodeShape = (state == acceptState) ? "doublecircle" : "circle";
        writer.println(state.label + " [shape=" + nodeShape + "];");

        // Imprimir las transiciones
        if (state.next1 != null) {
            writer.println(state.label + " -> " + state.next1.label + " [label=\"" + state.next1.transition + "\"];");
            printTransitionsDotHelper(state.next1, writer, acceptState, visitedStates);
        }

        if (state.next2 != null) {
            writer.println(state.label + " -> " + state.next2.label + " [label=\"" + state.next2.transition + "\"];");
            printTransitionsDotHelper(state.next2, writer, acceptState, visitedStates);
        }
    }

    public static void generateImageFromDotFile(String dotFilePath, String imageFilePath) {
        try {
            // Construir el comando para ejecutar dot
            String command = "dot -Tpng -o " + imageFilePath + " " + dotFilePath;

            // Ejecutar el comando
            Process process = Runtime.getRuntime().exec(command);

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();

            // Imprimir el resultado
            if (exitCode == 0) {
                System.out.println("Imagen generada exitosamente: " + imageFilePath);
            } else {
                System.out.println("Error al generar la imagen.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void addEpsilonTransitions(State start, State accept, State exclude1, State exclude2) {
        if (start == null || start == exclude1 || start == exclude2) {
            return;
        }

        if (start.next1 != null) {
            start.next1.transition = "ε";
            if (start.next1 != exclude1 && start.next1 != exclude2) {
                addEpsilonTransitions(start.next1, accept, exclude1, exclude2);
            }
        }

        if (start.next2 != null) {
            start.next2.transition = "ε";
            if (start.next2 != exclude1 && start.next2 != exclude2) {
                addEpsilonTransitions(start.next2, accept, exclude1, exclude2);
            }
        }
    }
}
