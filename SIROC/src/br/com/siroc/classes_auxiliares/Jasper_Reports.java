/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.classes_auxiliares;

import br.com.siroc.fabrica.ConnectionFactory;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;

/**
 *
 * @author matteus
 */
public class Jasper_Reports {

    private Session session;

    public Jasper_Reports() {
        session = new ConnectionFactory().getSession();
    }

    public void gerar(int id) throws JRException, SQLException {
        URL arquivo = getClass().getResource("/Termo/inked.jrxml");
        String resultado = arquivo.getPath();
        resultado = resultado.replaceAll("%20", " ");

        JasperDesign desenho = JRXmlLoader.load(resultado);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String query = "select cli_nome, cli_cpf,cli_rg,to_char(cli_datanasc,"
                + "'dd/mm/yyyy'),cli_rua || ' ' || cli_numero || ', ' || cli_bairro || ' - ' || cli_cidade as ENDERECO"
                + " from cliente where cli_codigo = '" + id + "'";

        //PreparedStatement pstmt = this.session.prepareStatement(query);
        //ResultSet rs = pstmt.executeQuery();
        //JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        HashMap parametros = new HashMap();
        parametros.put("blablabla", new Double(10));

        //JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        //JasperViewer.viewReport(impressao);
        //JasperPrintManager.printPage(impressao, 0, true);
    }

}
