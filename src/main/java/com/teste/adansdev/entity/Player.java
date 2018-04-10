package com.teste.adansdev.entity;

import java.io.Serializable;

public class Player implements Serializable{

    public Player(){}

    private String name;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
