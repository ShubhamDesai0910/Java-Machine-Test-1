package com.java.crud.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "CATEGORY_TBL")
    public class Category {

        @Id
        @GeneratedValue
        private int id;
        private String name;
        private int quantity;
        private double price;




    }
