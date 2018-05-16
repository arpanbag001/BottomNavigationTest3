package com.innovationredefined.bottomnavigationtest3;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Arpan on 3/7/2018.
 * This is the Fragment adapter
 */

public class SampleFragmentAdapter extends FragmentPagerAdapter {
    SampleFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourthFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "First Fragment";
            case 1:
                return "Second Fragment";
            case 2:
                return "Third Fragment";
            case 3:
                return "Fourth Fragment";
            default:
                return "Repeat Text";
        }
    }
}
