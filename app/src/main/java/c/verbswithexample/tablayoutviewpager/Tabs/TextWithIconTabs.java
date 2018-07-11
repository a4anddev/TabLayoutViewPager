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

import c.verbswithexample.tablayoutviewpager.AdapterLists.TextWithIconTabsAdapter;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentOne;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentThree;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentTwo;
import c.verbswithexample.tablayoutviewpager.R;

public class TextWithIconTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private ViewPager viewPager;
    private TextWithIconTabsAdapter textWithIconTabsAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_with_icon_tabs);
        prepareDataResource();
        initialise();



    }

    private void initialise() {

        Toolbar toolbar = findViewById(R.id.toolbarid);
        toolbar.setTitle("Simple icon with text");

        ViewPager viewPager = findViewById(R.id.viewPagerId);
        tabLayout = findViewById(R.id.tabs);

        textWithIconTabsAdapter = new TextWithIconTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

        viewPager.setAdapter(textWithIconTabsAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();


    }

    private void prepareDataResource() {


        addData(new FragmentOne(), "one");
        addData(new FragmentTwo(), "Two");
        addData(new FragmentThree(), "Three");


/*        fragmentList.add(new FragmentOne());
        titleList.add("one");

        fragmentList.add(new FragmentTwo());
        titleList.add("Two");

        fragmentList.add(new FragmentThree());
        titleList.add("Three");*/


    }

    private void addData(Fragment fragment, String title){

        fragmentList.add(fragment);
        titleList.add(title);

    }

    private void setTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.twitter);
        tabLayout.getTabAt(2).setIcon(R.drawable.linkedin);

    }


}
