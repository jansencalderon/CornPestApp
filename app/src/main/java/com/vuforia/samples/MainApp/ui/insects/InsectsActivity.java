package com.vuforia.samples.MainApp.ui.insects;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.model.Insect;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityInsectsBinding;

public class InsectsActivity extends MvpActivity<InsectsView,InsectsPresenter> implements InsectsView{

    ActivityInsectsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_insects);
        binding.setView(getMvpView());
        presenter.onStart();

        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        binding.recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        binding.recyclerView.setLayoutManager(layoutManager);
        InsectsListAdapter adapter = new InsectsListAdapter(getMvpView());
        binding.recyclerView.setAdapter(adapter);
        adapter.setList(presenter.insectList());
    }

    @Override
    public void OnItemClicked(Insect insect){
        Intent i = new Intent(this, InsectDetail.class);
        i.putExtra(Constant.ID, insect.getId());
        startActivity(i);
    }

    @NonNull
    @Override
    public InsectsPresenter createPresenter() {
        return new InsectsPresenter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onStop();
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
