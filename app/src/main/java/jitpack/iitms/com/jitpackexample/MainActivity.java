package jitpack.iitms.com.jitpackexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import jitpack.iitms.com.mylibrary.MathematicsOperation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MathematicsOperation mathematicsOperation=new MathematicsOperation();
        Toast.makeText(this, ""+mathematicsOperation.sum(10,20), Toast.LENGTH_SHORT).show();
    }
}//closeed activity

