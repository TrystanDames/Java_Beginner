/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;
/**
 *
 * @author User
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class dates {
    public static void main(String[] args) {
//        LocalDate myDate = LocalDate.now();
//        LocalDateTime myDates = LocalDateTime.now();
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        HijrahDate hDate = HijrahDate.from(myDate);
//        
//        System.out.println("Today's date: " + myDate);
//        System.out.println("Today's date and time: " + myDates);
//        System.out.println("Today's date for the Japanese: " + jDate);
//        System.out.println("Today's date for Hijrah: " + hDate);
        
        LocalDateTime myDate = LocalDateTime.now();
//        myDate = myDate.minusMonths(9);
//        myDate = myDate.plusDays(15);
//        System.out.println(myDate);
        
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date Formated: " + sDate);
        
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Date formated with Medium Format Style: " + fDate);
    }       
}
