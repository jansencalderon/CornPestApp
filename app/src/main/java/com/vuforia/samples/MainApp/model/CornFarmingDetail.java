package com.vuforia.samples.MainApp.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jansen on 9/14/2017.
 */

public class CornFarmingDetail extends RealmObject {

    public static final String COL_SEQ = "sequence";
    @PrimaryKey
    private int id;
    private int cfId;
    private String content;
    private int sequence;
    private String type;

    public static String getColSeq() {
        return COL_SEQ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCfId() {
        return cfId;
    }

    public void setCfId(int cfId) {
        this.cfId = cfId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
