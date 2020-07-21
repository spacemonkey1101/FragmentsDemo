package com.example.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ViewPager viewPager;
    private SectionStateAdapter sectionStateAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started");

        sectionStateAdapter = new SectionStateAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        //setup pager
        setViewPagerObject(viewPager);

        //viewPager.setCurrentItem(0);//0 ---> fragment 1 ; 1 --->fragment2
    }

    private void setViewPagerObject(ViewPager viewPager){
     SectionStateAdapter adapter = new SectionStateAdapter(getSupportFragmentManager());
     adapter.addFragment(new Fragment1(),"Fragment 1");
     adapter.addFragment(new Fragment2(),"Fragment 2");
     adapter.addFragment(new Fragment3(),"Fragment 3");
    viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}