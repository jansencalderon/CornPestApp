package com.vuforia.samples.MainApp.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jansen on 9/14/2017.
 */

public class Disease extends RealmObject {
    @PrimaryKey
    private int id;
    private String disName;
    private String disDesc;
    private String disManagement;
    private String disSymptoms;
    private String disImage;
    private String disImageRecog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public String getDisDesc() {
        return disDesc;
    }

    public void setDisDesc(String disDesc) {
        this.disDesc = disDesc;
    }

    public String getDisManagement() {
        return disManagement;
    }

    public void setDisManagement(String disManagement) {
        this.disManagement = disManagement;
    }

    public String getDisSymptoms() {
        return disSymptoms;
    }

    public void setDisSymptoms(String disSymptoms) {
        this.disSymptoms = disSymptoms;
    }

    public String getDisImage() {
        return disImage;
    }

    public void setDisImage(String disImage) {
        this.disImage = disImage;
    }

    public String getDisImageRecog() {
        return disImageRecog;
    }

    public void setDisImageRecog(String disImageRecog) {
        this.disImageRecog = disImageRecog;
    }
}
