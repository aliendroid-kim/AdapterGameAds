plugins {
    alias(libs.plugins.androidLibrary)
    id("maven-publish")
}

android {
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.aliendroid.alienads"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    implementation ("androidx.appcompat:appcompat:1.4.1")
    implementation ("com.google.android.material:material:1.8.0")
    implementation ("androidx.multidex:multidex:2.0.1")
    //implementation fileTree(include: ['*.jar', '*.aar'], dir: 'libs")
    //Main Sdk Ads
    implementation ("com.google.android.gms:play-services-ads:23.1.0")
    implementation ("com.facebook.android:audience-network-sdk:6.17.0")
    implementation ("com.applovin:applovin-sdk:12.5.0")
    implementation ("com.startapp:inapp-sdk:5.0.0")
    implementation ("com.unity3d.ads:unity-ads:4.12.0")

    //Applovin
    implementation ("com.applovin.mediation:facebook-adapter:6.17.0.0")
    implementation ("com.applovin.mediation:google-adapter:23.1.0.0")
    implementation ("com.applovin.mediation:unityads-adapter:4.12.0.0")

    //Admob
    implementation ("com.google.ads.mediation:facebook:6.17.0.0")
    implementation ("com.google.ads.mediation:applovin:12.5.0.1")
    implementation ("com.google.ads.mediation:unity:4.12.0.0")
    implementation("com.google.android.ump:user-messaging-platform:2.2.0")
    implementation ("com.google.android.gms:play-services-appset:16.1.0")
    implementation ("com.google.android.gms:play-services-ads-identifier:18.1.0")
    implementation ("com.google.android.gms:play-services-basement:18.4.0")
    implementation ("com.startapp:admob-mediation:2.9.1")
    implementation ("com.startapp:applovin-mediation:1.1.7")
    implementation ("com.github.ronaldwm2:alienads_propssdk:1.1.1")
    implementation ("com.github.aliendroid-kim:SDKGames:1.0.10")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation ("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")
}

android {
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                groupId = "com.github.aliendroid-kim"
                artifactId = "AdapterGameAds"
                version = "Titan-13"

                from(components["release"])

                //com.github.jamboxgames:monetise-sdk:1.2.1
                //https://github.com/aliendroid-kim/SDKGames
            }
        }
    }
}
