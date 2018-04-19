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
            <div> Realisateur(s) : <br>
                <c:forEach items="${detailsFilm.realisateurs}" var="realisateurChoix"> &nbsp;&nbsp;&nbsp; - ${realisateurChoix.prenom} ${realisateurChoix.nom} <br> </c:forEach>
            </div>
            <br>
            <div> Année de production : ${detailsFilm.annee}</div>
            <br>
            <div> Acteurs : <br>
                <c:forEach items="${detailsFilm.acteurs}" var="acteurChoix"> &nbsp;&nbsp;&nbsp; - ${acteurChoix.prenom} ${acteurChoix.nom} <br> </c:forEach>
            </div>
            <br>
            <div> Genre : ${detailsFilm.genre.nom}</div>
            <br>
            <div> Pays : <br> 
                <c:forEach items="${detailsFilm.pays}" var="paysChoix"> &nbsp;&nbsp;&nbsp; - ${paysChoix.nom} </c:forEach> <br> 
            </div>
            <br>
            <div> Durée (en minutes) : ${detailsFilm.duree}</div>
            <br>
            <div> Synopsis : ${detailsFilm.synopsis}</div>
            <br>
            <div> Lien(s) : <br>
                <c:forEach items="${detailsFilm.lienList}" var="lienChoix"> &nbsp;&nbsp;&nbsp; - Langue : ${lienChoix.langue} Qualité : ${lienChoix.qualite} <a href="${lienChoix.url}"> <button> Lien </button> </a> <br> </c:forEach></div>
            <br>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
