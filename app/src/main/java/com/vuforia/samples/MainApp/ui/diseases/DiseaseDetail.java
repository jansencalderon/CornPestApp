package com.vuforia.samples.MainApp.ui.diseases;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.helper.ResourceHelper;
import com.vuforia.samples.MainApp.model.Disease;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityDiseaseDetailBinding;

import io.realm.Realm;

public class DiseaseDetail extends AppCompatActivity {

    ActivityDiseaseDetailBinding binding;
    Realm realm;
    Disease item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_disease_detail);
        realm = Realm.getDefaultInstance();


        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        item = realm.where(Disease.class).equalTo(Constant.ID, getIntent().getIntExtra(Constant.ID, 0)).findFirst();
        binding.setItem(item);
        Glide.with(this)
                .load(ResourceHelper.getDrawableResourceId(this,item.getDisImage()))
                .centerCrop()
                .into(binding.imageView);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
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
