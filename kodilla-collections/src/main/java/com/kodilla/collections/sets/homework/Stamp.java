package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private boolean stampUsed;

    public Stamp(String stampName, String stampDimensions, boolean stampUsed)

    {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.stampUsed = stampUsed;
    }

    public String getStampName(){
            return stampName;
    }
    public String getStampDimensions(){
        return stampDimensions;
    }
    public boolean getStampUsed(){
        return stampUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampUsed == stamp.stampUsed && Objects.equals(stampName, stamp.stampName) && Objects.equals(stampDimensions, stamp.stampDimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, stampUsed);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", stampUsed=" + stampUsed +
                '}';
    }
}
