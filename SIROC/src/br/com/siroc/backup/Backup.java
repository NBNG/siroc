/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.backup;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Backup {

    public static void fazBackup() {
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            String caminho = filesys.getHomeDirectory().toString();
            ProcessBuilder pb;
            Process p;
            pb = new ProcessBuilder("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe ",
                    "-i", "-h", "localhost", "-p", "5432", "-U", "postgres", "-F", "t", "-b", "-v", "-f",
                    caminho + "\\bkp.sql", "siroc");
            pb.environment().put("PGPASSWORD", "senha");
            pb.redirectErrorStream(true);
            p = pb.start();
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }
}
