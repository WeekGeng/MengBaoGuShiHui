package com.example.administrator.mengbaogushihui.mainfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.mengbaogushihui.extras.MyListView;
import com.example.administrator.mengbaogushihui.R;

/**
 * Created by Administrator on 2015/6/2.
 */
public class HomeFragment extends Fragment {
    MyListView home_middle_mylv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData();
    }

    private void getData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.homefragment, container, false);
        home_middle_mylv=(MyListView)view.findViewById(R.id.home_middle_mylv);
        return view;
    }
}
