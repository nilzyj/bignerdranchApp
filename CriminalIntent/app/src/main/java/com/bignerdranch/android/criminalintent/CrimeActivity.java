package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        //获取FragmentManager
//        FragmentManager fm = getSupportFragmentManager();
//        //获取Fragment
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            //创建并提交一个fragment事务
//            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
//        }
//    }


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
