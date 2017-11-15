package net.androidbootcamp.ihome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class LightScreen extends AppCompatActivity {

    int numDevices = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_screen);
    }
    public void addNewDevice(View view){

        EditText deviceInput = (EditText) findViewById(R.id.deviceInput);
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.LinearLayout01);
        TextView device = new TextView(this);

        //check if the space is blank
        if(deviceInput.getText().toString() == ""){
            return;
        }
        device.setText(deviceInput.getText());
        deviceInput.setText("");
        device.setId(numDevices ++);
        layout1.addView(device);

        //Add button with device
        SeekBar seek = new SeekBar(this);
        layout1.addView(seek);
    }
}
