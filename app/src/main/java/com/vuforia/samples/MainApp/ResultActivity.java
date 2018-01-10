package com.vuforia.samples.MainApp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.bumptech.glide.Glide;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.app.RealmQuery;
import com.vuforia.samples.MainApp.helper.ResourceHelper;
import com.vuforia.samples.MainApp.model.Disease;
import com.vuforia.samples.MainApp.model.Insect;
import com.vuforia.samples.MainApp.ui.diseases.DiseaseDetail;
import com.vuforia.samples.MainApp.ui.insects.InsectDetail;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;
    String resultType;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result);

        id = getIntent().getIntExtra(Constant.ID, -1);
        if (id == -1) {
            finish();
        }
        resultType = getIntent().getStringExtra(Constant.TYPE);

        binding.readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultType.equals("insect")) {
                    Intent i = new Intent(ResultActivity.this, InsectDetail.class);
                    i.putExtra(Constant.ID, id);
                    startActivity(i);
                } else if (resultType.equals("disease")) {
                    Intent i = new Intent(ResultActivity.this, DiseaseDetail.class);
                    i.putExtra(Constant.ID, id);
                    startActivity(i);
                }

            }
        });

        if (resultType.equals("insect")) {
            Insect insect = RealmQuery.insectID(id);
            binding.resultName.setText("Scan Result:\n"+insect.getInsectName());
            Glide.with(this)
                    .load(ResourceHelper.getDrawableResourceId(this, insect.getInsectImage()))
                    .centerCrop()
                    .into(binding.imageView);
        } else if (resultType.equals("disease")) {
            Disease disease = RealmQuery.diseaseID(id);
            binding.resultName.setText("Scan Result:\n"+ disease.getDisName());

            Glide.with(this)
                    .load(ResourceHelper.getDrawableResourceId(this, disease.getDisImage()))
                    .centerCrop()
                    .into(binding.imageView);
        }

        binding.scanAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
