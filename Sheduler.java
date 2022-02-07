/** 
* TITLE: Scheduler.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 3
* PROJECT: Lab 05_Scheduler
* LAST MODIFIED: 09/22/2020
* DESCRIPTION: this program asks user to enter the time and name for an appointment, 
*              validates time and creates an appointment
*
* ALGORITHM: 
* declare array for names, int time, int counter, String name, Scanner object
* create while(counter < 6)
*   create try-catch block
*   prompt the user to enter time
*   validate user input and throw an exception if time is not valid
*   validate if time is available and throw an exception if it's not
*   if there is no exceptions, add name into array in appropriate time slot
*   display all current appointments
*   counter++
* 
* 
* PACKAGES INCLUDED
* import java.util.Scanner for user input
* 
* 
*/   
package L05_Scheduler;

import java.util.Scanner; //for user input

public class Sheduler {
  public static void main(String[] args) {
    //Declaration
    String[] names = new String[6];
    int time = 0, counter = 0;
    String name = "";
    
    
    Scanner keyboard = new Scanner(System.in);
    
    while(counter < 6){
      try
      {
        //User prompt
        System.out.print("\nEnter time for your appointment between 1 and 6 pm (enter integer) ");
        time = keyboard.nextInt();
        //Time validation
        if(time < 1 || time > 6){
            throw new InvalidTimeException();
        }
        //Check if this time is available
        else if(names[time-1] != null){ 
            throw new TimeInUseException();
        }
        //User prompt
        System.out.print("Enter name for your appointment ");
        keyboard.nextLine();
        name = keyboard.nextLine();
        names[time-1] = name; //add name to array in appropriate time slot
        System.out.println("Your appointment is at " + time + "pm.");
        counter++;
        
        //Display current appointments
        System.out.println("Here are the current appointments:");
        System.out.println("1:00pm: " + names[0]);
        System.out.println("2:00pm: " + names[1]);
        System.out.println("3:00pm: " + names[2]);
        System.out.println("4:00pm: " + names[3]);
        System.out.println("5:00pm: " + names[4]);
        System.out.println("6:00pm: " + names[5]);
      
      }
      catch(InvalidTimeException e1)
      {
        System.out.print(e1.getMessage());
      }
      catch(TimeInUseException e2)
      {
        System.out.print(e2.getMessage());
      }
    }//end of while
    System.out.println("All appointments have been booked!");
}
    
}
    

