package com.vuforia.samples.MainApp.ui.diseases;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.model.Disease;

import java.util.List;

import io.realm.Realm;
import io.realm.Sort;

/**
 * Created by Jansen on 9/13/2017.
 */

public class DiseasesPresenter extends MvpNullObjectBasePresenter<DiseasesView> {
    private Realm realm;

    void onStart(){
        realm = Realm.getDefaultInstance();
    }

   public List<Disease> list(){

       return realm.where(Disease.class).findAllSorted(Constant.ID, Sort.ASCENDING);
   }

   void onStop(){
       realm.close();
   }
}
