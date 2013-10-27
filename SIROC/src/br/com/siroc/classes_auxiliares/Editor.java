/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.classes_auxiliares;

import br.com.siroc.interfaces.Cadastro_Clientes;
import br.com.siroc.modelo.Cliente;
import java.text.ParseException;

/**
 *
 * @author matt
 */
public class Editor {

    private static Cliente cad_cliente;

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }

    public static Double formataValor(String valor) {
        return Double.parseDouble(valor.replace(",", "."));
    }

    public static Object Limpador(Object classe) {
        classe = cad_cliente;
        return classe;

    }

    public Editor() throws ParseException {
        this.cad_cliente = new Cliente();
    }
}
