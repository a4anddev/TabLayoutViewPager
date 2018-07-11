package c.verbswithexample.tablayoutviewpager.Tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import c.verbswithexample.tablayoutviewpager.AdapterLists.IconTabsAdapter;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentFive;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentFour;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentOne;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentSix;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentThree;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentTwo;
import c.verbswithexample.tablayoutviewpager.R;

public class IconTabs extends AppCompatActivity{

    private List<Fragment> fragmentList = new ArrayList<>();
    private ViewPager viewPager;
    private IconTabsAdapter iconTabsAdapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tabs);
        prepareDataResource();
        initialise();



    }

    private void initialise() {

        Toolbar toolbar = findViewById(R.id.toolbarid);
        toolbar.setTitle("Simple Icon Example");

        ViewPager viewPager = findViewById(R.id.viewPagerId);
        tabLayout = findViewById(R.id.tabs);

        iconTabsAdapter = new IconTabsAdapter(getSupportFragmentManager(), fragmentList);

        viewPager.setAdapter(iconTabsAdapter);
        tabLayout.setupWithViewPager(viewPager);

        setTabIcons();


    }



    private void prepareDataResource() {


        fragmentList.add(new FragmentOne());

        fragmentList.add(new FragmentTwo());

        fragmentList.add(new FragmentThree());

        fragmentList.add(new FragmentFour());

        fragmentList.add(new FragmentFive());

        fragmentList.add(new FragmentSix());


    }

    private void setTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.twitter);
        tabLayout.getTabAt(2).setIcon(R.drawable.linkedin);
        tabLayout.getTabAt(3).setIcon(R.drawable.whatsapp);
        tabLayout.getTabAt(4).setIcon(R.drawable.youtube);
        tabLayout.getTabAt(5).setIcon(R.drawable.skype);

    }



}

