package com.example.demo.entity;

import java.io.Serializable;

public class TypeEntity implements Serializable {
    private String QUESTYPE_CODE;
    private String QUESTYPE_NAME;
    private String NewProperty;
    private String Name;
    private String GenreCode;
    private String GenreName;

    public String getGenreCode() {
        return GenreCode;
    }

    public void setGenreCode(String genreCode) {
        GenreCode = genreCode;
    }

    public String getGenreName() {
        return GenreName;
    }

    public void setGenreName(String genreName) {
        GenreName = genreName;
    }

    public String getNewProperty() {
        return NewProperty;
    }

    public void setNewProperty(String newProperty) {
        NewProperty = newProperty;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQUESTYPE_CODE() {
        return QUESTYPE_CODE;
    }

    public void setQUESTYPE_CODE(String QUESTYPE_CODE) {
        this.QUESTYPE_CODE = QUESTYPE_CODE;
    }

    public String getQUESTYPE_NAME() {
        return QUESTYPE_NAME;
    }

    public void setQUESTYPE_NAME(String QUESTYPE_NAME) {
        this.QUESTYPE_NAME = QUESTYPE_NAME;
    }
}
