package net.androidbootcamp.ihome;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.graphics.drawable.ColorDrawable;

public class LockScreen extends AppCompatActivity implements View.OnClickListener{

    //get linear layout so we can add child classes when adding a new device
    int numDevices = 0;
    int holoblue;
    String deviceName = "Whattup";
    String [] deviceNames = new String[20];
    public void init(){
        Button firstButton = (Button) findViewById(R.id.OnOff);
        firstButton.setOnClickListener(this);
        holoblue = ((ColorDrawable)firstButton.getBackground()).getColor();

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
        if(deviceInput.getText().toString() == ""){
            return;
        }
        device.setText(deviceInput.getText());
        deviceInput.setText("");
        device.setId(numDevices ++);
        layout1.addView(device);

        //Add button with device
        Button newButton = new Button(this);
        newButton.setBackgroundColor(holoblue);
        newButton.setText("locked");
        newButton.setOnClickListener(this);
        layout1.addView(newButton);
    }

    @Override
    public void onClick(View v){
        Button button = (Button) v;
        if(button.getText() == "locked"){
            button.setText("unlocked");
            button.setBackgroundColor(Color.GRAY);
        }
        else{
            button.setText("locked");
            button.setBackgroundColor(holoblue);
        }
    }


}
