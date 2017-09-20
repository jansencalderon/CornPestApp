package com.vuforia.samples.MainApp.ui.diseases;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.vuforia.samples.MainApp.model.Disease;

/**
 * Created by Jansen on 9/13/2017.
 */

public interface DiseasesView extends MvpView{
    void OnItemClicked(Disease disease);
}
