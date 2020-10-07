 

public class Main 
{
  public static void main (String[] args) 
  { 
    /*
    create instances of classes, AKA
    call the class constructor to build
    objects, AKA
    declare and initilize reference variables
    */
    World earth;
    earth = new World (300,300); 

    Turtle yertle = new Turtle (earth);  
    
    /*
    call methods, AKA
    invoke behaviors, AKA
    reach into an object's toolbox and use a tool
    */

    yertle.forward ();
    int xp = yertle.getXPos ();
    int yp = yertle.getYPos ();
    System.out.println ("x= " + xp);
    System.out.println ("y= " + yp);
    
    earth.setVisible (true);
  }
}
