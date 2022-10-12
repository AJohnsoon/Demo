package com.example.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.domain.Pessoa;
import com.example.util.DBManager;

public class program {
    public static void main(String[] args){
        DBManager.createEntityDB("Bob Brown", "bbrown@test.com");
        DBManager.findEntityDB(6);
    }
}
