package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class LaptopGame extends Laptop implements Serializable {

    private static final long serialVersionUID = 1L;

    private String modelVideoCard;
    private int memoryVideo;
    private String displayTechnology;

    public LaptopGame() {
    }

    public String getModelVideoCard() {
        return modelVideoCard;
    }

    public void setModelVideoCard(String modelVideoCard) {
        this.modelVideoCard = modelVideoCard;
    }

    public int getMemoryVideo() {
        return memoryVideo;
    }

    public void setMemoryVideo(int memoryVideo) {
        this.memoryVideo = memoryVideo;
    }

    public String getDisplayTechnology() {
        return displayTechnology;
    }

    public void setDisplayTechnology(String displayTechnology) {
        this.displayTechnology = displayTechnology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LaptopGame that = (LaptopGame) o;
        return memoryVideo == that.memoryVideo && modelVideoCard.equals(that.modelVideoCard)
                && displayTechnology.equals(that.displayTechnology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), modelVideoCard, memoryVideo, displayTechnology);
    }

    @Override
    public String toString() {
        return "LaptopGame{" +
                "modelVideoCard='" + modelVideoCard + '\'' +
                ", memoryVideo=" + memoryVideo +
                ", displayTechnology='" + displayTechnology + '\'' +
                '}';
    }
}
