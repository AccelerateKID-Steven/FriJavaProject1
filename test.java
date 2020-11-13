/*
   Project By:
   Steven Kalis
   Maanav Misra
   project input and output

*/
//Create a Java class for the file and a main!
//Note: Make sure you pay attention to case sentitive code!
import java.util.Scanner;
//library for console 
import javax.swing.JOptionPane;
//library for GUI 
class test{
   
   public static void main(String[] args){
   
   System.out.println("Hello GitHub!");
   
   //comsole to console
   //object - variable of a class
   //"instantiate the variable" = new
   //constructor is like method call
   Scanner keyboard = new Scanner(System.in);
   String age;
   System.out.println("what is your age?");
   age = keyboard.nextLine();
   System.out.println("your age is " + age + "?");
   //console to GUI
   String yearborn;
   System.out.println("what year where you born?");
   yearborn = keyboard.nextLine();
   String birthyear = "you where born in " + yearborn + "?";
   JOptionPane.showMessageDialog(null, birthyear);
   
   //GUI to GUI
   String monthborn;
   monthborn = JOptionPane.showInputDialog("what month where you born");
   String birthmonth = "you were born in the month " + monthborn + "?";
   JOptionPane.showMessageDialog(null, birthmonth);
   
   //GUI to console
   String name;
   name = JOptionPane.showInputDialog("what is your name");
   System.out.println("hi " + name + " it was nice meeting you!");
   }
   //@overide
   //public String toString(String string){
      //String myString = string + "!";
   
      //return myString;
   //} 


}