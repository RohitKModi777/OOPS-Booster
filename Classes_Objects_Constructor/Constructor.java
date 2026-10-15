/*********  Note : Unlike languages like C++, Java has no Destructor. Instead, Java has an efficient  garbage collector that deallocates memory automatically.    ********/
/*
     Constructor => called automatically called when object created
Constructor is a special method which is invoked automatically at the time of object creation.
It is used to initialize the data members of new objects generally. 

  //Some Basic Role of Constructor//
    - Constructors have the same name as class or structure. 
    - Constructors don’t have a return type. (Not even void)
    -Constructors are only called once, at object creation.
*/

/*
      Types Of Constructor 
1. Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.
2. Parameterized constructor : Constructor which has parameters is called a parameterized constructor. It is used to provide different values to distinct objects. 
3. Copy Constructor : A Copy constructor is an overloaded constructor used to declare and initialize an object from another object. 
        -There is only a user defined copy constructor in Java(C++ has a default one too).
*/


/*
Non Parametrized Constructor - there is no paramerter passed in constructor
after class we make an object in main class to call the class object for example - Student s = new Student()
this Student() -> is a constructor which indicates automatically called by java when object created
   ///Check the Example Below\\\\
*/

class Student {
   String name;
   int age;
  
//This indicates our constructor {manually checking} -below         
  Student() {    
      System.out.println("Constructor called");   
      }
   }


/*Parameterized Constructor - has parameter to call for clarity check below example*/
class Student {
   String name;
   int age;
  
   Student(String name, int age) {
       this.name = name;
       this.age = age;
   }
}


/*Copy Constructor - creating second object with the by copying first constructor , for clarity check below example */
class Student {
   String name;
   int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
   }
  Student(){
  
  }
}

class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name ="Aarav";
        s1.age =21;
        s1.printInfo();

      Student s2 = new Student(s1);
      s2.printInfo();
   }
}
