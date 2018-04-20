/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import static java.util.Collections.list;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streamingweb.entity.Pays;

/**
 *
 * @author romua
 */
public class PaysDAOJpaImpl implements PaysDAO {

    @Override
    public List<Pays> lister() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT p FROM Pays p ORDER BY p.nom");
        
        List<Pays> pays = query.getResultList();
        
        return pays;
    }
    
}
