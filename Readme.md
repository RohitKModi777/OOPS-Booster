What is OOPS?
OOPS stands for Object Oriented Programming System , It is a methadology or paradigm to design a program using classes and objects.

Why OOPS?
It simplifies the software development and maintenance of code by providing some concept which we will learn in this repo like classes, objects, constructor , 4 pillars of OOPS.

How OOPS used?
OOPS mainly used in industry by using it's 4 pillar for maintaining the vast code bases and when new member has come in industry can understand the code easily with the help of good understanding of oops
it is used with the help of it's four pillars AICOPE (Abstraction, Inheritence, Classes,Objects, Polymorphism, Encapsulation)


Classes  - Blue print of object or instance , properties + function , user defined data
Objects - any entity exists in the world, person,place, thing.
Constructor-  automatically called when object created  , in simple word constructing something, here we construct object
   Types -> Parameterized, Non - Parameterized Constructor, Copy Constructor
Destructor -> Not present in java , Garbage collector doing the work of it   
This Keyword - refers the current object
New Keyword -  object created using it, a memory space made and after creating it called constructor

4 Pillars
Polymorphism - work differently in different situations, behave differently in different situation
 - CompileTime Polymorphism - method overloading
 - RunTime Polymorphism  - method overriding give error in production real time

Inheritence- Derived new properties from existing properties (parent-> child) use extends keyword for inherit the property
Types of Inheritence -
  1-Single Level (parent->Child (directly)), 
  2-Multlevel (parent-> child-> subchild) , 
  3-Hierarichal - (parent->(chid or siblings)), 
  4-Hybrid - combination of multlevel and Hierarichal
  5-Multiple Inheritence (present in C++ not in java)

Abstraction - hiding unnecearry details only show important things
  pure abstraction  - use interface(contract) + abstract use implements keyword  {this is useful to make multiple inheritence}
  not purely abstraction - use only abstract keywordclass function allowed

Package - making a pack of same category things, 
   -> In java we create package using package keyword with same package name folder with same  package name file and creating class then we can access it from main function.
   -> by default we use inbuilt package of java like java.util.* {util package we are using}

Access Modifiers
  -Default
  -Public
  -Private
  -Protected

Encapsulation - bundling in a single unit we use access modifier for encapsuling the things.

Encapsulation is the process of combining data and functions into a single unit called class. 
- In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class.
- In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes.
- Thus, encapsulation makes the concept of data hiding possible.
  *****(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java)***. 



Static Keyword - access the same variable every where in the same file
*** Note - static take memory space at a time didn't change for that variable which we used as static, while object take memory every time when it is created
->Static can be Variable (also known as a class variable)
->Method (also known as a class method)
->Block
->Nested class


  



  

