/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author romua
 */
@Entity
@Table(name = "PAYS")
@NamedQueries({
    @NamedQuery(name = "Pays.findAll", query = "SELECT p FROM Pays p")})
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOM")
    private String nom;
    @JoinTable(name = "PAYS_SERIE", joinColumns = {
        @JoinColumn(name = "PAYS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "SERIESPRODUITS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<Serie> serieList;
    @JoinTable(name = "PAYS_FILM", joinColumns = {
        @JoinColumn(name = "PAYS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "FILMSPRODUITS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<Film> films;

    public Pays() {
    }

    public Pays(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Serie> getSerieList() {
        return serieList;
    }

    public void setSerieList(List<Serie> serieList) {
        this.serieList = serieList;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> Films) {
        this.films = films;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streamingweb.entity.Pays[ id=" + id + " ]";
    }
    
}
