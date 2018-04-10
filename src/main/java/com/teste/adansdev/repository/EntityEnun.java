package com.teste.adansdev.repository;

import com.teste.adansdev.entity.Match;
import com.teste.adansdev.entity.Wrangle;

public enum  EntityEnun {

    MATCH("/json/matches.json", Match.class),
    WRANGLE("/json/wrangle.json", Wrangle.class);

    String pathFile;
    Class typeClass;

    EntityEnun(String pathFile, Class typeClass) {
        this.pathFile = pathFile;
        this.typeClass = typeClass;
    }

    public String getPathFile() {
	    return pathFile;
    }

    public Class getTypeClass() {
        return typeClass;
    }
}