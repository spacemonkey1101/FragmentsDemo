package com.example.fragmentsdemo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionStateAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public SectionStateAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
