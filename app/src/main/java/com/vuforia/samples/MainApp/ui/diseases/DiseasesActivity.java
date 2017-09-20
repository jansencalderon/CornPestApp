package com.vuforia.samples.MainApp.ui.diseases;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.view.MenuItem;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.model.Disease;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityDiseaseBinding;

public class DiseasesActivity extends MvpActivity<DiseasesView,DiseasesPresenter> implements DiseasesView{

    ActivityDiseaseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_disease);
        binding.setView(getMvpView());
        presenter.onStart();

        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        DiseasesListAdapter adapter = new DiseasesListAdapter(getMvpView());
        binding.recyclerView.setAdapter(adapter);
        adapter.setList(presenter.list());
    }

    @Override
    public void OnItemClicked(Disease item){
        Intent i = new Intent(this, DiseaseDetail.class);
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
    public DiseasesPresenter createPresenter() {
        return new DiseasesPresenter();
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
