package com.vuforia.samples.MainApp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.vuforia.samples.MainApp.ui.diseases.DiseasesActivity;
import com.vuforia.samples.MainApp.ui.insects.InsectsActivity;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.app.ImageTargets.ImageTargets;
import com.vuforia.samples.VuforiaSamples.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.goToInsects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InsectsActivity.class));
            }
        });
        binding.goToDiseases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DiseasesActivity.class));
            }
        });

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ImageTargets.class));
            }
        });
    }

}
