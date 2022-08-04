<%-- 
    Document   : Accueil.jsp
    Created on : 22 juil. 2022, 14:36:59
    Author     : fssy
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.octect.beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body id="baccueil">
        
       <%  //HttpSession sess=request.getSession();
		User us = (User) session.getAttribute("lis");
	%>
	<h2> Bienvenue <% out.print(us.getNom()); %></h2>
	
	<p> La liste des utilisateurs sont: </p>
	
	<% 
	
	  List<User> list = (ArrayList<User>) session.getAttribute("list");
	%>
	<table>
		<% for(User user : list){%>
		<tr>
			<td><%= user.getNom() %> |</td>
			<td><%= user.getPrenom() %> |</td>
			<td><%= user.getSpeudo() %> |</td>
			<td><%= user.getEmail() %></td>
		</tr>	
	<%} %>
	</table>
	<form method="post" action="Login">
	<td colpsan="2">
		<!-- <input type="submit" name="" value="Déconnecter">-->
		<a href="/MonServletJsp/Monservlet2">Déconnecter</a>
	</td>
	</form>
             
            </div>
        </main>

                
                
                
                
                
                <style>
                    .main
                    {
                        border: 2px solid blue;
                        margin: 45px auto; width: 70%;
                    }
                    .menu
                    {
                        border-bottom: 2px solid green;
                    }
                   
                    
                    .matable table,td
                    {
                        border: 1px solid;
                        border-collapse: collapse;
                        
                    }
                    .matable table
                    {
                        width: 65%;margin: 10px auto;
                    }
                </style>
    </body>
</html>
