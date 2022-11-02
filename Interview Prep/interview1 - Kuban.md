**Q1. What is Java**
- A: Compiled, High level  progamming language, mostly used for OOP. There are several versions of Java. The most widely used ones are java 8 and java 11, One of the few programming language that can run on any machine because it is run once and run anywhere.
- CORRECTION:

**Q2. What are the four pillars of OOP**
- A: 
Encapsulation -   getter and setter to limit access to certain method
inheritance -  inheriting properties  of another class. (Methods can be overridden)
abstraction -  using abstraction to reduce the amount of methods using boiler plate. (Abstraction method and class's)
                Abstract class can not be inherited.
polymorphism - Can be used for multiple things. I.E two methods with same name but different input and different outputs.
- CORRECTION: Just go a little bit more in-dept regarding polymorphism.

**Q3. Tell me about variable scopes in Java**
- A: See where variables are accessible. Look at the curly brackets to see where the variables are accessible. Examples provided such as a for loop and variables within those loops. Class scope, block scope, method scope
- CORRECTION: Talking about the Instance scope.

**Q4. What is the difference between Overloading and Overriding?**
- A: Overriding -> you have a method that is inherited or extened/implemented, you are trying to over-write and change what it does. Overloading -> methods of same name but takes in different variables.
- CORRECTION:

**Q5. What are primitives in Java?**
- A: Datatypes that exists in Java. Reason why Java is not 100% OOP. Have 8 different primitives-> boolean are used for true and false, byte, short, char, int used for numbers, double is used for numbers with denominations, float, long used for really long numbers.
- CORRECTION:

**Q6. Tell me about Collection Hierachy(Framework) in Java.**
- A: Set, list, hash things that are iterable. Each of them have different uses for them.
- CORRECTION: Everything was good, just need to make sure to replace hash with Queue and talk about what each of those branches include such as list having ArrayList vectors and etc as well as other branches.

**Q7. What is Normalization in SQL?**
- A: When you are trying to remove as much redundancy from database.
   - 1NF -> When you remove anything that is not unique, same student in two different tables.
   - 2NF -> You can not have data that can be extrapulated from the tables.
   - 3NF -> Nothing but the Key and no redundancy from any kind.
   - Used to make sure that the datatables are resilliant and not relied on each other.
- CORRECTION:
1NF -> Need to clarify and make sure that 1NF does not compare two different table and mention primary key and Unique entries


**Q8. What are some constraints in SQL?**
- A: 
   - Groupby -> groups data by the similarities
   - Sortby -> groups data and orders them
   - Where -> Allows you to select specific entries that you are looking for based on what you're searching for
   - Having -> looking for specific id or name that you are specifically looking for.
- CORRECTION: Constraints are things that declare the variables in SQL.
            Things such as NOT NULL, PRIMARY KEY, SERIAL, UNIQUE and etc.
            CLAUSES->  are what holds things such as groupby, sortby,  where, having.

**Q9. What are the different joins in SQL?**
- A: 
   - Several different types of joins in SQL. 
   OUTTER JOIN - looking for data that is different between the two tables,  
   - INNER JOIN - two  tables with similar entries within the two tables,  
   - LEFT JOIN - looking for any similarties in the right table and anything that is on the left table , 
   - RIGHT JOIN - Any similarties with the left table and any entries from the right table.
- CORRECTION:

**Q10. What is the difference between Throw Throws and Throwable**
- A: 
   - Throw - Unsure , will look further into it later to get familiarized
   - Throws - Used when throwing an exception, can be checked or unchecked expression. Want to throw a specific exception such as SQL or etc.
   - Throwable - Unsure, will look further into it later to get familiarized

- CORRECTION:
   - Throws ->  is used excplicitly within the signature method to throw a pre-defined exception
   -  Throw -> Throw is when the exception is explicitly thrown from a method or a block of code
   - Throwing -> is the super class which holds throws and throw.