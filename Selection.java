/*
Jemma Tiongson
Section #16031
App: Selection.java
Purpose: Demonstrate ability to use if-else statements with the 13 operators we learned in class
 */

/*
Operators tested: > >= < <= == && || ! != : + - ?
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
class Selection{
   public static void main (String [] args){
      JOptionPane pane = new JOptionPane();
      Scanner scan = new Scanner(System.in);
      
      // if selection
      JOptionPane.showMessageDialog(null, "What is 1500 military time converted to regular 12 hour clock system?");
      int hour = 15;
      if(hour < 18){
         JOptionPane.showMessageDialog(null, "1500 military time is 3pm, Have a good day.");
      }
      
      // if else selection
      JOptionPane.showMessageDialog(null, "Do you say Good Evening or Good Day at 1500 mililtary time?");
      if(hour<= 12 || hour <18){
         JOptionPane.showMessageDialog(null, "Good Day.");
      }
      else{
         JOptionPane.showMessageDialog(null, "Good Evening.");
      }
      
      // if else if else selection
      int age;
      JOptionPane.showInputDialog(null, "How old is your car?");
      age = Integer.parseInt(scan.nextLine());
      
      if(age <= 5){
         JOptionPane.showMessageDialog(null, "Your car is 5 years or younger.");
      }
      else if( age > 5 && age < 15){
         JOptionPane.showMessageDialog(null, "Your car is between the age of 5 and 15 years old.");
      }
      else{
         JOptionPane.showMessageDialog(null, "Your car is old as heck..");
      }
      
      // if else if else if else selection
      String performance = "";
      int goal;
      int actual;
      double bonus;
      JOptionPane.showInputDialog(null, "You work in Jewelry. What was your goal this month?");
      goal = Integer.parseInt(scan.nextLine());
      JOptionPane.showInputDialog(null, "How much did you actually sell?");
      actual = Integer.parseInt(scan.nextLine());
      if(actual >= goal){
         performance = "Excellent!";
         bonus = (actual * 0.03) + 500;
      }
      else if(actual >= .80*goal){
         performance = "Good!";
         bonus = (actual * 0.03)+ 250;
      }
      else if(actual >= .50*goal){
         performance = "Satisfactory.";
         bonus = (actual * 0.03)+ 100;
      }
      else{
         performance="Poor.";
         bonus = (actual * 0.03);
      }
      JOptionPane.showMessageDialog(null,"Your sales goal of the month was: " +goal+ ". Your actual total sales was: " +actual+ ". Monthly performance is: " +performance+ " Your bonus of the month is: $" +bonus+ ".");
     
      // nested if selection
      int userAge;
      JOptionPane.showInputDialog(null, "I hope this isn't too forward... but how old are you, user?");
      userAge = Integer.parseInt(scan.nextLine());
      
      if(userAge < 13){
         JOptionPane.showMessageDialog(null, "WOW. You are a youngin'!");
      }
      else if(userAge < 19){
         JOptionPane.showMessageDialog(null, "You are no longer a child, but a young adult in your teens!");
      }
      else{
            if( userAge < 65){
               JOptionPane.showMessageDialog(null, "You're an adult!");
            }
            else{
               JOptionPane.showMessageDialog(null, "You're a wise senior.");
            }
      }
      
      //extra: for ! operator
      
      boolean statement = true;
      if(!true){
         JOptionPane.showMessageDialog(null, "Statement is false.");
      }
      else{
         JOptionPane.showMessageDialog(null, "Statement is true.");
      }
      //switch statment
      int day;
      JOptionPane.showInputDialog(null, "Today is what number of the week?");
      day = Integer.parseInt(scan.nextLine());
      switch(day){
         case 1:
            JOptionPane.showMessageDialog(null, "Today is a Sunday.");
            break;
         case 2:
            JOptionPane.showMessageDialog(null, "Today is a Monday.");
            break;
         case 3:
            JOptionPane.showMessageDialog(null, "Today is a Tuesday.");
            break;
         case 4:
            JOptionPane.showMessageDialog(null, "Today is a Wednesday.");
            break;
         case 5:
            JOptionPane.showMessageDialog(null, "Today is a Thursday.");
            break;
         case 6:
            JOptionPane.showMessageDialog(null, "Today is a Friday.");
            break;
         case 7:
            JOptionPane.showMessageDialog(null, "Today is a Saturday.");
            break;
         default:
            JOptionPane.showMessageDialog(null, "You have to pick a number between 1-7");
            break;
      }
      //ternary operator
      
      double randomValue = (Math.random()*5);
      int newRandom = (int) randomValue;
      boolean someResult = (randomValue  <= 2) ? true: false;
      JOptionPane.showMessageDialog(null, "The randomResult was " +newRandom+ ". And the result is " +someResult+ ".");
   }
}


//Int input = Integer.parstInt(JOptionPane,showInputDialog(null, "?"));
