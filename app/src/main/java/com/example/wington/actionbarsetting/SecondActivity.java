package com.example.wington.actionbarsetting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvLabel = (TextView) findViewById(R.id.lvLabel);
        String recText = getIntent().getStringExtra("text");
//        tvLabel.setText(recText);
        User user = (User) getIntent().getSerializableExtra("user");
        String userValue = user.name + user.color;
        tvLabel.setText(userValue);
        boolean visible = getIntent().getBooleanExtra("visible",true);

        if(!visible){
            tvLabel.setVisibility(View.INVISIBLE);
        }

    }
}
