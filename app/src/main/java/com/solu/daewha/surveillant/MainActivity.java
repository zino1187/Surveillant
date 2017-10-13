package com.solu.daewha.surveillant;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener{
    String TAG=this.getClass().getName();
    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;
    ImageView[] menu=new ImageView[3];
    String[] title={"실시간 감시","원격제어","환경설정"};
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu[0]=(ImageView) findViewById(R.id.eye);
        menu[1]=(ImageView) findViewById(R.id.remote);
        menu[2]=(ImageView) findViewById(R.id.config);

        for(int i=0;i<menu.length;i++){
            menu[i].setOnClickListener(this);
        }

        viewPager =(ViewPager) findViewById(R.id.viewPager);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        viewPager.addOnPageChangeListener(this);
        actionBar = getSupportActionBar();
        goPage(0);
    }

    public void goPage(int index){
        viewPager.setCurrentItem(index, true);
        actionBar.setTitle(title[index]);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        switch (id){
            case R.id.eye: goPage(0);break;
            case R.id.remote: goPage(1);break;
            case R.id.config: goPage(2);break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        //Log.d(TAG, "onPageSelected");
        actionBar.setTitle(title[position]);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
}
