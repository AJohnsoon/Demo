package com.example.application;

import com.example.util.DBManager;

public class program {
    public static void main(String[] args){
        DBManager.createEntityDB("Bob Brown", "bbrown@test.com");
        DBManager.findEntityDB(6);
    }
}
