package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {

    private static final long serialVersionUID = 1L;

    private String NameAppl;
    private String brand;
    private int poewrConsuption;
    private Dimensions dimensions;

    public Appliance() {

    }


    public String getNameAppl() {
        return NameAppl;
    }

    public void setNameAppl(String nameAppl) {
        NameAppl = nameAppl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPoewrConsuption() {
        return poewrConsuption;
    }

    public void setPoewrConsuption(int poewrConsuption) {
        this.poewrConsuption = poewrConsuption;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return poewrConsuption == appliance.poewrConsuption && NameAppl.equals(appliance.NameAppl)
                && brand.equals(appliance.brand) && dimensions.equals(appliance.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameAppl, brand, poewrConsuption, dimensions);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "NameAppl='" + NameAppl + '\'' +
                ", brand='" + brand + '\'' +
                ", poewrConsuption=" + poewrConsuption +
                ", dimensions=" + dimensions +
                '}';
    }
}
