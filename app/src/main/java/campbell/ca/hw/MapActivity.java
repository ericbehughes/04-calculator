package campbell.ca.hw;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MapActivity extends AppCompatActivity {
    Uri mapsUri = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        EditText enterGeoLocationET = (EditText) findViewById(R.id.enterGeoLocationET);
        toolbar.setTitle("Lab5");
        enterGeoLocationET.setText(getIntent().getExtras().getString("countryInfo"));
        setSupportActionBar(toolbar);


    }

    public void openMaps(View v) {

        //Uri uri = Uri.parse(getIntent().getExtras().getString("geoLocation"));
        //mapsUri = Uri.parse(getIntent().getExtras().getString("geoLocation"));

        mapsUri = Uri.parse(getIntent().getExtras().getString("geoLocation"));

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapsUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

//        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        //mapIntent.setPackage("com.google.android.apps.maps");
//        mapIntent.setData(gmmIntentUri);
//
//            startActivity(mapIntent);

    }
}
