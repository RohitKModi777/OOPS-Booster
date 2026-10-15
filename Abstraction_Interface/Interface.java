/*  Interface - like contract (you can implement only parent contract)  {Pure Abstraction}
** A class that implements an interface must implement all the methods declared in the interface.
All the fields in interfaces are public, static and final by default.
All methods are public & abstract by default.
Interfaces support the functionality of multiple inheritance.   {5- type of Inheritence }
*/


interface Animal {
   void walk();   // can't make function here 
}


class Horse implements Animal {
   public void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}


// class Chicken implements Animal,Herbivorous {  became the case of multiple inheritence
class Chicken implements Animal {
   public void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}


public class OOPS {
   public static void main(String args[]) {
      Horse horse = new Horse();
      horse.walk();
   }
}
