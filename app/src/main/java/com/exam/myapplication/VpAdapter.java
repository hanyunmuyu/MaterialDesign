package com.exam.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class VpAdapter extends FragmentPagerAdapter {
    List<Fragment> mFragmentList;
    List<String> mStringList;
    public VpAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        mFragmentList = fragments;
        mStringList = titles;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return mStringList.get(position);
    }
}
