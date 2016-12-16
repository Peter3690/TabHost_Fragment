package myapplication.com.example.tulv.tabhost_fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.tabcontent);
        /*mTabHost.setOnTabChangedListener(onTab_Changed);*/


  /*      LayoutInflater inflater = getLayoutInflater();
        View tab1 = inflater.inflate(R.layout.tab1_indicator,null);
        View tab2 = inflater.inflate(R.layout.tab2_indicator,null);
        View tab3 = inflater.inflate(R.layout.tab3_indicator,null);*/

        mTabHost.addTab(mTabHost.newTabSpec("tab1")
                        .setIndicator("Red"),
                RedFragment.class, null);

        mTabHost.addTab(mTabHost.newTabSpec("tab2")
                        .setIndicator("blue"),
                BlueFragment.class, null);
        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                switch (s) {
                    case "tab1":
                        getSupportActionBar().setTitle("Mau Xanh");
                        break;
                    case "tab2":
                        getSupportActionBar().setTitle("Mau Xanh La Cay");
                        break;
                }
            }
        });
    }


}
