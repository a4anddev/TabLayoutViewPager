package c.verbswithexample.tablayoutviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button btnSimpletabs, btnScrollableTabs, btnIconTabs, btnCustomTextTabs;
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

    btnCustomTextTabs.setOnClickListener(this);
    btnIconTabs.setOnClickListener(this);
    btnScrollableTabs.setOnClickListener(this);
    btnSimpletabs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSimpleTabs:
                break;
            case R.id.btnScrollableTabs:
                break;
            case R.id.btnIcontabs:
                break;
            case R.id.btnWithCustomView:
                break;


        }


    }
}
