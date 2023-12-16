/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.LinkedList;

/**
 *
 * @author edujr
 */
public class ExpresionRegular {
    
    private String Identificador;
    private String Delimitador;
    private String Expresion;
    
    
    
    public ExpresionRegular(String Identificador, String Delimitador, String Expresion){
        this.Delimitador = Delimitador;
        this.Expresion  = Expresion;
        this.Identificador = Identificador;
    }

   
  

    /**
     * @return the Identificador
     */
    public String getIdentificador() {
        return Identificador;
    }

    /**
     * @param Identificador the Identificador to set
     */
    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    /**
     * @return the Delimitador
     */
    public String getDelimitador() {
        return Delimitador;
    }

    /**
     * @param Delimitador the Delimitador to set
     */
    public void setDelimitador(String Delimitador) {
        this.Delimitador = Delimitador;
    }

    /**
     * @return the Expresion
     */
    public String getExpresion() {
        return Expresion;
    }

    /**
     * @param Expresion the Expresion to set
     */
    public void setExpresion(String Expresion) {
        this.Expresion = Expresion;
    }
    
   
    
     
    public String toString(){
        return this.getIdentificador()+ " " + this.getDelimitador() + " " + this.getExpresion();
    }
    
    
    
}
