package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Controller 1- Main Window",300,160); // Create first controller
        Controller2 c2 = new Controller2(model, "Controller 2- Secondary Window",550,200); // Create second controller
        
    } // main
  
} // Main
