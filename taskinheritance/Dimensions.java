package com.epamjavaweb.task10class.taskinheritance;

import java.io.Serializable;
import java.util.Objects;

public class Dimensions implements Serializable {
    private static final long serialVersionUID = 1L;

    private int weight;
    private int depth;
    private int height;
    private int width;

    public Dimensions() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return weight == that.weight && depth == that.depth && height == that.height && width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, depth, height, width);
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "weight=" + weight +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
