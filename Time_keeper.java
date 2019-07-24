/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

/**
 *
 * @author User
 */
public class Time_keeper {
   private int time=0;
   public String [] result = new String [100];
   private int max_time;
    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the max_time
     */
    public int getMax_time() {
        return max_time;
    }

    /**
     * @param max_time the max_time to set
     */
    public void setMax_time(int max_time) {
        this.max_time = max_time;
    }
}
