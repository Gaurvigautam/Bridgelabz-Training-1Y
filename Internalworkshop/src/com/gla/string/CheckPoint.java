package com.gla.string;

public abstract class CheckPoint {
    int CheckPoint;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    CheckPoint(int CheckPoint,String locationName,double distanceFromLast,int expectedDuration,int actualDuration){
        this.CheckPoint=CheckPoint;
        this.locationName=locationName;
        this.distanceFromLast=distanceFromLast;
        this.expectedDuration=expectedDuration;
        this.actualDuration=actualDuration;
    }
    Boolean isDelayed(){
        return actualDuration > expectedDuration;
    }
    abstract boolean isCritical();
    abstract String gettype();
    abstract double calculationPenalty();

}
