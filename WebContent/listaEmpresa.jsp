<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url  value="/novaEmpresa" var="linkServletEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
	 <c:forEach var="empresa" items="${listaDeEmpresas}" >
	 
	 <fmt:formatDate value="${empresa.dataDeAbertura}" pattern="dd/MM/YYYY" var="dataDeAbertura"/>
	 	<li>
	 	${empresa.nome} - ${dataDeAbertura }
	 	<a href="/gerenciador/removeEmpresa?id=${empresa.id}"> Remover</a>
	 	<a href="/gerenciador/mostrarEmpresa?id=${empresa.id}"> Alterar</a>
	 	</li>
	 	
	 </c:forEach>
	</ul>
	
</body>
</html>