package com.snap.left.leftsnapsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;

class FooPagerAdapter extends FragmentStatePagerAdapter {
    public FooPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ListFragment listFragment = new SnapListFragment();
        return listFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public float getPageWidth(int position) {
        return 0.6f;
    }
}
