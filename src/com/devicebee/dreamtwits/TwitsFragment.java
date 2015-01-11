package com.devicebee.dreamtwits;




import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


@SuppressLint("NewApi") public class TwitsFragment extends Fragment implements TabListener{

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	// Tab titles
	private String[] tabs = { "Day Dreams", "Night Dreams"};
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.simple_tabs, container,
				false);

		viewPager = (ViewPager) rootView.findViewById(R.id.pager);
	//	actionBar = getActivity().getActionBar();
//		DashBoardActivity.actionbar.setDisplayShowCustomEnabled(true);
//		BitmapDrawable topBarColor = new BitmapDrawable(
//				BitmapFactory.decodeResource(getResources(),
//						R.drawable.top_bar_color));
//		actionBar.setBackgroundDrawable(topBarColor);

		mAdapter = new TabsPagerAdapter(getChildFragmentManager());

		viewPager.setAdapter(mAdapter);
		DashBoardActivity.actionbar.setHomeButtonEnabled(false);
		DashBoardActivity.actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Adding Tabs
		for (String tab_name : tabs) {
			DashBoardActivity.actionbar.addTab(DashBoardActivity.actionbar.newTab().setText(tab_name)
					.setTabListener(this));
		}
		
//		DashBoardActivity.actionbar.getTabAt(0).setCustomView(R.drawable.tab_bar_backgroud);
//		DashBoardActivity.actionbar.getTabAt(1)
//				.setCustomView(R.drawable.tab_bar_backgroud);
//		actionBar.getTabAt(2).setCustomView(R.layout.unselect_tab_layout_phone);
//
//		actionBar.getTabAt(3).setCustomView(R.layout.unselect_tab_layout_home);
//		actionBar.getTabAt(4).setCustomView(
//				R.layout.unselect_tab_layout_electronics);
	/*	rLayout0 = (RelativeLayout) actionBar.getTabAt(0).getCustomView()
				.findViewById(R.id.rLayout);*/
		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				DashBoardActivity.actionbar.setSelectedNavigationItem(position);

				switch (position) {
				case 0:
//					DashBoardActivity.actionbar.getTabAt(position).setCustomView(null);
//					actionBar.getTabAt(position).setCustomView(
//							R.layout.tab_layout_fashion);
					break;

				case 1:
//					DashBoardActivity.actionbar.getTabAt(position).setCustomView(null);
//					actionBar.getTabAt(position).setCustomView(
//							R.layout.tab_layout_health);
					break;
//				case 2:
//					actionBar.getTabAt(position).setCustomView(null);
//					actionBar.getTabAt(position).setCustomView(
//							R.layout.tab_layout_phone);
//					break;
//				case 3:
//					actionBar.getTabAt(position).setCustomView(null);
//					actionBar.getTabAt(position).setCustomView(
//							R.layout.tab_layout_home);
//					break;
//				case 4:
//					actionBar.getTabAt(position).setCustomView(null);
//					actionBar.getTabAt(position).setCustomView(
//							R.layout.tab_layout_electronics);
//					break;

				}

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
		return rootView;
	}

	@Override
	public void onTabReselected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabSelected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabUnselected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


}
