package com.vuforia.samples.MainApp.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jansen on 9/13/2017.
 */

public class Insect extends RealmObject {

    @PrimaryKey
    private Integer id;
    private String insectName;
    private String insectDesc;
    private String insectTime;
    private String insectSampling;
    private String insectThreshold;
    private String insectManagement;
    private String insectImage;
    private String imageRecognition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInsectName() {
        return insectName;
    }

    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }

    public String getInsectDesc() {
        return insectDesc;
    }

    public void setInsectDesc(String insectDesc) {
        this.insectDesc = insectDesc;
    }

    public String getInsectTime() {
        return insectTime;
    }

    public void setInsectTime(String insectTime) {
        this.insectTime = insectTime;
    }

    public String getInsectSampling() {
        return insectSampling;
    }

    public void setInsectSampling(String insectSampling) {
        this.insectSampling = insectSampling;
    }

    public String getInsectThreshold() {
        return insectThreshold;
    }

    public void setInsectThreshold(String insectThreshold) {
        this.insectThreshold = insectThreshold;
    }

    public String getInsectManagement() {
        return insectManagement;
    }

    public void setInsectManagement(String insectManagement) {
        this.insectManagement = insectManagement;
    }

    public String getInsectImage() {
        return insectImage;
    }

    public void setInsectImage(String insectImage) {
        this.insectImage = insectImage;
    }

    public String getImageRecognition() {
        return imageRecognition;
    }

    public void setImageRecognition(String imageRecognition) {
        this.imageRecognition = imageRecognition;
    }
}
