package com.vuforia.samples.MainApp.ui.cornFarming.details;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.vuforia.samples.MainApp.model.CornFarming;

/**
 * Created by Jansen on 9/13/2017.
 */

public interface CornFarmingDetailsView extends MvpView{
    void OnItemClicked(CornFarming cornFarming);
}
