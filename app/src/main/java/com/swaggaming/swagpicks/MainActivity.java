package com.swaggaming.swagpicks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ImageButton imageButtonRadiant1;
    private ImageButton imageButtonRadiant2;
    private ImageButton imageButtonRadiant3;
    private ImageButton imageButtonRadiant4;
    private ImageButton imageButtonRadiant5;

    private ImageButton imageButtonDire1;
    private ImageButton imageButtonDire2;
    private ImageButton imageButtonDire3;
    private ImageButton imageButtonDire4;
    private ImageButton imageButtonDire5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Intent heroActivity = new Intent(getApplicationContext(), HeroActivity.class);

        imageButtonRadiant1 = (ImageButton) findViewById(R.id.imageButtonRadiant1);
        imageButtonRadiant2 = (ImageButton) findViewById(R.id.imageButtonRadiant2);
        imageButtonRadiant3 = (ImageButton) findViewById(R.id.imageButtonRadiant3);
        imageButtonRadiant4 = (ImageButton) findViewById(R.id.imageButtonRadiant4);
        imageButtonRadiant5 = (ImageButton) findViewById(R.id.imageButtonRadiant5);

        imageButtonDire1 = (ImageButton) findViewById(R.id.imageButtonDire1);
        imageButtonDire2 = (ImageButton) findViewById(R.id.imageButtonDire2);
        imageButtonDire3 = (ImageButton) findViewById(R.id.imageButtonDire3);
        imageButtonDire4 = (ImageButton) findViewById(R.id.imageButtonDire4);
        imageButtonDire5 = (ImageButton) findViewById(R.id.imageButtonDire5);

//        imageButtonRadiant1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivityForResult(heroActivity, 1);
//            }
//        });
//        imageButtonRadiant2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivityForResult(heroActivity, 2);
//            }
//        });
//        imageButtonRadiant3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivityForResult(heroActivity, 3);
//            }
//        });
//        imageButtonRadiant4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivityForResult(heroActivity, 4);
//            }
//        });
//        imageButtonRadiant5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivityForResult(heroActivity, 5);
//            }
//        });

        imageButtonDire1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(heroActivity, 1);
            }
        });
        imageButtonDire2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(heroActivity, 2);
            }
        });
        imageButtonDire3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(heroActivity, 3);
            }
        });
        imageButtonDire4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(heroActivity, 4);
            }
        });
        imageButtonDire5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(heroActivity, 5);
            }
        });


//       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "requestCode: " + requestCode);

        switch (requestCode) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
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
