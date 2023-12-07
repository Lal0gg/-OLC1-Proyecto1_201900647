/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import p1_olc1.P1_OLC1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;
import clases.Erroor;
import clases.Token;
import clases.Simbolito;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author edujr
 */
public class GUI extends javax.swing.JFrame {

    public static String NombreActualArchivoJson = "";
    File archivoactual = null;
    RSyntaxTextArea textAreaGG = new RSyntaxTextArea();
    RSyntaxTextArea textAreaGG2 = new RSyntaxTextArea();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setIconImage(getIconImage());
        RSyntax();
        RSyntaxx2();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon3.png"));
        return retValue;
    }

    public void RSyntax() {
        textAreaGG.setFont(new Font("Roboto Mono", Font.PLAIN, 15));
        textAreaGG.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
        textAreaGG.setAntiAliasingEnabled(true);
        //textArea.setBackground(Color.BLACK);
        RTextScrollPane sp = new RTextScrollPane(textAreaGG);
        sp.getGutter().setLineNumberColor(Color.decode("#4EDEB6"));
        sp.getGutter().setLineNumberFont(new Font("Roboto Mono", Font.BOLD, 16));
        sp.getGutter().setBorderColor(Color.decode("#38F8C4"));
        jPanel2.add(sp);

    }

    public void RSyntaxx2() {
        textAreaGG2.setFont(new Font("Roboto Mono", Font.PLAIN, 15));
        textAreaGG2.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
        textAreaGG2.setAntiAliasingEnabled(true);
        textAreaGG2.setEditable(false);
        //textArea.setBackground(Color.BLACK);
        RTextScrollPane spp = new RTextScrollPane(textAreaGG2);
        spp.getGutter().setLineNumberColor(Color.decode("#4EDEB6"));
        spp.getGutter().setLineNumberFont(new Font("Roboto Mono", Font.BOLD, 16));
        spp.getGutter().setBorderColor(Color.decode("#38F8C4"));
        jPanel3.add(spp);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StatPy Convertor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Entrada:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Salida:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Analizador:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("null");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(0, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(578, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(491, 491, 491))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Roboto Mono", 1, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem3.setText("Guardar Como");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Analizador");
        jMenu2.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem5.setText("StatPy");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem6.setText("JSON");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Ejecutar");
        jMenu3.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem4.setText("Ejecutaar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("Reporte");
        jMenu4.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem7.setText("Tokens");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jMenuItem8.setText("Errores Léxicos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //este código abre un  archivo  y lo imprime en el  
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openAndDisplayFileContentt();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void openAndDisplayFileContent() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter spFilter = new FileNameExtensionFilter("SP Files", "sp");
        FileNameExtensionFilter jsonFilter = new FileNameExtensionFilter("JSON Files", "json");
        fileChooser.addChoosableFileFilter(spFilter);
        fileChooser.addChoosableFileFilter(jsonFilter);

        int selection = fileChooser.showOpenDialog(this);

        if (selection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            StringBuilder content = new StringBuilder();

            try ( Scanner input = new Scanner(selectedFile)) {
                while (input.hasNextLine()) {
                    content.append(input.nextLine()).append("\n");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            textAreaGG.setText(content.toString());
            //jTextArea1.setText(content.toString());
            archivoactual = selectedFile; // Guardar el archivo seleccionado en la variable global
        }

    }

    //metodo para abrir
    private void openAndDisplayFileContentt() {

        // TODO add your handling code here:
        JFileChooser NewChooser = new JFileChooser();
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Archivos SP y JSON (*.sp, *.json)", "sp", "json");
        NewChooser.setFileFilter(filtro1);

        int selex = NewChooser.showSaveDialog(textAreaGG);

        if (selex == JFileChooser.APPROVE_OPTION) {
            String content = "";
            archivoactual = NewChooser.getSelectedFile();
            File archivo = new File(archivoactual.toString());
            NombreActualArchivoJson = archivo.getName();
            System.out.println("Jons - >  " + NombreActualArchivoJson);
            try {
                Scanner input = new Scanner(archivoactual);
                while (input.hasNextLine()) {
                    content += input.nextLine() + "\n";

                }
                input.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            textAreaGG.setText(content.toString());
        }
    }

    //boton guardar
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        File file = archivoactual;
        String text = textAreaGG.getText();

        try ( PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8)) {
            out.print(text);
            System.out.println("Se ha guardado el archivo con exito :D");
            JOptionPane.showMessageDialog(rootPane, "Se ha guardado con éxito :D");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //boton guardar como
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String text = textAreaGG.getText();
        JFileChooser fc = new JFileChooser();

        int selx = fc.showSaveDialog(textAreaGG);

        if (selx == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();

            try ( FileWriter fw = new FileWriter(fichero)) {
                fw.write(text);
                System.out.println("Se ha guardado el archivo con exito :D");
                JOptionPane.showMessageDialog(rootPane, "Se ha guardado con éxito :D");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //Boton seleccionar Analizador "statpy"
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("Statpy");

    }//GEN-LAST:event_jMenuItem5ActionPerformed
    //Boton seleccionar Analizador "json"
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("Json");
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    //boton para ejecutar analizador
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        VerificarAnalizador();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    //boton reporte Tokens
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
//        if ("Statpy".equals(jLabel4.getText())) {
//            ReporteTokens ReporteT1 = new ReporteTokens();
//            ReporteT1.ReporteT(TokenList);
//            func.Funcion.contadorCases = 0;
//            for (Token token : TokenList) {
//                System.out.println("---------------------------");
//                System.out.print(" Token: " + token.getToken());
//                System.out.print(" Lexema: " + token.getLexema());
//                System.out.print(" Línea: " + token.getLinea());
//                System.out.println(" Columna: " + token.getColumna());
//            }
//        } else if ("Json".equals(jLabel4.getText())) {
//            //System.out.println(HashMapFileJson); 
//            System.out.println(HashMapFileJson);
//            for (String i : HashMapFileJson.keySet()) {
//                System.out.println("Key: " + i);
//                LinkedList<Simbolito> listaSimbolos = HashMapFileJson.get(i);
//                for (Simbolito simbolito : listaSimbolos) {
//                    System.out.println("Value: " + simbolito.toString()); // Utiliza la implementación personalizada de toString() de Simbolito
//                }
//
//            }
//
//        }


    }//GEN-LAST:event_jMenuItem7ActionPerformed
    //boton para errores
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
//        if ("Statpy".equals(jLabel4.getText())) {
//            ReporteErrores ReporteE1 = new ReporteErrores();
//            ReporteE1.ReporteErr(ErrorList);
//            for (Erroor error : ErrorList) {
//                System.out.println("Tipo de Error: " + error.getType());
//                System.out.println("Descripción: " + error.getDescription());
//                System.out.println("Carácter: " + error.getCharacter());
//                System.out.println("Línea: " + error.getLine());
//                System.out.println("Columna: " + error.getColumn());
//                System.out.println("---------------------------");
//            }
//
//        } else if ("Json".equals(jLabel4.getText())) {
//             ReporteErrores ReporteE1 = new ReporteErrores();
//            ReporteE1.ReporteErr(ErrorList);
//            for (Erroor error : ErrorList) {
//                System.out.println("Tipo de Error: " + error.getType());
//                System.out.println("Descripción: " + error.getDescription());
//                System.out.println("Carácter: " + error.getCharacter());
//                System.out.println("Línea: " + error.getLine());
//                System.out.println("Columna: " + error.getColumn());
//                System.out.println("---------------------------");
//            }
//            
//        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void VerificarAnalizador() {
//        if ("Statpy".equals(jLabel4.getText())) {
//            String textt = textAreaGG.getText();
//            analizarStatpy(textt);
//        String traduccion ="";
//        for (int i=0;i<Funcion.ListaTraducccionPy.size();i++){
//            System.out.println(Funcion.ListaTraducccionPy.get(i));
//            traduccion +=Funcion.ListaTraducccionPy.get(i)+ "\n";
//            textAreaGG2.setText(traduccion);
//        }
//        } else if ("Json".equals(jLabel4.getText())) {
//
//            String textt2 = textAreaGG.getText();
//            analizarJson(textt2);
//
//
//       
////            pruebitaIndentationpy();
//        }
    }
//    
//      private void pruebitaIndentationpy() {
//        
//
//        indentPy concatenationCounter = new indentPy();
//        indentPy concatenationCounter2 = new indentPy();
//        indentPy concatenationCounter3 = new indentPy();
//        indentPy concatenationCounter4 = new indentPy();
//        indentPy concatenationCounter5 = new indentPy();
//
//        
//        indentPy concatenationCounterx = new indentPy();
//        indentPy concatenationCounterx1 = new indentPy();
//        indentPy concatenationCounterx2 = new indentPy();
//        indentPy concatenationCounterx3 = new indentPy();
//
//
//
//        concatenationCounter.setIndentationLevel(0); // Establece el nivel de indentación
//        concatenationCounter2.setIndentationLevel(1);
//        concatenationCounter3.setIndentationLevel(2);
//        concatenationCounter4.setIndentationLevel(1);
//        concatenationCounter5.setIndentationLevel(2);
//        
//        concatenationCounterx.setIndentationLevel(0);
//        concatenationCounterx1.setIndentationLevel(1);
//        concatenationCounterx2.setIndentationLevel(2);
//        concatenationCounterx3.setIndentationLevel(2);
//
//
//
//        StringBuilder result = new StringBuilder();
//        StringBuilder result2 = new StringBuilder();
//        P1_OLC1.indentText(NombreActualArchivoJson, WIDTH);
//
//        result.append(concatenationCounter.concatenateWithIndentation("switch: \n"));
//        result.append(concatenationCounter2.concatenateWithIndentation("case 1:\n"));
//        result.append(concatenationCounter3.concatenateWithIndentation("return \"zero\"\n"));
//        result.append(concatenationCounter4.concatenateWithIndentation("case 2:\n"));
//        result.append(concatenationCounter5.concatenateWithIndentation("return \"one\"\n"));        
//        Funcion.ListaTraducidaPy.add(result);
//        
//        result2.append(concatenationCounterx.concatenateWithIndentation("a = 1\n"));        
//        result2.append(concatenationCounterx1.concatenateWithIndentation("if(a==1):\n"));        
//        result2.append(concatenationCounterx2.concatenateWithIndentation("print(\"Hola Mundo xd\")\n"));        
//        result2.append(concatenationCounterx3.concatenateWithIndentation("print(\"UwU\")\n"));  
//        Funcion.ListaTraducidaPy.add(result2);
//        
//
//        
//
////        System.out.println(result.toString());
////        System.out.println(result2.toString());
//          String traduccion ="";
//        for (int i=0;i<Funcion.ListaTraducidaPy.size();i++){
//            System.out.println(Funcion.ListaTraducidaPy.get(i));
//            traduccion +=Funcion.ListaTraducidaPy.get(i);
//            textAreaGG2.setText(traduccion);
//        }
//
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
