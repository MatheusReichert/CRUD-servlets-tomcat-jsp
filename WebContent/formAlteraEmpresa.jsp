<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url  value="/alteraEmpresa" var="linkServletEmpresa"/> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${linkServletEmpresa}" method="post">
	
		Nome: <input type="text" name="nome" value="${empresa.nome }" />
		
		<fmt:formatDate value="${empresa.dataDeAbertura }" pattern="dd/MM/YYYY" var="dataDeAbertura"/>
		
		Data Abertura: <input type="text" name="data" value="${dataDeAbertura}" />
		<input type="hidden" name="id" value="${empresa.id}"/>
		<input type="submit" value="Enviar" />
		
	</form>

</body>
</html>