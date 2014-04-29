<%-- 
    Document   : puestos
    Created on : 25-abr-2014, 19:26:00
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Puestos</title>
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body style="padding: 10px">
        <div class="col-xs-10 col-sm-8 col-md-6 col-lg-5">
            
            <h3>Listado de puestos a dia <fmt:formatDate value="${fecha}"/></h3>
            <table class="table table-bordered">
                <thead>
                    <tr class="success">
                        <th>Nombre</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${puestos}" var="p">
                    <tr>
                        <td>${p.nombre}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            
        </div>
        
        
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
