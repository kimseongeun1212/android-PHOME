package com.smu.team_andeu.data;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "routine")
public class Routine  {
    @PrimaryKey
    private int routineId;
    private String r_name;
    private double r_totalCal;
    private int r_totalTime;
    private String r_summary;
    private int category;
    private int count;
    @ColumnInfo(defaultValue = "0")
    private int maxOrder;

    public Routine(int routineId, String r_name, double r_totalCal, int r_totalTime, String r_summary, int category, int count, int maxOrder) {
        this.routineId = routineId;
        this.r_name = r_name;
        this.r_totalCal = r_totalCal;
        this.r_totalTime = r_totalTime;
        this.r_summary = r_summary;
        this.category = category;
        this.count = count;
        this.maxOrder = maxOrder;
    }



    public int getRoutineId() {
        return routineId;
    }

    public void setRoutineId(int routineId) {
        this.routineId = routineId;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public double getR_totalCal() {
        return r_totalCal;
    }

    public void setR_totalCal(double r_totalCal) {
        this.r_totalCal = r_totalCal;
    }

    public int getR_totalTime() {
        return r_totalTime;
    }

    public void setR_totalTime(int r_totalTime) {
        this.r_totalTime = r_totalTime;
    }

    public String getR_summary() {
        return r_summary;
    }

    public void setR_summary(String r_summary) {
        this.r_summary = r_summary;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(int maxOrder) {
        this.maxOrder = maxOrder;
    }
}


