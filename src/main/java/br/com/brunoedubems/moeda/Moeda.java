package br.com.brunoedubems.moeda;

import java.util.ArrayList;
import java.util.List;

public class Moeda {
private String code;
private String name;
private String country;

    public Moeda(String code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return code + " - " + name + " (" + country + ")";
    }


}