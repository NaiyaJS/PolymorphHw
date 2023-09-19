# CH5789

# Java Inheritance and Polymorphism
## Inheritance

Inheritance is a mechanism in which one class (the child or subclass) inherits properties and behaviors (fields and methods) from another class (the parent or superclass). It promotes code reusability and the creation of a hierarchy of classes.

### Syntax

`java
class ParentClass {
    // Fields and methods
}

class ChildClass extends ParentClass {
    // Additional fields and methods
}

`
### Key Concepts

- **Superclass (Parent Class):** The class whose properties and behaviors are inherited.
- **Subclass (Child Class):** The class that inherits properties and behaviors from the superclass.

### Example

`java
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");`
    }
}
`

## Polymorphism

Polymorphism is the ability of different classes to be treated as instances of the same class through a common interface. It allows you to write more flexible and extensible code.

### Types of Polymorphism

1. **Compile-time Polymorphism (Method Overloading):** It occurs when methods with the same name but different parameters are defined in the same class.

2. **Runtime Polymorphism (Method Overriding):** It occurs when a subclass provides a specific implementation of a method defined in its superclass.

### Example

`java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
`

### Polymorphism in Action

`java
Shape shape1 = new Circle();
Shape shape2 = new Square();

shape1.draw(); // Calls the Circle's draw method
shape2.draw(); // Calls the Square's draw method
`
----------------------------------------------------------------------------------------------------------------------------------
# Java Interfaces and Abstract Classes

In Java, interfaces and abstract classes are powerful object-oriented programming (OOP) concepts that provide a way to define the structure and behavior of classes. They help in designing flexible and extensible code by allowing the specification of methods and properties that subclasses must implement or inherit.


## Interfaces

An interface in Java is a blueprint for a class. It defines a set of abstract methods (methods without implementation) that any class implementing the interface must provide. Interfaces enable multiple classes to share a common set of method signatures, promoting code reusability and allowing classes to adhere to a contract.

### Syntax

`java
interface MyInterface {
    void method1(); // Abstract method
    int method2();  // Abstract method
}
`

### Key Concepts

- **Abstract Methods:** Methods declared in an interface that have no implementation.
- **Implements:** A class that implements an interface must provide implementations for all of the interface's abstract methods.
- **Multiple Interfaces:** A class can implement multiple interfaces.

### Example

`java
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
`

## Abstract Classes

An abstract class in Java is a class that cannot be instantiated and may contain abstract methods (methods without implementation) that must be implemented by its subclasses. Abstract classes provide a way to share common functionality among related classes while allowing some flexibility in the implementation.

### Syntax

`java
abstract class MyAbstractClass {
    abstract void method1(); // Abstract method
    void method2() {
        // Concrete method with implementation
    }
}
`

### Key Concepts

- **Abstract Methods:** Methods declared in an abstract class without implementation.
- **Extends:** A subclass of an abstract class must provide implementations for all abstract methods in the superclass.
- **Concrete Methods:** Abstract classes can have concrete (fully implemented) methods.

### Example

`java
abstract class Shape {
    abstract double area(); // Abstract method
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
`

Interfaces and abstract classes are essential components of Java's OOP model. Interfaces define a contract that classes must adhere to, while abstract classes provide a way to share common functionality among related classes. Both concepts are valuable tools for designing flexible and maintainable Java applications.
-----------------------------------------------------------------------------------------------------
# Constructors and Garbage Collection in Java

Constructors and garbage collection are fundamental concepts in Java that play a crucial role in object-oriented programming and memory management. Constructors are used for initializing objects, while garbage collection ensures efficient memory usage by reclaiming memory from objects that are no longer needed.

## Constructors

### What Are Constructors?

In Java, a constructor is a special type of method that is used to initialize an object when it is created. Constructors have the same name as the class and do not have a return type, not even `void`. They are called automatically when an object is instantiated.

### Syntax

`java
public class MyClass {
    // Constructor
    public MyClass() {
        // Initialization code
    }
}
`

### Types of Constructors

1. **Default Constructor:** If you don't define any constructors in your class, Java provides a default constructor with no arguments.

2. **Parameterized Constructor:** You can define constructors with parameters to initialize object properties during creation.

### Example

`java
public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
`

## Garbage Collection

### What Is Garbage Collection?

Garbage collection is the process in Java that automatically reclaims memory occupied by objects that are no longer reachable and in use by the program. Java's Garbage Collector (GC) manages memory automatically, preventing memory leaks and improving memory efficiency.

### How Garbage Collection Works

1. **Mark:** The GC identifies objects that are still in use by tracing object references starting from known "roots" like the main method and instance variables.

2. **Sweep:** Unreachable objects are identified and removed from memory.

3. **Compact (optional):** Memory fragmentation can occur after removal. Some garbage collectors perform memory compaction to optimize memory usage.

### Explicitly Calling Garbage Collection

In most cases, you don't need to manually trigger garbage collection. Java's GC runs automatically. However, you can suggest the JVM to run garbage collection using:

`java
System.gc();
`

### Best Practices

- Avoid holding references to objects longer than necessary.
- Be cautious with object pools and caches, as they can prevent objects from being garbage collected.


Constructors are used for initializing objects during creation, while garbage collection automatically manages memory by reclaiming resources from unreachable objects. Understanding these concepts is crucial for effective Java programming and memory management.

