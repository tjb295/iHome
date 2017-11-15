package net.androidbootcamp.ihome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class LockScreen extends AppCompatActivity {

    //get linear layout so we can add child classes when adding a new device
    LinearLayout linearLayout = (LinearLayout) findViewById(R.id.LinearLayout01);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_screen);
    }
}
