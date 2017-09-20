package com.vuforia.samples.MainApp.ui.insects;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.model.Insect;

import java.util.List;

import io.realm.Realm;
import io.realm.Sort;

/**
 * Created by Jansen on 9/13/2017.
 */

public class InsectsPresenter extends MvpNullObjectBasePresenter<InsectsView> {
    private Realm realm;

    void onStart(){
        realm = Realm.getDefaultInstance();
    }

   public List<Insect> insectList(){

       return realm.where(Insect.class).findAllSorted(Constant.ID, Sort.ASCENDING);
   }

   void onStop(){
       realm.close();
   }
}
