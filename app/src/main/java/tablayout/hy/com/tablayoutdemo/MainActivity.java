package tablayout.hy.com.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import tablayout.hy.com.tablayoutdemo.adapter.FragmentAdapter;
import tablayout.hy.com.tablayoutdemo.fagment.FirstFragment;
import tablayout.hy.com.tablayoutdemo.fagment.ImageFragment;
import tablayout.hy.com.tablayoutdemo.fagment.PicFragment;
import tablayout.hy.com.tablayoutdemo.fagment.SecondFragment;
import tablayout.hy.com.tablayoutdemo.fagment.TopFragment;

public class MainActivity extends FragmentActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Fragment> mFragment;
    private FragmentAdapter fragmentAdapter;
    private FirstFragment firstFragment = new FirstFragment();
    private ImageFragment imageFragment = new ImageFragment();
    private PicFragment picFragment = new PicFragment();
    private SecondFragment secondFragment = new SecondFragment();
    private TopFragment topFragment = new TopFragment();
    private static final String[] TITLE = new String[]{"头条", "房产", "另一面", "女人",
            "财经", "房产", "另一面", "女人", "财经"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.tab_viewpager);
        //设置TabLayout的模式
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //为TabLayout添加tab名称
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[0]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[1]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[2]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[3]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[4]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[5]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[6]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[7]));
        mTabLayout.addTab(mTabLayout.newTab().setText(TITLE[8]));
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragment, TITLE);
        mViewPager.setAdapter(fragmentAdapter);
        //TabLayout加载viewpager
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initData() {
        mFragment = new ArrayList<>();
        mFragment.add(firstFragment);
        mFragment.add(imageFragment);
        mFragment.add(picFragment);
        mFragment.add(secondFragment);
        mFragment.add(topFragment);
        mFragment.add(firstFragment);
        mFragment.add(imageFragment);
        mFragment.add(picFragment);
        mFragment.add(secondFragment);

    }
}
