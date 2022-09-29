package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {

    private static final long serialVersionUID = 1L;

    private int freezerCapacity;
    private int overallCapacity;

    public Refrigerator() {
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return freezerCapacity == that.freezerCapacity && overallCapacity == that.overallCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                '}';
    }
}
