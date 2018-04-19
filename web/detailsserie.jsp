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
            <h1>${detailsSerie.titre}</h1>
            <br>
            <div> Réalisateur(s) : <br>
                <c:forEach items="${detailsSerie.realisateurs}" var="realisateurChoix"> &nbsp;&nbsp;&nbsp; - ${realisateurChoix.nom} ${realisateurChoix.prenom} <br> </c:forEach>
            </div>
            <br>
            <div> Pays : <br>
                <c:forEach items="${detailsSerie.paysList}" var="paysChoix"> &nbsp;&nbsp;&nbsp; - ${paysChoix.nom} <br> </c:forEach>
            </div>
            <br>
            <div> Synopsis : ${detailsChoix.synopsis} </div>
            </div>
            <br>
            <div> Acteur(s) : <br>
                <c:forEach items="${detailsSerie.acteurs}" var="acteurChoix"> &nbsp;&nbsp;&nbsp; - ${acteurChoix.nom} ${acteurChoix.prenom} <br> </c:forEach>
            </div>
            <br>
            <div> Genre : ${detailsSerie.genre.nom} </div>
            <br>
            <div> Lien(s) : <br>
                <c:forEach items="${detailsSerie.saisonList}" var="saisonChoix"> &nbsp;&nbsp;&nbsp; - Saison ${saisonChoix.numsaison} : <br>
                    <c:forEach items="${saisonChoix.episodeList}" var="episodeChoix"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - Episode ${episodeChoix.numepisode} Titre ${episodeChoix.titre} : <br>
                        <c:forEach items="${episodeChoix.lienList}" var="lienChoix"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- ${lienChoix.url}- Langue : ${lienChoix.langue} Qualité : ${lienChoix.qualite} <a href="${lienChoix.url}"> <button> Lien </button> </a> <br> </c:forEach>
                    </c:forEach>    
                </c:forEach>
            </div>
            <br>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
