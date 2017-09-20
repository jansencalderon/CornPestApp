package com.vuforia.samples.MainApp.ui.insects;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.vuforia.samples.MainApp.model.Insect;

/**
 * Created by Jansen on 9/13/2017.
 */

public interface InsectsView extends MvpView{
    void OnItemClicked(Insect insect);
}
