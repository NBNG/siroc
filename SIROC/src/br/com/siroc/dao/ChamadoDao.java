package br.com.siroc.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.hibernate.Query;
import org.hibernate.Session;

public class ChamadoDao {
    /*
     public ChamadoDao(Session session) {
     super(session, Chamado.class);
     }

     public Chamado busca(String protocolo) {
     Chamado chamado = null;

     String consulta = "FROM RAIT_CHAMADO WHERE id = :protocolo";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("protocolo", Long.parseLong(protocolo));

     if (query.list().size() > 0)
     chamado = (Chamado) query.list().get(0);

     return chamado;
     }

     public Collection<Chamado> pesquisaRapida(Long idChamado) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO WHERE id = :idChamado ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idChamado", idChamado);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     return chamados;
     }

     public Collection<Chamado> pesquisaRapida(Long idChamado, Unidade unidade) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO WHERE id = :idChamado";
     consulta += " AND (unidade.id = :idUnidade OR autor.id IN (SELECT usuario.id FROM INTRANET_DADOS_CADASTRO WHERE unidade.id = :idUnidade))";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idChamado", idChamado);
     query.setParameter("idUnidade", unidade.getId());

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     return chamados;
     }

     public Collection<Chamado> pesquisaRapida(Long idChamado, Departamento departamento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO WHERE id = :idChamado";
     consulta += " AND (departamento.id = :idDepartamento OR autor.id IN (SELECT usuario.id FROM INTRANET_DADOS_CADASTRO WHERE departamento.id = :idDepartamento))";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idChamado", idChamado);
     query.setParameter("idDepartamento", departamento.getId());

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     return chamados;
     }

     public Collection<Chamado> pesquisaAvancadaNivel1(Chamado chamado, String[] parametrosOrdenacao, Calendar dataInicialAbertura, Calendar dataFinalAbertura, Calendar dataInicialEncerramento, Calendar dataFinalEncerramento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();
     Map<String, Object> parameters = new HashMap<String, Object>();

     String consulta = "FROM RAIT_CHAMADO WHERE 1 = 1";

     if (chamado.getId() != null) {
     consulta += " AND id = :idChamado";
     parameters.put("idChamado", chamado.getId());
     }
     if ((chamado.getAssunto() != null) && (!chamado.getAssunto().equals(""))) {
     consulta += " AND assunto LIKE :assunto";
     parameters.put("assunto", "%" + chamado.getAssunto() + "%");
     }
     if ((chamado.getCliente().getCodigo() != null) && (!chamado.getCliente().getCodigo().equals(""))) {
     consulta += " AND cliente.codigo = :codigoCliente";
     parameters.put("codigoCliente", chamado.getCliente().getCodigo());
     }
     if ((chamado.getCliente().getRegiao() != null) && (chamado.getCliente().getRegiao().getId() != null)) {
     consulta += " AND cliente.regiao.id = :idRegiao";
     parameters.put("idRegiao", chamado.getCliente().getRegiao().getId());
     }
     if ((chamado.getTipo() != null) && (chamado.getTipo().getId() != null)) {
     consulta += " AND tipo.id = :tipo";
     parameters.put("tipo", chamado.getTipo().getId());
     }
     if ((chamado.getSubtipo() != null) && (chamado.getSubtipo().getId() != null)) {
     consulta += " AND subtipo.id = :subtipo";
     parameters.put("subtipo", chamado.getSubtipo().getId());
     }
     if (chamado.getNivel().getId() != null) {
     consulta += " AND nivel.id = :nivel";
     parameters.put("nivel", chamado.getNivel().getId());
     }
     if (chamado.getStatus().getId() != null) {
     consulta += " AND status.id = :status";
     parameters.put("status", chamado.getStatus().getId());
     }
     if ((chamado.getUnidade() != null) && (chamado.getUnidade().getId() != null)) {
     consulta += " AND unidade.id = :unidade";
     parameters.put("unidade", chamado.getUnidade().getId());
     }
     if ((chamado.getDepartamento() != null) && (chamado.getDepartamento().getId() != null)) {
     consulta += " AND departamento.id = :departamento";
     parameters.put("departamento", chamado.getDepartamento().getId());
     }
     if ((chamado.getAutor() != null) && (chamado.getAutor().getId() != null)) {
     consulta += " AND autor.id = :autor";
     parameters.put("autor", chamado.getAutor().getId());
     }
     if ((chamado.getResponsavel() != null) && (chamado.getResponsavel().getId() != null)) {
     consulta += " AND responsavel.id = :responsavel";
     parameters.put("responsavel", chamado.getResponsavel().getId());
     }
     if ((dataInicialAbertura != null) && (dataFinalAbertura != null)) {
     consulta += " AND dataAbertura BETWEEN :dataInicialAbertura AND :dataFinalAbertura";
     parameters.put("dataInicialAbertura", dataInicialAbertura);
     parameters.put("dataFinalAbertura", dataFinalAbertura);
     }
     if ((dataInicialEncerramento != null) && (dataFinalEncerramento != null)) {
     consulta += " AND dataEncerramento BETWEEN :dataInicialEncerramento AND :dataFinalEncerramento";
     parameters.put("dataInicialEncerramento", dataInicialEncerramento);
     parameters.put("dataFinalEncerramento", dataFinalEncerramento);
     }
     if (parametrosOrdenacao != null) {
     consulta += " ORDER BY ";
     for (String parametroOrdenacao : parametrosOrdenacao)
     if (parametroOrdenacao != "")
     consulta += parametroOrdenacao + ", ";
     consulta += "id ASC";
     } else
     consulta += " ORDER BY id ASC";

     Query query = super.getSession().createQuery(consulta);

     Iterator<String> iter = parameters.keySet().iterator();
     while (iter.hasNext()) {
     String nome = iter.next();
     query.setParameter(nome, parameters.get(nome));
     }

     for(int x = 0; x < query.list().size(); x++) {
     Chamado item = (Chamado) query.list().get(x);
     chamados.add(item);
     }

     return chamados;
     }

     public Collection<Chamado> pesquisaAvancadaNivel2(Chamado chamado, String[] parametrosOrdenacao, Calendar dataInicialAbertura, Calendar dataFinalAbertura, Calendar dataInicialEncerramento, Calendar dataFinalEncerramento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();
     Map<String, Object> parameters = new HashMap<String, Object>();

     String consulta = "FROM RAIT_CHAMADO WHERE (unidade.id = :idUnidade OR autor.id IN (SELECT usuario.id FROM INTRANET_DADOS_CADASTRO WHERE unidade.id = :idUnidade))";

     if (chamado.getId() != null) {
     consulta += " AND id = :idChamado";
     parameters.put("idChamado", chamado.getId());
     }
     if ((chamado.getAssunto() != null) && (!chamado.getAssunto().equals(""))) {
     consulta += " AND assunto LIKE :assunto";
     parameters.put("assunto", "%" + chamado.getAssunto() + "%");
     }
     if ((chamado.getCliente().getCodigo() != null) && (!chamado.getCliente().getCodigo().equals(""))) {
     consulta += " AND cliente.codigo = :codigoCliente";
     parameters.put("codigoCliente", chamado.getCliente().getCodigo());
     }
     if ((chamado.getCliente().getRegiao() != null) && (chamado.getCliente().getRegiao().getId() != null)) {
     consulta += " AND cliente.regiao.id = :idRegiao";
     parameters.put("idRegiao", chamado.getCliente().getRegiao().getId());
     }
     if ((chamado.getTipo() != null) && (chamado.getTipo().getId() != null)) {
     consulta += " AND tipo.id = :tipo";
     parameters.put("tipo", chamado.getTipo().getId());
     }
     if ((chamado.getSubtipo() != null) && (chamado.getSubtipo().getId() != null)) {
     consulta += " AND subtipo.id = :subtipo";
     parameters.put("subtipo", chamado.getSubtipo().getId());
     }
     if (chamado.getNivel().getId() != null) {
     consulta += " AND nivel.id = :nivel";
     parameters.put("nivel", chamado.getNivel().getId());
     }
     if (chamado.getStatus().getId() != null) {
     consulta += " AND status.id = :status";
     parameters.put("status", chamado.getStatus().getId());
     }
     if ((chamado.getDepartamento() != null) && (chamado.getDepartamento().getId() != null)) {
     consulta += " AND departamento.id = :departamento";
     parameters.put("departamento", chamado.getDepartamento().getId());
     }
     if ((chamado.getAutor() != null) && (chamado.getAutor().getId() != null)) {
     consulta += " AND autor.id = :autor";
     parameters.put("autor", chamado.getAutor().getId());
     }
     if ((chamado.getResponsavel() != null) && (chamado.getResponsavel().getId() != null)) {
     consulta += " AND responsavel.id = :responsavel";
     parameters.put("responsavel", chamado.getResponsavel().getId());
     }
     if ((dataInicialAbertura != null) && (dataFinalAbertura != null)) {
     consulta += " AND dataAbertura BETWEEN :dataInicialAbertura AND :dataFinalAbertura";
     parameters.put("dataInicialAbertura", dataInicialAbertura);
     parameters.put("dataFinalAbertura", dataFinalAbertura);
     }
     if ((dataInicialEncerramento != null) && (dataFinalEncerramento != null)) {
     consulta += " AND dataEncerramento BETWEEN :dataInicialEncerramento AND :dataFinalEncerramento";
     parameters.put("dataInicialEncerramento", dataInicialEncerramento);
     parameters.put("dataFinalEncerramento", dataFinalEncerramento);
     }
     if (parametrosOrdenacao != null) {
     consulta += " ORDER BY ";
     for (String parametroOrdenacao : parametrosOrdenacao)
     if (parametroOrdenacao != "")
     consulta += parametroOrdenacao + ", ";
     consulta += "id ASC";
     } else
     consulta += " ORDER BY id ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idUnidade", chamado.getUnidade().getId());

     Iterator<String> iter = parameters.keySet().iterator();
     while (iter.hasNext()) {
     String nome = iter.next();
     query.setParameter(nome, parameters.get(nome));
     }

     for(int x = 0; x < query.list().size(); x++) {
     Chamado item = (Chamado) query.list().get(x);
     chamados.add(item);
     }

     return chamados;
     }

     public Collection<Chamado> pesquisaAvancadaNivel3(Chamado chamado, String[] parametrosOrdenacao, Calendar dataInicialAbertura, Calendar dataFinalAbertura, Calendar dataInicialEncerramento, Calendar dataFinalEncerramento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();
     Map<String, Object> parameters = new HashMap<String, Object>();

     String consulta = "FROM RAIT_CHAMADO WHERE (departamento.id = :idDepartamento OR autor.id IN (SELECT usuario.id FROM INTRANET_DADOS_CADASTRO WHERE departamento.id = :idDepartamento))";

     if (chamado.getId() != null) {
     consulta += " AND id = :idChamado";
     parameters.put("idChamado", chamado.getId());
     }
     if ((chamado.getAssunto() != null) && (!chamado.getAssunto().equals(""))) {
     consulta += " AND assunto LIKE :assunto";
     parameters.put("assunto", "%" + chamado.getAssunto() + "%");
     }
     if ((chamado.getCliente().getCodigo() != null) && (!chamado.getCliente().getCodigo().equals(""))) {
     consulta += " AND cliente.codigo = :codigoCliente";
     parameters.put("codigoCliente", chamado.getCliente().getCodigo());
     }
     if ((chamado.getCliente().getRegiao() != null) && (chamado.getCliente().getRegiao().getId() != null)) {
     consulta += " AND cliente.regiao.id = :idRegiao";
     parameters.put("idRegiao", chamado.getCliente().getRegiao().getId());
     }
     if ((chamado.getTipo() != null) && (chamado.getTipo().getId() != null)) {
     consulta += " AND tipo.id = :tipo";
     parameters.put("tipo", chamado.getTipo().getId());
     }
     if ((chamado.getSubtipo() != null) && (chamado.getSubtipo().getId() != null)) {
     consulta += " AND subtipo.id = :subtipo";
     parameters.put("subtipo", chamado.getSubtipo().getId());
     }
     if (chamado.getNivel().getId() != null) {
     consulta += " AND nivel.id = :nivel";
     parameters.put("nivel", chamado.getNivel().getId());
     }
     if (chamado.getStatus().getId() != null) {
     consulta += " AND status.id = :status";
     parameters.put("status", chamado.getStatus().getId());
     }
     if ((chamado.getAutor() != null) && (chamado.getAutor().getId() != null)) {
     consulta += " AND autor.id = :autor";
     parameters.put("autor", chamado.getAutor().getId());
     }
     if ((chamado.getResponsavel() != null) && (chamado.getResponsavel().getId() != null)) {
     consulta += " AND responsavel.id = :responsavel";
     parameters.put("responsavel", chamado.getResponsavel().getId());
     }
     if ((dataInicialAbertura != null) && (dataFinalAbertura != null)) {
     consulta += " AND dataAbertura BETWEEN :dataInicialAbertura AND :dataFinalAbertura";
     parameters.put("dataInicialAbertura", dataInicialAbertura);
     parameters.put("dataFinalAbertura", dataFinalAbertura);
     }
     if ((dataInicialEncerramento != null) && (dataFinalEncerramento != null)) {
     consulta += " AND dataEncerramento BETWEEN :dataInicialEncerramento AND :dataFinalEncerramento";
     parameters.put("dataInicialEncerramento", dataInicialEncerramento);
     parameters.put("dataFinalEncerramento", dataFinalEncerramento);
     }
     if (parametrosOrdenacao != null) {
     consulta += " ORDER BY ";
     for (String parametroOrdenacao : parametrosOrdenacao)
     if (parametroOrdenacao != "")
     consulta += parametroOrdenacao + ", ";
     consulta += "id ASC";
     } else
     consulta += " ORDER BY id ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idDepartamento", chamado.getDepartamento().getId());

     Iterator<String> iter = parameters.keySet().iterator();
     while (iter.hasNext()) {
     String nome = iter.next();
     query.setParameter(nome, parameters.get(nome));
     }

     for(int x = 0; x < query.list().size(); x++) {
     Chamado item = (Chamado) query.list().get(x);
     chamados.add(item);
     }

     return chamados;
     }

     public Collection<Chamado> listarPorUsuario(Long idUsuario, Long idDepartamento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO WHERE dataEncerramento IS null";
     consulta += " AND (responsavel.id = :responsavel OR autor.id = :autor)";
     consulta += " OR (responsavel.id = null AND departamento.id = :departamento)";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("responsavel", idUsuario);
     query.setParameter("autor", idUsuario);
     query.setParameter("departamento", idDepartamento);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     query.setCacheable(true);

     return chamados;
     }

     public Collection<Chamado> listarAbertosPorCliente(Long idCliente) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO WHERE dataEncerramento IS null AND cliente.id = :cliente ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("cliente", idCliente);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     query.setCacheable(true);

     return chamados;
     }

     public Collection<Chamado> listarAbertosPorParticipante(Long idParticipante) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO";
     consulta += " WHERE id in (SELECT chamado.id FROM RAIT_PARTICIPANTE WHERE usuario.id = :idParticipante)";
     consulta += " AND dataEncerramento IS null";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idParticipante", idParticipante);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     query.setCacheable(true);

     return chamados;
     }

     public Collection<Chamado> listarPorDepartamento(Long idDepartamento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO";
     consulta += " WHERE fk_departamento = :idDepartamento";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("idDepartamento", idDepartamento);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     query.setCacheable(true);

     return chamados;
     }

     public Collection<Chamado> listarAbertosPorDepartamento(Long idDepartamento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();

     String consulta = "FROM RAIT_CHAMADO WHERE dataEncerramento IS null";
     if (idDepartamento != null) consulta += " AND fk_departamento = :idDepartamento";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     if (idDepartamento != null) query.setParameter("idDepartamento", idDepartamento);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     query.setCacheable(true);

     return chamados;
     }

     public Collection<Chamado> listarCriticosPorDepartamento(Long idDepartamento) {
     Collection<Chamado> chamados = new ArrayList<Chamado>();
     Calendar dataLimite = new GregorianCalendar(TimeZone.getTimeZone("GMT-3"), new Locale("pt", "BR"));
     dataLimite.add(Calendar.DAY_OF_WEEK, -30);

     String consulta = "FROM RAIT_CHAMADO WHERE dataEncerramento IS null";
     consulta += " AND ( nivel.id = 4 OR dataAbertura <= :dataLimite )";
     if (idDepartamento != null) consulta += " AND fk_departamento = :idDepartamento";
     consulta += " ORDER BY nivel.id DESC, dataAbertura ASC";

     Query query = super.getSession().createQuery(consulta);
     query.setParameter("dataLimite", dataLimite);
     if (idDepartamento != null) query.setParameter("idDepartamento", idDepartamento);

     for(int x = 0; x < query.list().size(); x++) {
     Chamado chamado = (Chamado) query.list().get(x);
     chamados.add(chamado);
     }

     query.setCacheable(true);

     return chamados;
     }

     public Collection<TipoChamado> listarTipoChamado(Long idDepartamento) {
     Collection<TipoChamado> lista = new ArrayList<TipoChamado>();

     String consulta = "SELECT distinct(CAST(b.id as varchar(10))), b.titulo, b.fk_departamento FROM RAIT_CHAMADO a, RAIT_TIPO_CHAMADO b";
     consulta += " WHERE a.fk_tipoChamado = b.id AND a.fk_departamento = :idDepartamento";

     Query query = super.getSession().createSQLQuery(consulta);
     query.setParameter("idDepartamento", idDepartamento);

     for(int x = 0; x < query.list().size(); x++) {
     Object[] item = (Object[]) query.list().get(x);

     TipoChamado tipoChamado = new TipoChamado();
     tipoChamado.setId(Long.parseLong((String) item[0]));
     tipoChamado.setTitulo((String) item[1]);

     lista.add(tipoChamado);
     }

     query.setCacheable(true);
     return lista;
     }
     */
}
