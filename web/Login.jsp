<%-- 
    Document   : Login
    Created on : 22 juil. 2022, 15:57:30
    Author     : fssy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body id="blogin">
        <div>
            <table>
                  <p>
                     <label for="pseudo">Login : </label>
                    <input type="text" name="speudo" id="speudo" />
               </p>
                <p>
                     <label for="Mot de passe">Mot de passe : </label>
                    <input type="password" name="mot de passe" id="mot de passe" />
                </p>

                <input class ="boco" type="submit" value="Se connecter"> 
            <h3>Pas de compte ?    <a href="Monservlet1"> <button>Inscription</button></a></h3>
               
        </div>
    </body>
</html>
