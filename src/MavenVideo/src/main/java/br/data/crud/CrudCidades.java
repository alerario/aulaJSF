/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alexandre
 */
public class CrudCidades {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("br_MavenVideo_war_1.0-SNAPSHOTPU");

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
      public void remove(br.data.entity.Cidades cidade) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            br.data.entity.Cidades cid;
            cid = em.find(br.data.entity.Cidades.class, cidade.getCodigo());
            em.remove(cid);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
      
       public void merge(br.data.entity.Cidades cidade) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            br.data.entity.Cidades cid;
            cid = em.find(br.data.entity.Cidades.class, cidade.getCodigo());
            cid.setNome(cidade.getNome());
            em.merge(cid);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
      
    public java.util.Collection<br.data.entity.Cidades> getAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return  em.createNamedQuery("Cidades.findAll").getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
           // em.getTransaction().rollback();
           return null;
        } finally {
            em.close();
        }
    }
    
}
