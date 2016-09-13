package com.bignerdranch.android.customermanagment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button mAddButton;
    private Button mViewButton;
    private Button mBillingButton;
    private Button mFinalizingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new User();
            fm.beginTransaction ()
                    .add(R.id.fragment_container, fragment);
        }

        mAddButton = (Button) findViewById(R.id.add_btn);
        mAddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_edit_customer);
            }
        });
        mViewButton = (Button) findViewById(R.id.view_btn);
        mViewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_view);
            }
        });
        mBillingButton = (Button) findViewById(R.id.billing_btn);
        mBillingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_billing);
            }
        });
        mFinalizingButton = (Button) findViewById(R.id.finalizing_btn);
        mFinalizingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_sessions);
            }
        });
    }
}
