/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.classes_auxiliares;

/**
 *
 * @author matt
 */
public class Editor {

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }

    public static Double formataValor(String valor) {
        return Double.parseDouble(valor.replace(",", "."));
    }
}
