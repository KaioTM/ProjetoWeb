<%-- 
    Document   : login
    Created on : 16/05/2017, 13:41:23
    Author     : KaioT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Login</title>
    </head>
    <body>
        <h1>Página de Login</h1><br/>
        <form action="autenticador" method="post">
            <label>Login:</label>
            <input name="login" type="text"/><br/>
            <label>Senha:</label>
            <input name="senha" type="password"/><br/>
            <input type="submit" value="Sign in"/>
            <a href="Cadastro.xhtml">Sign up</a>
        </form>
    </body>
</html>
