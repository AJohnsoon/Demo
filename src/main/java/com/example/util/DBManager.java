package com.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.domain.Pessoa;

public class DBManager {
    private static EntityManagerFactory eManagerfactory = Persistence.createEntityManagerFactory("exemplo-jpa");
    private static EntityManager eManager = eManagerfactory.createEntityManager();

    public static void findEntityDB(Integer id){
        Pessoa pPessoa = eManager.find(Pessoa.class, id);

        System.out.println(pPessoa);
    }

    public static void createEntityDB(String name, String mail){

        Pessoa pessoa = new Pessoa(null, name, mail);

        eManager.getTransaction().begin();

        eManager.persist(pessoa);        
        eManager.getTransaction().commit();

        System.out.println("Done! You have been created a new data.");
        eManager.close();

    }

    
}
