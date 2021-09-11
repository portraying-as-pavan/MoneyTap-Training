package com.moneytap.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Insurance {
    @Id
    private int insId;
    private String insName;
    private String insType;


    public Insurance(int insId, String insName, String insType) {
        this.insId = insId;
        this.insName = insName;
        this.insType = insType;
    }

    public Insurance() {
    }

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getInsType() {
        return insType;
    }

    public void setInsType(String insType) {
        this.insType = insType;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insId=" + insId +
                ", insName='" + insName + '\'' +
                ", insType='" + insType + '\'' +
                '}';
    }
}
