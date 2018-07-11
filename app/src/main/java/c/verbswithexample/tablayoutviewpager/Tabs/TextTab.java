package c.verbswithexample.tablayoutviewpager.Tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentFive;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentFour;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentOne;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentSix;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentThree;
import c.verbswithexample.tablayoutviewpager.AllFragments.FragmentTwo;
import c.verbswithexample.tablayoutviewpager.R;

public class TextTab extends AppCompatActivity{

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);
        initialise();
        prepareDataResource();
    }

    private void initialise() {

        Toolbar toolbar = findViewById(R.id.toolbarid);
        toolbar.setTitle("Simple Tabs Example");

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

}
