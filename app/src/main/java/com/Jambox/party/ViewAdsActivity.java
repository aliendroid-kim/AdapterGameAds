package com.Jambox.party;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aliendroid.sdkads.config.AppPromote;

public class ViewAdsActivity extends AppCompatActivity {
      /*
      Implementation for Alien View Ads
       */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ads);
        AppPromote.initializeAppPromote(this);


    }

    public void OPENADS(View view){

    }

    public void INTERSTITIAL(View view){


    }

    public void REWARDS(View view){

    }
}