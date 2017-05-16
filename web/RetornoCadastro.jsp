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
        <title>Redirecionando...</title>
    </head>
    <body>
        <h1>
            <h1> Usuário cadastrado com sucesso!</h1><br/>
            Redirecionando para o login...
            <meta http-equiv=refresh content=6;URL="login.jsp" />
            
            
        </h1>
    </body>
</html>
