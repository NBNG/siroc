/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.controle;

import br.com.siroc.modelo.Cliente;

/**
 *
 * @author Administrador
 */
public class ClienteControle {
    
    public boolean adicionar(Cliente cliente){
        boolean status = true;
        if(!isValidEmail(cliente.getEmail())) status = false;
        
           
        return status;        
    }
    
    
    
    
    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
    
}
