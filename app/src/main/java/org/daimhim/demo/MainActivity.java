package org.daimhim.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.daimhim.widget.rgfl.RadioGroupFlowLayout;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroupFlowLayout viewById = findViewById(R.id.rgl_layout);
        viewById.setChecked(true);
        findViewById(R.id.clean).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewById.clearCheck();
            }
        });
    }

}