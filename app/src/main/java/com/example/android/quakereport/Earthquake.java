/**
 * Created by PRAVIN on 1/27/2017.
 */
package com.example.android.quakereport;
public class Earthquake {
    private Double pMagnitude;
    private String pLocation;
    private Long pDate;
    private String pUrl;


    public Earthquake(Double magnitude, String location, long date,String url) {
        pMagnitude = magnitude;
        pLocation = location;
        pDate = date;
        pUrl=url;

    }

    public Double getMagnitude() {
        return pMagnitude;
    }

    public String getLocation() {
        return pLocation;
    }

    public long getDate() {
        return pDate;
    }
    public String getUrl(){return pUrl;}

}



