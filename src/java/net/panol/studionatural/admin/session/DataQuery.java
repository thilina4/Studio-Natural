/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.panol.studionatural.admin.session;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import net.panol.studionatural.entity.User;

/**
 *
 * @author Thilina
 */
public class DataQuery {

    EntityManagerFactory emf;
    EntityManager em;

    public DataQuery() {
        emf = Persistence.createEntityManagerFactory("Studio_NaturalPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public boolean loginControl(String username, String password) {
        System.out.println(username + "  " + password);
        try {
            Query query = em.createQuery("SELECT u FROM User u WHERE u.username = :username and u.password = :password");
            Object singleResult = query.setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
            if (singleResult != null) {
                User u = (User) singleResult;
                if (u != null) {
                    return true;
                }
            }

            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
