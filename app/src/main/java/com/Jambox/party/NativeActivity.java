package com.Jambox.party;

import static com.Jambox.party.SettingsAlien.BackupNatives;
import static com.Jambox.party.SettingsAlien.MainNatives;
import static com.Jambox.party.SettingsAlien.Select_Backup_Ads;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.aliendroid.alienads.AliendroidNative;

public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);

        RelativeLayout laySmallAds = findViewById(R.id.laySmallNatives);
        AliendroidNative.SmallNativeAlienView(this, laySmallAds,Select_Backup_Ads,MainNatives,BackupNatives);

        RelativeLayout layMediumAds = findViewById(R.id.layMediumNatives);
        AliendroidNative.MediumNativeAlienView(this, layMediumAds,Select_Backup_Ads,MainNatives,BackupNatives);


    }
}