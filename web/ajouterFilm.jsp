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
            <h1>Ajouter un film</h1>
            
            <form method="POST" > <!-- on ne modifie pas la route ! -->
                
                <label> Saisir le titre </label>
                <input type="text" name="titre">
                <br><br>
                <label> Saisir l'année de production </label>
                <input type="text" name="anneeProduction">
                <br><br>
                <label> Saisir la durée en minutes </label>
                <input type="text" name="duree">
                <br><br>
                <label> Saisir le synopsis </label>
                <textarea  name="synopsis"></textarea>
                <br><br>
                <label> Choisir le genre </label>
                <select name="genre">
                    <c:forEach items="${listeDesGenres}" var="genreChoix">
                        <option value="${genreChoix.id}">${genreChoix.nom}</option>
                    </c:forEach>
                </select>
                <br><br>
                <input type="submit">
                <br><br>
                
            </form>
                
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
