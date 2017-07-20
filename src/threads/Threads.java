/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Family
 */

//Atomic class that implements Runnable
class Atomic implements Runnable{
    //overrides the threads run 
    
    @Override
    public void run(){
        
        for (int i = 0; i < 13; i++){
            atomic();
            //displays Ka-Boom and i up to 13 spots 
            System.out.println("Ka-Boom " + i);
            try {
                //puts thread to sleep for 50 count
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Atomic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //creaters timer and sets to 0 and creates atomic method 
    int timer = 0;
    public void atomic(){
        //tells program to add 1 to timer
        timer++;
        System.out.println("Seconds Passed = " + timer);
    }
}


public class Threads {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       //creates thread one and two 
        Thread t1 = new Thread(new Atomic());
        Thread t2 = new Thread(new Atomic());
       //starts thread one and two  
        t1.start();
        t2.start();
    }
}
    
    

//References
// (2012). Advanced Java: Multi-threading Part 1 -- Starting Threads . Retrieved 
//from https://www.youtube.com/watch?v=YdlnEWC-7Wo&list=PLBB24CFB073F1048E 