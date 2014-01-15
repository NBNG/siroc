/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.backup;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Backup {

    public static void fazBackup() {
        try {
            String caminho = System.getenv("USERPROFILE")
                    + "\\Documents\\nbng\\siroc\\Backup";
            ProcessBuilder pb;
            Process p;
            pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\9.3\\bin\\pg_dump.exe ",
                    "-i", "-h", "localhost", "-p", "5432", "-U", "postgres", "-F", "t", "-b", "-v", "-f",
                    caminho + "\\bkp.sql", "siroc");
            pb.environment().put("PGPASSWORD", "senha");
            pb.redirectErrorStream(true);
            p = pb.start();
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso!",
                    "Activity Performed Successfully",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "\"Arquivo não encontrado,"
                    + " contate o administrador do sistema e informe o erro:"
                    + " \n" + ex,
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);

        }
    }
}
