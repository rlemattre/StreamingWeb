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
            <h1>${detailsFilm.titre}</h1>
            <br>
            <div> Realisateur(s) : </div>
            <br>
            <div> Année de production : ${detailsFilm.annee}</div>
            <br>
            <div> Acteurs : </div>
            <br>
            <div> Genre : ${detailsFilm.genre.nom}</div>
            <br>
            <div> Pays : <c:forEach items="${detailsFilm.pays}" var="paysChoix"> ${paysChoix.nom} </c:forEach> </div>
            <br>
            <div> Durée (en minutes) : ${detailsFilm.duree}</div>
            <br>
            <div> Synopsis : ${detailsFilm.synopsis}</div>
            <br>
            <div> Lien(s) : </div>
            <br>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
