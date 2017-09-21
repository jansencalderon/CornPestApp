package com.vuforia.samples.MainApp.ui.cornFarming.details;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.helper.ResourceHelper;
import com.vuforia.samples.MainApp.model.CornFarming;
import com.vuforia.samples.MainApp.model.CornFarmingDetail;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityCornFarmingDetailBinding;

import java.util.List;

import io.realm.Realm;

/**
 * Created by Jansen on 9/21/2017.
 */

public class CornFarmingDetailsActivity extends MvpActivity<CornFarmingDetailsView, CornFarmingDetailsPresenter> implements CornFarmingDetailsView {

    ActivityCornFarmingDetailBinding binding;
    Realm realm;
    private LinearLayoutManager layoutManager;
    private String TAG = CornFarmingDetailsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_corn_farming_detail);
        realm = Realm.getDefaultInstance();


        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

        realm = Realm.getDefaultInstance();
        CornFarming cornFarming = realm.where(CornFarming.class).equalTo(Constant.ID, getIntent().getIntExtra(Constant.ID, 0)).findFirst();
        binding.toolbar.setTitle(cornFarming.getCfName());
        binding.toolbarLayout.setTitle(cornFarming.getCfName());
        Glide.with(this)
                .load(ResourceHelper.getDrawableResourceId(this,cornFarming.getCfImage()))
                .centerCrop()
                .into(binding.imageView);
        // RealmResults<CornFarmingDetail> cornFarmingDetailRealmResults = realm.where(CornFarmingDetail.class).equalTo("cfId", getIntent().getIntExtra(Constant.ID, 0)).findAll();
        CornFarmingDetailsListAdapter listAdapter = new CornFarmingDetailsListAdapter(getMvpView());

        List<CornFarmingDetail> cornFarmingDetailList = cornFarming.getCornFarmingDetails().sort(CornFarmingDetail.COL_SEQ);
        if (cornFarmingDetailList.isEmpty()) {
            finish();
        } else {
            List<CornFarmingDetail> details = realm.copyFromRealm(cornFarmingDetailList);
            listAdapter.setLessonDetails(details);
            binding.recyclerView.setAdapter(listAdapter);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    @NonNull
    @Override
    public CornFarmingDetailsPresenter createPresenter() {
        return new CornFarmingDetailsPresenter();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void OnItemClicked(CornFarming cornFarming) {

    }
}
