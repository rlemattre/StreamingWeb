/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.PersonneDAO;
import streamingweb.dao.PersonneDAOJpaImpl;
import streamingweb.entity.Personne;

/**
 *
 * @author romua
 */
public class PersonneServiceImpl implements PersonneService {

    private PersonneDAO dao = new PersonneDAOJpaImpl();
    
    @Override
    public List<Personne> listerPersonnes() {

        return dao.lister();
    }
    
}
