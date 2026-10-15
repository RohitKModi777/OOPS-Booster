/*
    Inheritence - deveried properties from exiting parent property  {parent(will)-> child(will)}
Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. 
   In such a way, you can ****reuse, extend or modify**** the attributes and behaviors which are defined in other classes. 
In Java, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. 
 ->The derived class is the specialized class for the base class. 


Types of Inheritance : 
1. Single inheritance : When one class inherits another class, it is known as single level inheritance 
2. Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 
3. Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class. 
4. Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance. 
  Multiple Inheritence: Not in java, it is used with the help of implements keyword for clarity check Interface abstraction file
*/

// Single Inheritence (parent-> child)
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}

//Multilevel Inheritence (parent -> child-> subchild)
class Shape{
  public void area(){
       System.out.println("Displays Area of Shape");
  }
}

class Triangle extends Shape(){
  public void area(int b, int h){
       System.out.println(1/2 *b* h);
  }  
}

class EquilateralTriangle extends Triangle {
   int side;
  // all 3 sides are equal
  public void area(int b, int h){
       System.out.println(1/2 *b* h);
  }  
}

// Hierarichal Inheritence (parent->child{siblings})
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }
}

// Hybrid Inheritence - Mix of all above



