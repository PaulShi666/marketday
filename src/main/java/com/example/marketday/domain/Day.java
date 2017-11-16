package com.example.marketday.domain;

import java.sql.Date;

public class Day {
    int dayId;
    Date date;
    String des;

    public Day(int dayId, Date date, String des) {
        this.dayId = dayId;
        this.date = date;
        this.des = des;
    }

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Day{" +
                "dayId=" + dayId +
                ", date=" + date +
                ", des='" + des + '\'' +
                '}';
    }
}
