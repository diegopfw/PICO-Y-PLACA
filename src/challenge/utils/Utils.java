/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.IntStream;

/**
 *
 * @author diego
 */
public class Utils {
    
    public static Boolean isInArray(int[] values, int value){
        return IntStream.of(values).anyMatch(x -> x == value);
    }
    
    public static Boolean isNumber(String value){
        try {
            Integer.parseInt(value);
            return Boolean.TRUE;
        } catch(NumberFormatException e){
             return Boolean.FALSE;
        }
    }
    
    public static Boolean isEmpty(String value){
        return value == null || value.trim().isEmpty();
    }
    
    public static Integer getWeekDayNumberFromDate(String dt){
        Calendar calendar = Calendar.getInstance();
        
        try {
            SimpleDateFormat localDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = localDateFormat.parse(dt);
            
            calendar.setTime(date);
            
        } catch (ParseException ex) {
           System.out.println("error");
        }
        
        return (calendar.get(Calendar.DAY_OF_WEEK) - 1);
    }
    
    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT);
        dateFormat.setLenient(false);
        try {
          dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
          return false;
        }
        return true;
    }
    
    public static boolean isBetween(String fieldHour, String initHour, String endHour){
       
        String[] parts = fieldHour.split(":");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
        cal1.set(Calendar.MINUTE, Integer.parseInt(parts[1]));

        parts = initHour.split(":");
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
        cal2.set(Calendar.MINUTE, Integer.parseInt(parts[1]));

        parts = endHour.split(":");
        Calendar cal3 = Calendar.getInstance();
        cal3.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
        cal3.set(Calendar.MINUTE, Integer.parseInt(parts[1]));

        if(cal1.after(cal2) && cal1.before(cal3)) {
            return true;
        }
        return false;
    }
}
