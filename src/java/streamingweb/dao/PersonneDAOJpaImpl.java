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
import streamingweb.entity.Personne;

/**
 *
 * @author romua
 */
public class PersonneDAOJpaImpl implements PersonneDAO {

    @Override
    public List<Personne> lister() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT p FROM Personne p ORDER BY p.nom, p.prenom");
        
        List<Personne> personnes = query.getResultList();
        
        return personnes;
    }
    
    
    
}
