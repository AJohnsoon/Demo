package com.example.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.domain.Pessoa;

public class program {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(null, "Alex Green", "alex@test.com");
        Pessoa p2 = new Pessoa(null, "Carlo White", "carlo@test.com");
        Pessoa p3 = new Pessoa(null, "Nikola Red", "nikola@test.com");

        EntityManagerFactory eManagerfactory = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager eManager = eManagerfactory.createEntityManager();

        eManager.getTransaction().begin();

        eManager.persist(p1);
        eManager.persist(p2);
        eManager.persist(p3);
        
        eManager.getTransaction().commit();

        System.out.println("Done!");
        eManager.close();

    }
}
