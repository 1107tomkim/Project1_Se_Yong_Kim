*** INTERVIEWER - TOMMY KIM ***
*** INTERVIEWEE - CODY CRUZ ***

**Q1. What is SDLC? Give me a popular SDLC**
- Waterfall 
- CORRECTION : 
    - SDLC -> stands for System Development Life Cycle
    - It is used for specific development models.
    - Popular SDLC includes SDLC's such as Waterfall and AGILE
    - Waterfall -> Each phases must complete to move on to the next phase. "Spill" (Linear development)
    - Agile -> Focuses on user experiences and input. It is based on customer feedbacks. Developers focus one task at a time. (Better time allocation and estimation compared to Waterfall because they release and fix based on feedback.)

**Q2. Tell me about Control Flow Statements**
- If, Switch statements, and If Else, they will let us execute statement or block of statement if something turns out to be true.(In cases of If statement). Switch statement, lets us execute based on the value of a variable type.
- CORRECTION : 
    - "If" statement will only allow us to execute a statement or a block statement when the condition turns out to be true.
    - "Switch" statements lets us execute one of several blocks of statements depending on the value of a variable of certain types.  
    - Lets us execute codes based on the conditional statements. I.E -> Nested for loops, we need to make sure one condition is true before moving on to the next conditional statement and so on.

**Q3. What is RDBMS?**
- Regional Database Management System. What we use to maintain, create, and manage our tables within our database. Connects with the RDS such as DBeaver.
- CORRECTION :
    - RDBMS Stands for Relational Database Management System.
    - RDBMS is a type of DBMS that stores data in a row-based table structure.

**Q4. What is a Schema?**
- Controls the structure of the table and the database. I.E -> if you took out all the values and tables in the database, you are left with the schema.
- CORRECTION :
    - Schema is a strucure or layout defining a set of data. (Correct answer above, just abbreviated)

**Q5. What are some SQL Sub languages?**
- DDL -> Data Definition Language : which includes CREATE, ALTER, DROP, DELETE. 
- DML -> Data Manipulation Language : makes updates and changes to the table ,  UPDATE, INSERT, INSERT INTO
- DQL -> Data Query Language : Select
- DCL -> Data Control Language : where you control the accessibility of all the tables and how the users interacts with it, var and varchar
- TCL -> Transitional Control Language : where you control the  processes of one table.
- CORRECTION :
    - DDL -> CREATE, DROP, AND ALTER. Delete is not a part of DDL
    - DML -> UPDATE, INSERT, DELETE
    - DCL -> It is a SQL sub language that manages access. I.E -> GRANT, REVOKE, CREATE USER
    - TCL -> Transaction Control Language. I.E ->BEGIN, COMMIT, ROLLBACK, SAVEPOINT

**Q6. What is the difference between HashMap and Hashtable?**
- HashMap can be accessed through an index, iterated through an index.
- CORRECTION :
    - Main difference between a HashMap and a HashTable is that HashMap is non-synchronized whereas Hashtable  is synchronized.
    - This simply means that Hashtable is thread-safe and can be shared between multiple threas wherehas HashMap can not  without proper syhronization.
    - (Patrick please give us a simpler explanation.)

**Q7. Tell me about Queue Interface**
- A list of interfaces that is set by insertion and callable through preparedstatements. I.E -> preparedstatements , resultset.
- CORRECTION :
    -  *** Queue are typically FIFO -> which means first in first out. ***
    - Queue places objects on a "waiting list"
    - There are few methods in a Queue such as -> add(), peek(), poll(), remove().

**Q8. What is Binary Search?**
- Where you are searching in the binary code, the machine code for something. I.E -> searching for errors or exceptions.
- CORRECTION :
    - A method for searching for a given item in a sorted array.
    - Allows us to assume that specific values or objects that we are looking for will not exist past a certain point if the condition of that value moving past the index is false. 
        - I.E -> If we have a list of 100 Integer values that are sorted in ascending order and we are looking for Integer value 32.
        - We check the 50th index of the list and get a return value of 49. 
        - Here we can assume that anything moving on forward (Index 50 to Index 100) will not have the integer value 32, because it is sorted in increasing order.
        - (Patrick could you please let us know what else would be important to know!)

**Q9. How is PriorityQueue different from standard queues?**
- Priority queue executes first, whereas standard queues are executed when called upon.
- CORRECTION : 
    - PriortyQueue is different from Standard queue which implements FIFO logic which is first in first out. 
    - PriortyQueue can set specific priorities that can be overriden by a comparator provided at queue construction time.

**Q10. What is O(n) vs. O(log n)**
- Constructor
- CORRECTION : 
    - O(n) vs. O(log n) is what we call Time Complexity
    - It is a way to measure how long something will take for the program top run.
    - It is used to measure efficiency 
    - O(n) -> Linear time
    - O(log n) -> Logarithmic time
    - Common Big O Notations includes 
        - O(1) -> Constant time
        - O(N) -> Linear time
        - O(N^2) -> Quadratic time
        - O(log(n)) -> Logarithmic time.