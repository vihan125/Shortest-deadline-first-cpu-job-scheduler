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
public class run {
    
    public void schedule(Details dd,Time_keeper tk){
    
        String id = dd.getId();
        int deadline= dd.getDeadline();
        int capacity= dd.getCapacity();
        int period= dd.getPeriod();
        int arrival= dd.getArrival_time();
        int time = tk.getTime();
        int i = time;
        
       
          
        if (capacity <= deadline-time){
            
            
            time=time+capacity;
            tk.setTime(time);
            
            for(int a= i;a<tk.getTime();a++){
                tk.result[a]=id;
                }
                dd.setArrival_time(arrival+period);
                dd.setDeadline(deadline+dd.getArrival_time());
                
            }else{
               dd.setArrival_time(arrival+period);
               dd.setDeadline(deadline+dd.getArrival_time());
               
            }
            
        
      
    
    } 

    
    
}
