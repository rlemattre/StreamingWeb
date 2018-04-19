/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streamingweb.entity.Film;

/**
 *
 * @author romua
 */
public class FilmsDAOJpaImpl implements FilmsDAO {

    @Override
    public List<Film> lister() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); // création EM
        
        Query query = em.createQuery("SELECT f FROM Film f"); // requête pour récuper tous les films
        
        List<Film> films = query.getResultList(); // création de la liste de films
        
        return films; // renvoi du résultat
    }

    @Override
    public Film rechercher(long id) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Film.class, id);
    }

    @Override
    public List<Film> ajouter() {

        
        
    }
}
