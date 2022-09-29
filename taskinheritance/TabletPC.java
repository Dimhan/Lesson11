package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends Laptop implements Serializable {

    private static final long serialVersionUID = 1L;

    private int flashMemoryCapacity;
    private String typeVideoAccelerator;
    private String typeInterfaceConnection;

    public TabletPC() {

    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getTypeVideoAccelerator() {
        return typeVideoAccelerator;
    }

    public void setTypeVideoAccelerator(String typeVideoAccelerator) {
        this.typeVideoAccelerator = typeVideoAccelerator;
    }

    public String getTypeInterfaceConnection() {
        return typeInterfaceConnection;
    }

    public void setTypeInterfaceConnection(String typeInterfaceConnection) {
        this.typeInterfaceConnection = typeInterfaceConnection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return flashMemoryCapacity == tabletPC.flashMemoryCapacity
                && typeVideoAccelerator.equals(tabletPC.typeVideoAccelerator)
                && typeInterfaceConnection.equals(tabletPC.typeInterfaceConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flashMemoryCapacity, typeVideoAccelerator, typeInterfaceConnection);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "flashMemoryCapacity=" + flashMemoryCapacity +
                ", typeVideoAccelerator='" + typeVideoAccelerator + '\'' +
                ", typeInterfaceConnection='" + typeInterfaceConnection + '\'' +
                '}';
    }
}
