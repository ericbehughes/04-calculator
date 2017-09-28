package campbell.ca.hw;

import android.app.SearchManager;
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
        // get geo location from previous intent
        mapsUri = Uri.parse(getIntent().getExtras().getString("geoLocation"));
        //build intent with geo info
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapsUri);

        // launch maps
        startActivity(mapIntent);



    }

    public void searchGoogleClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SEARCH);
        String query = ((EditText) findViewById(R.id.enterGoogleSearchET)).getText().toString();
        intent.putExtra(SearchManager.QUERY, query);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
