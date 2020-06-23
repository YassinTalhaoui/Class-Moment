/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.dev2.TD;

import java.text.DecimalFormat;

/**
 *Obtains an instance of LocalTime from an hour, minute and second.
 *This returns a LocalTime with the specified hour, minute and second. The nanosecond field will be set to zero.
 *
 * @author g54892
 */
public class Moment {
    private int hour;
    private int minute;
    private int second;
    
    /**
     * Constructs and initializes the hour, minute, second of a moment of the day.
     * 
     * @param hour a number of hours (integer)
     * @param minute a number of minutes (integer)
     * @param second a number of seconds (integer)
     */
    public Moment(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
        if(hour>23 || hour<0){
            throw new IllegalArgumentException("heure invalide : " + hour);
        }
        else if(minute>59 || minute<0){
            throw new IllegalArgumentException("minute invalide : " + minute);
        }
        else if(second>59 || second<0){
            throw new IllegalArgumentException("seconde invalide : " + second);
        }
    }

    public Moment() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    
    
    /**
     * gets a number of hour
     * 
     * @return the number of hours
     */
    
    public int getHour() {
        return hour;
    }
    
    /**
     * gets a number of minutes
     * 
     * @return the number of minutes
     */

    public int getMinute() {
        return minute;
    }
    
    /**
     * gets a number of seconds
     * 
     * @return the number of seconds
     */

    public int getSecond() {
        return second;
    }
    
    /**
     * This object (which is already a string!) is itself returned.
     * 
     * @return  the string itself.
     */
    @Override
    public String toString() {        
        String h = new DecimalFormat("00").format(getHour());
        String m = new DecimalFormat("00").format(getMinute());
        String s = new DecimalFormat("00").format(getSecond());
        String format = h + ":" + m + ":" + s;
        return format;
    }
    
    /**
     * Cheks that two moments are equal, it seems, the two moments 
     * have the value of hour, minute and seconds.
     *
     * @param other a given moment.
     * @return true if two moments are equal, false otherwise.
     */
    
     public boolean equals(Moment other){
         if(other != null && other instanceof Moment){
             int heure = ((Moment)other).getHour();
             int minutes = ((Moment)other).getMinute();
             int secondes = ((Moment)other).getSecond();
            if( heure ==(this.hour) 
                  && minutes == (this.minute)
                  && secondes == (this.second)){
             return true;
         }
     }
        return false;
    }
     
     /**
      * Converts the given hour into the corresponding number of seconds.
      * @return the seconds that represents the given hour at 00:00:00 format.
      */
     public int toSecond(){
        return hour*3600+minute*60+second; 
     }
     
     /**
      * Compares two moments and returns 1, -1 or 0.
      * @param other a given moment.
      * @return -1 if other is afther than the current moment,
      * 1 if other is before than the current moment, 0 otherwise.
      */
     public int compareTo(Moment other){
         if(other.toSecond()<this.toSecond() /*< 0*/){
             System.out.print( this + " comes afther " + other);
             return 1;
         }else if( other.toSecond()>this.toSecond() /*> 0*/){
             System.out.print( this + " comes before " + other);
        return -1;
         }
         System.out.print(" It's the same moment");
        return 0;
        
         
     }
    
}
    