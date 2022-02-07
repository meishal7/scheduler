/** 
* TITLE: InvalidTimeException.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 3
* PROJECT: Lab 05_Scheduler
* LAST MODIFIED: 09/22/2020
* DESCRIPTION: InvalidTimeException class declaration. 
*
* ALGORITHM: 
* declare public class InvalidTimeException extends Exception
* create no argument constr and define super("Invalid time. Time must be an integer between 1 and 6.")
* create one argument constr and define super(message) constr inside
* 
* 
* 
* PACKAGES INCLUDED: no 
*/   
package L05_Scheduler;

public class InvalidTimeException extends Exception{
    /**
     * No arguments constructor
     */
    public InvalidTimeException(){
        super("Invalid time. Time must be an integer between 1 and 6.");
    }
    /**
     * One argument constructor, message
     */
    public InvalidTimeException(String message){
        super(message);
    }
    
}
