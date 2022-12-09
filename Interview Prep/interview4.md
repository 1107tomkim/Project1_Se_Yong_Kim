*** INTERVIEWER - TOMMY KIM ***
*** INTERVIEWEE - Hika Lamu***

**Q1. What is JAVA?**
- Class based OOP language that is used for backend development. Write onces run anywhere. Has 4 pillars which are Abstraction, Polymorphism, Inheritence, and Encapsulation.

- CORRECTION : 


**Q2. What are the four pillars of OOP**
- Abstraction -> Abstraction you declare a class abstract, abstract class can not be instantiated. We use Abstraction to hide certain methods.
- Polymorphism -> When certain methods can have many forms. Meaning you can use same method name but overload or override the methods. Overload is same method but different number of parameters or different method type for overloading, overriding main class and sub class dont change the signature of the method but change the implementation of the method.
- Inheritence -> When a subclass inherits another class and implements the properties of the main class
- Encapsulation -> Wrapping of code into a single unit. Done by declaring variables by private in the main class. Sub class can access those properties by getter and setters.

- CORRECTION : 
    - Abstraction -> Also mention it is the pillar of OOP in Java that allows us to only show what we want to show to the users of the application.
    - Inheritence -> Use the keyword "Extends" instead of implements when describing how it inherits.
    - Encapsulation -> Binding data and methods. Instead of just stating the Private access modifiers, you can also talk about the 4 different access modifiers, and why we use Getter and Setter to retrieve and set values. -> Getters/Setter and Access Modifiers are used in Java Encapsulation for security within code building so that we dont have access to data or variables where we dont want them.


**Q3. What are the primitives values in Java and their sizes?**
- Boolean -> 1 bit
- Integer -> 2 bytes
- Byte -> 1 bytes
- Float -> 2 bytes
- Double -> 4 bytes
- Char -> 2 bytes
- Knows that there are 8.

- CORRECTION :
- boolean -> 1 bit
- byte -> 1 byte
- char -> 2 byte
- short -> 2 byte
- int -> 4 byte
- float -> 4 byte
- double -> 8 byte
- long -> 8 byte 


**Q4. What is a Constructor?**
- Constructor is a special type of method which is called when we instantiate a class. It's simply intializes an object.

- CORRECTION : It would be great to also speak about what invokes the constructor -> "new" keyword. -> Also talk about how there are multiple different types of constructors such as no args constructors that are implicitly created when creating an object. And different parameterized constructors that can hold multiple different number of variables that are declared in the class.


**Q5. What does the Static keyword do?**
- Static keyword makes certain variable or method static. Meaning it makes it belong to the class in an instance. That methods or variable declared static will be in a single location in memory and its value can be used across different instances.

- CORRECTION :


**Q6. What is Interface?**
- Interface looks like a class, but need to use interface keyword to create it. Things declared in the interfaces needs to be implemented in other classes with the keywords implements. Lays down a contract that a class needs to implement.

- CORRECTION : interfaces are one of the core  concepts in Java that is used to achieve abstraction, polymorphism, and multiple inheritances. The main purpose of interfaces are to declare functionality(usually including method stubs).


**Q7. What are the different scopes in Java?**
- Global scope -> Declared outside the method and accessible 
- Method scope -> Declared inside the method and accessible only within the method
- Block scope -> Declared inside the block, like conditional block and only accessible within that block

- CORRECTION : Instead of global scopes, in Java they are called class level scope or class scope -> Which are variables that are declared within a class and is accessible by all methods in that class.


**Q8. What is the difference between Errors and Exceptions?**
- Exceptions are unexpected events thats usually due to the fault of the programmers. Errors are somethings that are out of the control of the programmers like when memories are full. Errors can not be handled by programmers whereas Exceptions can be handled by programmers.

- CORRECTION : Answer is great, maybe speak a little more in-dept regarding how we can manage exceptions as a programmer using try-catch block and etc.


**Q9. What is the difference between checked and Unchecked exceptions?**
- Checked exceptions are compile time exceptions that has to be handled or thrown by the programmer whereas the unchecked exceptions are run-time exceptions that does not need to be handled.

- CORRECTION : 


**Q10. What is a wrapper class?**
- Wrapper class is a method or something that we use that helps converts primitives into an objects.

- CORRECTION : 