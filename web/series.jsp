<%-- 
    Document   : _TEMPLATE
    Created on : 17 avr. 2018, 11:57:58
    Author     : romua
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>StreamingWeb</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_ENTETE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <main>
            <h1>Séries</h1>
            <c:forEach items="${listeDesSeries}" var="serieAAfficher">
                ${serieAAfficher.titre}
                <a href="#"
                <br>
            </c:forEach>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
