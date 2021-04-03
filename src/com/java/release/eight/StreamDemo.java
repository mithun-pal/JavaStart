package com.java.release.eight;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.*;

public class StreamDemo {
    public  static void main(String[] args){
        List<Integer> l=new ArrayList<Integer>();
        l.add(0); l.add(10); l.add(15); l.add(20); l.add(25);
        List<Integer> l1=l.stream().filter(I -> I%2==0).collect(Collectors.toList());
        List<Integer> l2=l.stream().map(I -> I*2).collect(Collectors.toList());

        /*System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);*/
LocalDate date=LocalDate.now();
LocalTime time=LocalTime.now();
        //System.out.println(date);
        //System.out.println(time);
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy=date.getYear();

        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();

        LocalDateTime dt=LocalDateTime.now();
        int d=dt.getDayOfMonth();
        int mon=dt.getMonthValue();
        int yy=dt.getYear();

        int hh=dt.getHour();
        int min=dt.getMinute();
        int ss=dt.getSecond();
        int na=dt.getNano();

LocalDateTime specDt=LocalDateTime.of(2017,3,12,14,20,56);

        System.out.printf("Date: %d-%d-%d",dd,mm,yyyy);
        System.out.println();
        System.out.println(dt);
        System.out.printf("\nTimestamp: %d:%d:%d:%d", h,m,s,n);
        System.out.println("\n"+specDt);
        System.out.println("After 5 months: "+specDt.plusMonths(5));
        System.out.println("Before 3 months: "+ specDt.minusMonths(3));
    }
}
