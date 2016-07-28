package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

//托管支持库Fragment的Activity
public class CrimeActivity extends SingleFragmentActivity {
    /**
     * FragmentManager类负责管理fragment并将它们的视图添加到activiy的视图层级结构中
     */
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
          //判断fragment是否已经存在于队列中
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            //创建并提交一个fragment事务,fragment事务用来添加.移除.附加.分离或替换fragment队列中的fragment
//            //add()方法是整个事务的核心,第一个参数:容器视图资源ID,第二个参数:新创建的CrimeFragment
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
