/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.panol.studionatural.admin.session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import net.panol.studionatural.entity.User;

/**
 *
 * @author Thilina
 */
public class UserProvider {

    EntityManagerFactory emf;
    EntityManager em;

    public UserProvider() {
        emf = Persistence.createEntityManagerFactory("Studio_NaturalPU");
        em = emf.createEntityManager();
    }

    public User getUser(String uname, String password){
        try {
            
            Query query = em.createQuery("SELECT u FROM User u WHERE u.username=:username AND u.password=:password");
            Object singleResult = query.setParameter("username", uname)
                    .setParameter("password", password)
                    .getSingleResult();

            if (singleResult != null) {
                User u = (User) singleResult;
                if (u != null) {
                    return u;
                }
//                return singleResult;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
