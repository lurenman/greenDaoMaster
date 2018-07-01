package com.example.javaproject.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LIST_DATA.
 */
public class ListData {

    private Integer detail_level;
    private String display_name;
    private String parent_id;
    private String user_id;
    private String user_id1;
    private String user_id2;

    public ListData() {
    }

    public ListData(Integer detail_level, String display_name, String parent_id, String user_id, String user_id1, String user_id2) {
        this.detail_level = detail_level;
        this.display_name = display_name;
        this.parent_id = parent_id;
        this.user_id = user_id;
        this.user_id1 = user_id1;
        this.user_id2 = user_id2;
    }

    public Integer getDetail_level() {
        return detail_level;
    }

    public void setDetail_level(Integer detail_level) {
        this.detail_level = detail_level;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id1() {
        return user_id1;
    }

    public void setUser_id1(String user_id1) {
        this.user_id1 = user_id1;
    }

    public String getUser_id2() {
        return user_id2;
    }

    public void setUser_id2(String user_id2) {
        this.user_id2 = user_id2;
    }

}
