package c.verbswithexample.tablayoutviewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import c.verbswithexample.tablayoutviewpager.Tabs.IconTabs;
import c.verbswithexample.tablayoutviewpager.Tabs.TextTab;
import c.verbswithexample.tablayoutviewpager.Tabs.TextWithIconTabs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button btnSimpletabs, btnScrollableTabs, btnIconTabs, btnCustomTextTabs, btnTextIcon;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    toolbar = findViewById(R.id.toolbarid);
    setSupportActionBar(toolbar);

    btnSimpletabs = findViewById(R.id.btnSimpleTabs);
    btnScrollableTabs = findViewById(R.id.btnScrollableTabs);
    btnIconTabs = findViewById(R.id.btnIcontabs);
    btnCustomTextTabs = findViewById(R.id.btnWithCustomView);
        btnTextIcon = findViewById(R.id.btnTextIcon);

    btnCustomTextTabs.setOnClickListener(this);
    btnIconTabs.setOnClickListener(this);
    btnScrollableTabs.setOnClickListener(this);
    btnSimpletabs.setOnClickListener(this);
        btnTextIcon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSimpleTabs:
               i = new Intent(this, TextTab.class);
                startActivity(i);

                break;

            case R.id.btnTextIcon:
                i = new Intent(this, TextWithIconTabs.class);
                startActivity(i);
                break;
            case R.id.btnScrollableTabs:
                break;
            case R.id.btnIcontabs:
               i = new Intent(this, IconTabs.class);
                startActivity(i);
                break;
            case R.id.btnWithCustomView:
                break;


        }


    }
}
