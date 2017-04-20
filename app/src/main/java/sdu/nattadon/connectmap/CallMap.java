package sdu.nattadon.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);

        EditText Lattitude = (EditText) findViewById(R.id.mapLat);
        EditText Longtitude = (EditText) findViewById(R.id.mapLong);
        EditText label = (EditText) findViewById(R.id.mapLabel);

        String Iat = Lattitude.getText().toString().trim();
        String Ing = Longtitude.getText().toString().trim();
        String mlabel = label.getText().toString().trim();

        Uri location = Uri.parse("http://maps.google.com.map?q=loc:13.759774,100.541484");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.map");

    }// Main Method

    public void callMap(View view) {

    }
}//End callMap