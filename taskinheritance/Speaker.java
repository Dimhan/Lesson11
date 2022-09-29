package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class Speaker extends Appliance implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numberOfSpeakers;
    private double cordLength;
    private String FrequencyRange;
    private boolean subwoofer;

    public Speaker() {

    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public String getFrequencyRange() {
        return FrequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        FrequencyRange = frequencyRange;
    }

    public boolean isSubwoofer() {
        return subwoofer;
    }

    public void setSubwoofer(boolean subwoofer) {
        this.subwoofer = subwoofer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speaker speaker = (Speaker) o;
        return numberOfSpeakers == speaker.numberOfSpeakers && Double.compare(speaker.cordLength, cordLength) == 0
                && subwoofer == speaker.subwoofer && FrequencyRange.equals(speaker.FrequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSpeakers, cordLength, FrequencyRange, subwoofer);
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "numberOfSpeakers=" + numberOfSpeakers +
                ", cordLength=" + cordLength +
                ", FrequencyRange='" + FrequencyRange + '\'' +
                ", subwoofer=" + subwoofer +
                '}';
    }
}
