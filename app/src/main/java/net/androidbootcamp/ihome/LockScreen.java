package net.androidbootcamp.ihome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

public class LockScreen extends AppCompatActivity {

    //get linear layout so we can add child classes when adding a new device
    int numDevices = 0;
    String deviceName = "Whattup";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_screen);
    }

    public void addNewDevice(View view){


        LinearLayout layout1 = (LinearLayout) findViewById(R.id.LinearLayout01);
        TextView device = new TextView(this);
        device.setText(deviceName);
        device.setId(numDevices ++);
        layout1.addView(device);
    }
}
