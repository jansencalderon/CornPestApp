package com.vuforia.samples.MainApp.app;

import android.app.Application;

import com.vuforia.samples.MainApp.helper.StringHelper;
import com.vuforia.samples.MainApp.model.CornFarming;
import com.vuforia.samples.MainApp.model.Disease;
import com.vuforia.samples.MainApp.model.Insect;
import com.vuforia.samples.VuforiaSamples.R;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize realm configuration
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);

        // setting up data for realm
        final Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.deleteAll();
                realm.createAllFromJson(Insect.class, StringHelper.readRawTextFile(getApplicationContext(), R.raw.insects));
                realm.createAllFromJson(Disease.class, StringHelper.readRawTextFile(getApplicationContext(), R.raw.diseases));
                realm.createAllFromJson(CornFarming.class, StringHelper.readRawTextFile(getApplicationContext(), R.raw.corn_farming));

            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                realm.close();
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                error.printStackTrace();
                realm.close();
            }
        });

    }
}
