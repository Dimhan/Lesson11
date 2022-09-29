package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {

    private static final long serialVersionUID = 1L;

    private int capacity;
    private boolean grill;
    private String typeControl;
    private boolean autoMode;

    public Oven() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isGrill() {
        return grill;
    }

    public void setGrill(boolean grill) {
        this.grill = grill;
    }

    public String getTypeControl() {
        return typeControl;
    }

    public void setTypeControl(String typeControl) {
        this.typeControl = typeControl;
    }

    public boolean isAutoMode() {
        return autoMode;
    }

    public void setAutoMode(boolean autoMode) {
        this.autoMode = autoMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return capacity == oven.capacity && grill == oven.grill && autoMode == oven.autoMode
                && typeControl.equals(oven.typeControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity, grill, typeControl, autoMode);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "capacity=" + capacity +
                ", grill=" + grill +
                ", typeControl='" + typeControl + '\'' +
                ", autoMode=" + autoMode +
                '}';
    }
}
