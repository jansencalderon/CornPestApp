package com.vuforia.samples.MainApp.ui.cornFarming.details;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.model.CornFarming;

import java.util.List;

import io.realm.Realm;
import io.realm.Sort;

/**
 * Created by Jansen on 9/13/2017.
 */

public class CornFarmingDetailsPresenter extends MvpNullObjectBasePresenter<CornFarmingDetailsView> {
    private Realm realm;

    void onStart(){
        realm = Realm.getDefaultInstance();
    }

   public List<CornFarming> list(){

       return realm.where(CornFarming.class).findAllSorted(Constant.ID, Sort.ASCENDING);
   }

   void onStop(){
       realm.close();
   }
}
