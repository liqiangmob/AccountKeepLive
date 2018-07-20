package com.demoutils.jinyuaniwm.mydemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XLSSyncAdapterManager.init(this);

        findViewById(R.id.button_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XLSSyncAdapterManager.forceRefresh();

            }
        });
    }


}
