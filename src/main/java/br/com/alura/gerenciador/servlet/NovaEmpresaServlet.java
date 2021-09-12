package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Banco banco = new Banco();
		String nomeEmpresa = request.getParameter("nome");
		String dataCriacaoEmpresa = request.getParameter("data");
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		Empresa empresa;
		try {
			empresa = new Empresa(nomeEmpresa, banco.retornaLista().size()+1, sdf.parse(dataCriacaoEmpresa));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		banco.adicionar(empresa);

		response.sendRedirect("listaEmpresas");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
//		System.out.println("Nova Empresa Cadastrada com sucesso!");
		
		
	}

}
