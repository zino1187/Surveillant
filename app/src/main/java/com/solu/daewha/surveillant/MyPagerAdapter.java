package com.solu.daewha.surveillant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by zino on 2017-10-13.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    Fragment[] fragments = new Fragment[3];

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments[0] = new EyeFragment();
        fragments[1] = new RemoteFragment();
        fragments[2] = new ConfigFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
