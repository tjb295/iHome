package net.androidbootcamp.ihome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

public class LockScreen extends AppCompatActivity implements View.OnClickListener{

    //get linear layout so we can add child classes when adding a new device
    int numDevices = 0;
    String deviceName = "Whattup";
    public void init(){
        Button firstButton = (Button) findViewById(R.id.OnOff);
        firstButton.setOnClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_screen);
        init();
    }

    public void addNewDevice(View view){

        EditText deviceInput = (EditText) findViewById(R.id.deviceInput);
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.LinearLayout01);
        TextView device = new TextView(this);
        device.setText(deviceInput.getText());
        device.setId(numDevices ++);
        layout1.addView(device);

        //Add button with device
        Button newButton = new Button(this);
        newButton.setText("locked");
        newButton.setOnClickListener(this);
        layout1.addView(newButton);
    }

    @Override
    public void onClick(View v){
        Button button = (Button) v;
        if(button.getText() == "locked"){
            button.setText("unlocked");
        }
        else button.setText("locked");
    }


}
