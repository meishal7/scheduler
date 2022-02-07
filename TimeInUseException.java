package L05_Scheduler;

/** 
* TITLE: TimeInUseException.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 3
* PROJECT: Lab 05_Scheduler
* LAST MODIFIED: 09/22/2020
* DESCRIPTION: TimeInUseException class declaration. 
*
* ALGORITHM: 
* declare public class TimeInUseException extends Exception
* create no argument constr and define super("This time is not available. Choose another time.")
* create one argument constr and define super(message) constr inside
* 
* PACKAGES INCLUDED: no 
*/   
//import java.sql.Time;

public class TimeInUseException extends Exception{
     /**
     * No arguments constructor
     */
    public TimeInUseException(){
        super("This time is not available. Choose another time.");
    }
    /**
     * One argument constructor, message
     */
    public TimeInUseException(String message){
        super(message);
    }

}
    

