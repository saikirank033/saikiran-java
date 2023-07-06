package com.week4;



import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

    public class earliest {
        public static void main(String[] args) {
            LocalDate date1 = LocalDate.of(1999,9,20);
            int count=0;
            for(int i = date1.getDayOfMonth();i<=date1.lengthOfMonth();i++){
                if(DayOfWeek.SATURDAY!= date1.getDayOfWeek()&&DayOfWeek.SUNDAY !=date1.getDayOfWeek()){
                    count++;
                }
                date1=date1.plus(1, ChronoUnit.DAYS);
            }
            System.out.println(count);
        }
    }

