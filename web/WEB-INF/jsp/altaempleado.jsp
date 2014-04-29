<%-- 
    Document   : altaempleado
    Created on : 29-abr-2014, 21:06:29
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="tags.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        
        <form:form method="post" commandName="empleado">
            <label>Nombre:</label>
            <form:input path="nombre"/>
            <form:errors paht="nombre"/>
            <br>
            <label>Salario:</label>
            <form:input path="salario"/>
            <form:errors paht="salario"/>
            
            <input type="submit" value="OK">
        </form:form>
        
        
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
