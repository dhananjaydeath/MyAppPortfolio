package com.example.dhana.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;
    CharSequence text;
    int duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the popular movies button */
    public void showPopularMoviesApp(View view){
        context = getApplicationContext();
        text = "This button will launch my popular movies app!";
        duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the stock hawk button */
    public void showStockHawkApp(View view){
        context = getApplicationContext();
        text = "This button will launch my stock hawk app!";
        duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the build it bigger button */
    public void showBuildItBiggerApp(View view){
        context = getApplicationContext();
        text = "This button will launch my build it bigger app!";
        duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the make your app material button */
    public void showMakeYourAppMaterialApp(View view){
        context = getApplicationContext();
        text = "This button will launch my make your app material app!";
        duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the go ubiquitous button */
    public void showGoUbiquitousApp(View view){
        context = getApplicationContext();
        text = "This button will launch my go ubiquitous app!";
        duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the capstone button */
    public void showCapstoneApp(View view){
        context = getApplicationContext();
        text = "This button will launch my capstone app!";
        duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
