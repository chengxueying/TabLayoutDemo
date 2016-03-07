package tablayout.hy.com.tablayoutdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/3/7.
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragment;
//    private List<String> mList;
    private String[] TITLE;

    public FragmentAdapter(FragmentManager fm,List<Fragment> mFragment,String[] TITLE) {
        super(fm);
        this.mFragment=mFragment;
        this.TITLE = TITLE;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }
}
