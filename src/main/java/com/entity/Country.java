package com.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "countries")
public class Country implements Serializable {

    @Id
    private String country_id;

    private String country_name;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    public Country() {}

    public Country(String country_id, String country_name, Region region) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.region = region;
    }

    public String getCountry_id() 
    { return country_id; }
    
    public void setCountry_id(String country_id)
    { this.country_id = country_id; }
    
    public String getCountry_name()
    { return country_name; }
    
    public void setCountry_name(String country_name)
    { this.country_name = country_name; }
    
    public Region getRegion()
    { return region; }
    
    public void setRegion(Region region) 
    { this.region = region; }

    @Override
    public String toString() {
        return "Country [country_id=" + country_id + ", country_name=" + country_name + ", region=" + region + "]";
    }
}
