package com.vuforia.samples.MainApp.ui.cornFarming;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.model.CornFarming;
import com.vuforia.samples.MainApp.ui.cornFarming.details.CornFarmingDetailsActivity;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityCornFarmingBinding;

public class CornFarmingActivity extends MvpActivity<CornFarmingView, CornFarmingPresenter> implements CornFarmingView {

    ActivityCornFarmingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_corn_farming);
        binding.setView(getMvpView());
        presenter.onStart();

        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CornFarmingListAdapter adapter = new CornFarmingListAdapter(getMvpView());
        binding.recyclerView.setAdapter(adapter);
        adapter.setList(presenter.list());
    }

    @Override
    public void OnItemClicked(CornFarming item) {
        Intent i = new Intent(this, CornFarmingDetailsActivity.class);
        i.putExtra(Constant.ID, item.getId());
        startActivity(i);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onStop();
    }

    @NonNull
    @Override
    public CornFarmingPresenter createPresenter() {
        return new CornFarmingPresenter();
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
}
