package net.androidbootcamp.ihome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lockActivity(View view){
        Intent intent = new Intent(this,LockScreen.class);
        startActivity(intent);
    }
    public void lightActivity(View view){
        Intent intent = new Intent(this,LightScreen.class);
        startActivity(intent);
    }
}
