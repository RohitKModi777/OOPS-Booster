/*
                                   Simple understanding Class => Properties + fuctions
Class is a user defined data type which defines it's properties and functions.
Class is the only logical representation of the data.
  -For example -> Human Being is a class, The body parts of human beings are it's properties, and the actions performed by the body parts are known as functions.

The Classes do not copy any memory space till the time an Object is instantiated.  
*/


/*
            Object - any entity around you object or person exist in surrounding in the world.
Object is a run time entity. It is an instance of the class. An Object can represent noun.
An Object can operate on both data members and member function. 
*/


/* Note : When an object is created using a **new** keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.*/

/*
this keyord refers current object
‘this’ keyword :  ‘this’ keyword in Java that refers to the current instance of the class. 
In OOPS it is used to:  pass the current object as a parameter to another method  refer to the current class instance variable 
*/



class Pen {
   String color;
  
   public void printColor() {
       System.out.println("The color of this Pen is " + this.color);
   }
}

class Student{
  String name;
  int age;

  public void getInfo(){
    System.out.println("The name of this Student is " + this.name);
    System.out.println("The age of this Student is " + this.age);
  }
}

public class OOPS{
  public static void main(String[] args){
       Student s1 = new Student();
       s1.getInfo();
       Pen p1 = new Pen();
       p1.color = blue;


       Pen p2 = new Pen();
       p2.color = black;


       Pen p3 = new Pen();
       p3.color = red;


       p1.printColor();
       p2.printColor();
       p3.printColor();
  }
}

