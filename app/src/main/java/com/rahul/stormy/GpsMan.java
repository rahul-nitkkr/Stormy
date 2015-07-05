package com.rahul.stormy;

/**
 * Created by Apple on 06/06/15.
 */
public class GpsMan {
    LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

    LocationListener locationListener = new LocationListener()
    {

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onProviderEnabled(String provider) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onProviderDisabled(String provider) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onLocationChanged(Location location) {
            // TODO Auto-generated method stub
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            double speed = location.getSpeed(); //spedd in meter/minute
            speed = (speed*3600)/1000;      // speed in km/minute               Toast.makeText(GraphViews.this, "Current speed:" + location.getSpeed(),Toast.LENGTH_SHORT).show();
        }
    };

    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

}

}
