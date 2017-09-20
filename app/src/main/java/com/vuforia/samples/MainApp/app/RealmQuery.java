package com.vuforia.samples.MainApp.app;

import com.vuforia.samples.MainApp.model.Disease;
import com.vuforia.samples.MainApp.model.Insect;

import io.realm.Realm;

/**
 * Created by Jansen on 9/20/2017.
 */

public class RealmQuery {

    public static Disease disease(String imageRecogString){
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Disease.class).equalTo("imageRecognition",imageRecogString).findFirst();
    }

    public static Insect insect(String imageRecogString){
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Insect.class).equalTo("imageRecognition",imageRecogString).findFirst();
    }
}
