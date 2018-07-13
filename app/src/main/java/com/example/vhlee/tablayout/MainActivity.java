package com.example.vhlee.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
    }
    public void init() {
        mTabLayout = (TabLayout)findViewById(R.id.tablayout);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);


    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(),"Home");
        adapter.addFragment(new SecondFragment(),"Hot");
        adapter.addFragment(new ThirdFragment(),"Settings");
        mViewPager.setAdapter(adapter);

    }
}
