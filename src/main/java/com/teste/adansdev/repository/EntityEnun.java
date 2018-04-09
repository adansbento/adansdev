package com.teste.adansdev.repository;

public enum  EntityEnun {

    MATCH("/json/matches.json"), WRANGLE("/json/wrangle.json");
    String pathFile;

    EntityEnun(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getPathFile() {
	return pathFile;
    }
}