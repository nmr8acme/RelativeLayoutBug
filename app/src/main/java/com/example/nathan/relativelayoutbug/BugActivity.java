package com.example.nathan.relativelayoutbug;

import android.app.Activity;
import android.os.Bundle;

public class BugActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.bug_layout);
    }
}
