package com.example.demo.entity;

public class Composition {
    private String guid;
    private int CompositionNum;
    private String Stage;

    public String getStage() {
        return Stage;
    }

    public void setStage(String stage) {
        Stage = stage;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getCompositionNum() {
        return CompositionNum;
    }

    public void setCompositionNum(int compositionNum) {
        CompositionNum = compositionNum;
    }
}
