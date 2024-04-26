<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 27/02/2024
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%! int nombreVisites = 0; %>

<%
    Date date = new Date();
    nombreVisites++;
%>
<form action="hello-servlet" method="POST">
    <label for="textpost"> Nom1: </label>
    <input type="text" id="textpost" name="textpost">
    <input type="submit" value="Envoyer" >
</form>

<br>
<form action="hello-servlet" method="GET">
<label for="textget">Nom2:</label>
    <input type="text" id="textget" name="textget">
    <input type="submit" value="Envoyer">
</form>
<a href="hello-servlet">Hello Servlet</a>
<p>Au moment de l'exécution de ce script, nous sommes le <%= date %>.</p>
<p>Cette page a été affichée <%= nombreVisites %> fois!</p>
<br>
</body>
</html>
