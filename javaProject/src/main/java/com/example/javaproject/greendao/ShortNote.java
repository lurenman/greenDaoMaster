package com.example.javaproject.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SHORT_NOTE.
 */
public class ShortNote {

    private Long id;
    private String desc;
    private String lon;
    private String lat;
    private String address;
    private String dateTime;
    private String imgFileArray;
    private String soundFileArray;

    public ShortNote() {
    }

    public ShortNote(Long id) {
        this.id = id;
    }

    public ShortNote(Long id, String desc, String lon, String lat, String address, String dateTime, String imgFileArray, String soundFileArray) {
        this.id = id;
        this.desc = desc;
        this.lon = lon;
        this.lat = lat;
        this.address = address;
        this.dateTime = dateTime;
        this.imgFileArray = imgFileArray;
        this.soundFileArray = soundFileArray;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getImgFileArray() {
        return imgFileArray;
    }

    public void setImgFileArray(String imgFileArray) {
        this.imgFileArray = imgFileArray;
    }

    public String getSoundFileArray() {
        return soundFileArray;
    }

    public void setSoundFileArray(String soundFileArray) {
        this.soundFileArray = soundFileArray;
    }

}