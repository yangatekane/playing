package com.yanga;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * FragmentPagerAdapter.
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<PageItem> mList;

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        mList = new ArrayList<PageItem>();
    }
    
    @Override
    public Fragment getItem(int position) {
        PageItem item = mList.get(position);
        if (PageItem.PROFILE == item.fragmentKind) {
            return new ProfileFragment();
        }else if (PageItem.DACTIVITIES == item.fragmentKind){
            return new MyActivitiesFragment();
        }
        return null;
    }
    
    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position).title;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    public void addItem(PageItem item) {
        mList.add(item);
    }
    
}
