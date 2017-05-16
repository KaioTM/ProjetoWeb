<%-- 
    Document   : home
    Created on : 16/05/2017, 14:56:58
    Author     : KaioT
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Bem vindo, 
            <%Usuario usuarioAutenticado = (Usuario)session.getAttribute("usuarioAutenticado");
            out.print(usuarioAutenticado.getNome());%>
        </h1>
        
        
    </body>
</html>
