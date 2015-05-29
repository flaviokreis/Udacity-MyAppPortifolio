package com.example.android.myappportifolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button mSpotify;
    private Button mScores;
    private Button mLibrary;
    private Button mBuild;
    private Button mXyz;
    private Button mCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotify  = (Button) findViewById(R.id.spotify);
        mScores   = (Button) findViewById(R.id.scores);
        mLibrary  = (Button) findViewById(R.id.library);
        mBuild    = (Button) findViewById(R.id.build);
        mXyz      = (Button) findViewById(R.id.xyz);
        mCapstone = (Button) findViewById(R.id.capstone);

        mSpotify.setOnClickListener( this );
        mScores.setOnClickListener( this );
        mLibrary.setOnClickListener( this );
        mBuild.setOnClickListener( this );
        mXyz.setOnClickListener( this );
        mCapstone.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() ){
            case R.id.spotify:
                Toast.makeText(MainActivity.this, getString(R.string.spotify_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(MainActivity.this, getString(R.string.scores_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(MainActivity.this, getString(R.string.library_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.build:
                Toast.makeText(MainActivity.this, getString(R.string.build_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz:
                Toast.makeText(MainActivity.this, getString(R.string.xyz_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, getString(R.string.capstone_toast), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
