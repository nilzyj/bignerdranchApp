package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

//托管支持库Fragment的Activity
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
//    public static final String EXTRA_CRIME_ID =
//        "com.bignerdranch.android.criminalintent.crime_id";

    private static final String EXTRA_CRIME_ID =
        "com.bignerdranch.android.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        //return new CrimeFragment();
//        UUID crimeId = (UUID) getIntent()
//                .getSerializableExtra(EXTRA_CRIME_ID);
        UUID crimeId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }
}
