package com.example.javaproject.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PROPERTY_DICT_ENTITY.
 */
public class PropertyDictEntity {

    private Long id;
    private String propertyName;
    private String propertyData;

    public PropertyDictEntity() {
    }

    public PropertyDictEntity(Long id) {
        this.id = id;
    }

    public PropertyDictEntity(Long id, String propertyName, String propertyData) {
        this.id = id;
        this.propertyName = propertyName;
        this.propertyData = propertyData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyData() {
        return propertyData;
    }

    public void setPropertyData(String propertyData) {
        this.propertyData = propertyData;
    }

}
