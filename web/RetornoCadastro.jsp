<%-- 
    Document   : RetornoCadastro
    Created on : 25/04/2017, 23:12:09
    Author     : KaioT
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            
            ID: <%= request.getParameter("id") %>
            <br>
            Nome: <%= request.getParameter("nome") %>
            <br>
            Sobrenome: <%= request.getParameter("sobrenome") %>
            <br>
            Local de Moradia: <%= request.getParameter("localMoradia") %>
            
            
        </h1>
    </body>
</html>
