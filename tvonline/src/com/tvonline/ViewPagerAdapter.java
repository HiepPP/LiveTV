package com.tvonline;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
	CharSequence Titles[]; // luu tru title khi tao ViewpageAdapter
							
	int NumbOfTabs; //luu tru bien index cua tab

	//tao constructor
	public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[],
			int mNumbOfTabsumb) {
		super(fm);

		this.Titles = mTitles;
		this.NumbOfTabs = mNumbOfTabsumb;

	}

	//tao fragment cho moi vi tri cua viewpage
	@Override
	public Fragment getItem(int position) {

		if (position == 0) // if the position is 0 we are returning the First
							// tab
		{
			ActivityTV tv = new ActivityTV();
			return tv;
		}	if(position == 1) // As we are having 2 tabs if the position is now 0 it must be 1
				// so we are returning second tab
		{
			RadioActivity radio = new RadioActivity();
			return radio;
		}
		else{
			About about = new About();
			return about;
		}

	}

	//return title

	@Override
	public CharSequence getPageTitle(int position) {
		return Titles[position];
	}

	//return tab index

	@Override
	public int getCount() {
		return NumbOfTabs;
	}
}
