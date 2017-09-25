package campbell.ca.hw;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        EditText enterGeoLocationET = (EditText) findViewById(R.id.enterGeoLocationET);
        toolbar.setTitle("Lab5");
        enterGeoLocationET.setText(savedInstanceState.getString("countryInfo").toString());
        setSupportActionBar(toolbar);


    }

}
