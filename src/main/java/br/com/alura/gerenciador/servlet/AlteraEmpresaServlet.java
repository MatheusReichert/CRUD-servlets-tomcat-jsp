package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraEmpresaServlet
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		Banco banco = new Banco();
		
		String nomeEmpresa = req.getParameter("nome");
		String dataCriacaoEmpresa = req.getParameter("data");
		Integer id = Integer.parseInt(req.getParameter("id").toString());
		
	
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		Empresa empresa;
		Date dataDeAbertura; 
		try {
			dataDeAbertura = sdf.parse(dataCriacaoEmpresa);
			empresa = new Empresa(nomeEmpresa, id, dataDeAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		banco.buscaEmpresaId(id).setDataDeAbertura(dataDeAbertura);
		banco.buscaEmpresaId(id).setNome(nomeEmpresa);
		
		resp.sendRedirect("/gerenciador/listaEmpresas");
		
		
		
			
		}

}
