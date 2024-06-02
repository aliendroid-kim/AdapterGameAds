package com.aliendroid.alienads;

import android.app.Activity;
import android.widget.Toast;

import com.aliendroid.sdkads.config.AppsConfig;
import com.jambox.monetisation.JamboxAdsHelper;
import com.jambox.monetisation.WebviewObject;

public class AlienGame {
    public static WebviewObject webview = null;
    public static void LoadGame(Activity activity, String interstitialID, String rewardID,String bannerID ){
        //JamboxAdsHelper.InitializeAds(activity, interstitialID, rewardID, bannerID);
    }
    public static void ShowGame(Activity activity, String gameID){
        if (webview != null) return;
        webview = new WebviewObject(activity, gameID);
        webview.StartWebview();


   }
    public static void  CloseGame(){
        if (webview == null)
            return;

        webview.CloseWebview();
        webview = null;
    }

    public static void LoadGame(Activity activity, String interstitialID, String rewardID,String bannerID, String sdkKey ){
        if (AppsConfig.GAMEKEY.equals(sdkKey)){
            LoadGame(activity, interstitialID, rewardID, bannerID);
        } else {
            Toast.makeText(activity, "Please use the Applovin SDK Key from Jambox Games", Toast.LENGTH_SHORT).show();

        }
    }
}
