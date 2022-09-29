package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {

    private static final long serialVersionUID = 1L;

    private int batteryCapacity;
    private String os;
    private int memROM;
    private int memSYS;
    private int displayInch;
    private int cpuFreq;

    public Laptop() {
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemROM() {
        return memROM;
    }

    public void setMemROM(int memROM) {
        this.memROM = memROM;
    }

    public int getMemSYS() {
        return memSYS;
    }

    public void setMemSYS(int memSYS) {
        this.memSYS = memSYS;
    }

    public int getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(int displayInch) {
        this.displayInch = displayInch;
    }

    public int getCpuFreq() {
        return cpuFreq;
    }

    public void setCpuFreq(int cpuFreq) {
        this.cpuFreq = cpuFreq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity && memROM == laptop.memROM &&
                memSYS == laptop.memSYS && displayInch == laptop.displayInch && cpuFreq == laptop.cpuFreq
                && os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, os, memROM, memSYS, displayInch, cpuFreq);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memROM=" + memROM +
                ", memSYS=" + memSYS +
                ", displayInch=" + displayInch +
                ", cpuFreq=" + cpuFreq +
                '}';
    }
}
