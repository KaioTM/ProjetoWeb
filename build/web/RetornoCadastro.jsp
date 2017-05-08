<%-- 
    Document   : RetornoCadastro
    Created on : 25/04/2017, 23:12:09
    Author     : KaioT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Usuario"%>
<%@page import="DAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <table>
                <c:forEach var="user" items="${UsuarioDAO.consultarTodos}">
                    <tr>
                        <td>${user.nome}</td>
                        <td>${user.sobrenome}</td>
                    </tr>                   
                </c:forEach>
            </table>
            <br>
            Nome: <%= request.getParameter("nome") %>
            <br>
            Sobrenome: <%= request.getParameter("sobrenome") %>
            <br>
            Local de Moradia: <%= request.getParameter("localMoradia") %>
            
            
        </h1>
    </body>
</html>
