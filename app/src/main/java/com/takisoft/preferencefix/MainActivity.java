package com.takisoft.preferencefix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        if (savedInstanceState != null) return;

        getSupportFragmentManager().beginTransaction()
                .add(R.id.preferences, new MyPreferenceFragment(), null)
                .commit();
    }
}
