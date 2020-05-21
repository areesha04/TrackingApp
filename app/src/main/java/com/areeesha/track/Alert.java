package com.areeesha.track;


import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
public class Alert extends AppCompatActivity {
    View rootView;
    ContactsDatabaseAdapter mContactsDatabaseAdapter;
    List<Number> nums;
    String main;

    private Double lat;
    private Double lang;

    private LocationManager mLocationManager;
    private LocationListener mLocationListener;
    private ImageButton im;
    //View rootView;
//    ContactsDatabaseAdapter mContactsDatabaseAdapter;
//    List<Number> nums;
//    String main;
//
//    private Double lat;
//    private Double lang;
//
//    private LocationManager mLocationManager;
//    private LocationListener mLocationListener;
    //ImageButton im;
    Button btn;

    //Button btn;
//    public Alert() {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        Intent intent = getIntent();
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact();

            }
        });
    }

    //    mLocationManager =(LocationManager) getSystemService(Context.LOCATION_SERVICE);
//    mLocationListener = new LocationListener() {
//        @Override
//        public void onLocationChanged(Location location) {
//            lat = location.getLatitude();
//            lang = location.getLongitude();
//        }
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {
//
//        }
//
//        @Override
//        public void onProviderEnabled(String provider) {
//
//        }
//        @Override
//        public void onProviderDisabled(String provider) {
//        }
//    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.alert_menu, menu);
        //inflater.inflate(R.menu.alert_menu, menu);
        return true;
    }
//    nums = new ArrayList<Number>();
//    mContactsDatabaseAdapter = new ContactsDatabaseAdapter(this.getActivity());
//    mContactsDatabaseAdapter = mContactsDatabaseAdapter.open();
    //nums = new ArrayList<Number>();
    //        mContactsDatabaseAdapter = new ContactsDatabaseAdapter(this.getActivity());

    //        mContactsDatabaseAdapter = mContactsDatabaseAdapter.open();
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pick_contact_item:

                Intent intent = new Intent(this, Alert_ADD.class);
                startActivity(intent);

                /*TODO: Move all code related to Alert ADD here*/

                return true;

            case R.id.show_contact_item:

                /*TODO: Move all code related to Alert ADD here*/

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


//        im = (Button) rootView.findViewById(R.id.alertIM);
//        im.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openact();
//            }
//
//
//        });

    public void openact() {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

};