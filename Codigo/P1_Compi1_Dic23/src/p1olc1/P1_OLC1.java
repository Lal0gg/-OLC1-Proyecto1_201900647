package p1olc1;

import GUI.*;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import java.io.StringReader;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.html.HTMLEditorKit.Parser;
import clases.Erroor;
import clases.Token;
import clases.Simbolito;
import function.Thompson;

import static function.funca.TokenList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

/**
 *
 * @author edujr
 */
public class P1_OLC1 {
    
    public static void main(String[] args) {

        String regex = "+..(LetraMayus)*(letra)_ ";
        
        Thompson nuevo = new Thompson();
        function.NFA nfa = nuevo.buildNFAFromRegex(regex);
        System.out.println(nfa);
        nuevo.generateDotFile(nfa, "nfa.dot");

    }

    public static void analizadorSubSetify(String ruta, String jflexFile, String cupFile) {

        try {

            String opcionesJflex[] = {ruta + jflexFile, "-d", ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] = {"-destdir", ruta, "-parser", "Parser", ruta + cupFile};
            java_cup.Main.main(opcionesCup);

        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }

    }


    public static void analizarSubSetify(String entrada) {
        try {
            TokenList.clear();
            analyzerr.Lexer lexer = new analyzerr.Lexer(new StringReader(entrada));
            analyzerr.Parser parser = new analyzerr.Parser(lexer);
            parser.parse();
            System.out.println("Se analizó correctamente el archivo SS :D");
            JOptionPane.showMessageDialog(null, "Analisis SS generado con éxito :D");

        } 
        catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }
    }

}
