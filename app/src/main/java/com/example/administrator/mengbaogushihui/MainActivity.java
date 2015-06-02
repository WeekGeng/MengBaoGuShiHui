package com.example.administrator.mengbaogushihui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.mengbaogushihui.mainfragment.HomeFragment;
import com.example.administrator.mengbaogushihui.mainfragment.InterActiveFragment;
import com.example.administrator.mengbaogushihui.mainfragment.MyFragment;
import com.example.administrator.mengbaogushihui.mainfragment.RecordFragment;


public class MainActivity extends ActionBarActivity {
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private TextView main_tv_shouye;
    private TextView main_tv_interactive;
    private ImageView main_iv_play;
    private TextView main_tv_record;
    private TextView main_tv_my;
    private int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragmentIndex();
        initView();
        setListeners();
    }

    private void setListeners() {
        main_tv_shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment home = new HomeFragment();
                position = 0;
                setFragmentChose(home);
            }
        });
        main_tv_interactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment interActive = new InterActiveFragment();
                position = 1;
                setFragmentChose(interActive);
            }
        });
        main_iv_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        main_tv_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment record = new RecordFragment();
                position = 2;
                setFragmentChose(record);
            }
        });
        main_tv_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment my = new MyFragment();
                position = 3;
                setFragmentChose(my);
            }
        });
    }
    private void setFragmentChose(Fragment fragment) {
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, fragment);
        transaction.commit();
    }
    private void setFragmentIndex() {
        Fragment home = new HomeFragment();
        fragmentManager=getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.content,home);
        transaction.commit();
    }

    private void initView() {
        main_tv_shouye=(TextView)findViewById(R.id.main_tv_shouye);
        main_tv_interactive=(TextView)findViewById(R.id.main_tv_interactive);
        main_iv_play=(ImageView)findViewById(R.id.main_iv_play);
        main_tv_record=(TextView)findViewById(R.id.main_tv_record);
        main_tv_my=(TextView)findViewById(R.id.main_tv_my);
    }
}
