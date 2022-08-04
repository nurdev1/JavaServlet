<%-- 
    Document   : Inscrire.jsp
    Created on : 22 juil. 2022, 14:35:39
    Author     : fssy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Inscrire</title>
    </head>
    <body >
        <p>
            <h3>S’inscrire<br>
                C’est rapide et facile.</h3>
        </p>
        
        
        <div id="bodyinscrire">
            <form  action="Monservlet" method="post">
          
                <p>
                    <label for="nom">Nom : </label>
                    <input type="text" name="nom" id="nom"  />
             </p>
             <p>
               
                     <label for="prénom">Prénom : </label>
                     <input type="text" name="prénom" id="prénom"  />
                
             </p>
             
                <p>
                     <label for="pseudo">Speudo : </label>
                    <input type="text" name="speudo" id="speudo"  />
               </p>
        
             <p>
                   <label for="email">Email : </label>
                   <input type="email" name="email" id="email"  />
              </p> 
                
                <p>
                     <label for="Mot de passe">Mot de passe : </label>
                     <input type="password" name="mot de passe" id="mot de passe"  />
                </p>
                
                   <p>
                    <label for="répéter le mot de passe">Répéter le mot de passe : </label>
                    <input type="password" name="répéter le mot de passe" id="répéter le mot de passe"  />
                 </p>
                
                <input class="boen" colspan="3" width="560" align="center" height="58" valign="top" type="submit" />
         
                </form>
        </div>
        
    </body>
</html>
