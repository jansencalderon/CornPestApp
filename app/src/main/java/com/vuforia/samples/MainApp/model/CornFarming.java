package com.vuforia.samples.MainApp.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jansen on 9/14/2017.
 */

public class CornFarming extends RealmObject{

    @PrimaryKey
    private Integer id;
    private String cfName;
    private String cfImage;
    private RealmList<CornFarmingDetail> cornFarmingDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCfName() {
        return cfName;
    }

    public void setCfName(String cfName) {
        this.cfName = cfName;
    }

    public String getCfImage() {
        return cfImage;
    }

    public void setCfImage(String cfImage) {
        this.cfImage = cfImage;
    }

    public RealmList<CornFarmingDetail> getCornFarmingDetails() {
        return cornFarmingDetails;
    }

    public void setCornFarmingDetails(RealmList<CornFarmingDetail> cornFarmingDetails) {
        this.cornFarmingDetails = cornFarmingDetails;
    }
}
