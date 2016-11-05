package com.example.wington.actionbarsetting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onTest(MenuItem mi){
        //Toast.makeText(this,"Dale Clicked",Toast.LENGTH_SHORT).show();
        User user = new User("Manuel","Red");

        //Explicit Intent
        Intent secondActIntent = new Intent(this,SecondActivity.class);
        secondActIntent.putExtra("text","De 2nd to 1st");
        secondActIntent.putExtra("visible",true);
        secondActIntent.putExtra("user",user);
        startActivity(secondActIntent);

        //Implicit
//        String url = "http://www.thecodepath.com";
//        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//        startActivity(i);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
