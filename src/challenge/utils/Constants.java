/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.utils;

/**
 *
 * @author diego
 */
public class Constants {
    
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm";
    
    public static enum Day {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6),SUNDAY(7);

        private final int levelCode;

        private Day(int levelCode) {
            this.levelCode = levelCode;
        }
        
        public int getLevelCode(){
            return levelCode;
        }
    }
    
    public static final int[] MONDAY_NUMBERS = new int[]{1, 2};
    public static final int[] TUESDAY_NUMBERS = new int[]{3, 4};
    public static final int[] WEDNESDAY_NUMBERS = new int[]{5, 6};
    public static final int[] THURSDAY_NUMBERS = new int[]{7, 8};
    public static final int[] FRIDAY_NUMBERS = new int[]{9, 0};
    public static final String MORNING_INIT_HOUR = "7:30";
    public static final String MORNING_END_HOUR = "9:30";
    public static final String NIGHT_INIT_HOUR = "16:30";
    public static final String NIGHT_END_HOUR = "19:30";
    
    
   //messages
    public static final String CAN_BE_ON_THE_ROAD = "The car can be on the road";
    public static final String CAN_NOT_BE_ON_THE_ROAD = "The car can not be on the road";
    public static final String VALUE_IS_EMPTY = "Fields can not be empty";
    public static final String DATE_FORMAT_ERROR = "You must enter a valid format date like 2015-06-06";
    public static final String PLATE_NUMBER_FORMAT_ERROR = "The plate number must end in a number";
    
    //data for unit tests
    public static final String FIELD_HOUR = "8:00";
    public static final String INIT_HOUR = "7:30";
    public static final String END_HOUR = "9:30";
    public static final String DATE = "2018-06-19";
}
