*** INTERVIEWER - TOMMY KIM ***
*** INTERVIEWEE - Joshua Otero ***

**Q1. Tell me about HTML Document Structure & DOM**
- A:
    - DOM ->   is the document object model, it is an API for HTML.
    - With the DOM, we are able to make changes to the HTML by using Typescript.
- CORRECTION : 
    - HTML Document Structure -> involves the tags that are declared.
    - I.E -> <!DOCTYPE html>, <html>, <body> .. etc
    - It is asking for the structure of an HTML document hence, need to answer with explanation of creation of the HTML webpage.


**Q2. What is HTML Elements and Attributes**
- A: 
    - HTML element are represented by tags in HTML.
    - The attributes are what is inside the tags.
    - I.e class and ids are attributes that can be assigned to an element
- CORRECTION : 
    - It is good to explain that composition of many elements provide the structure of the document.
    - Maybe give some examples of element tags -> <div>, <p> <h1>
    - Rephrase as attributes are included inside the elements. 
    - ***Attributes are Key/Value pairs that give metadata about the tag.***


**Q3. What is Type Coercion in JS**
- A: 
    - Type coercion in JS is the ability to .. 
    - You can add strings together, which is something you can not do in other programming languages
- CORRECTION :
    - The most important thing to bring up when asked about Type Coercion is the difference between "==" and  "==="
    - "==" -> will set a specific value to a certain type of variable. I.E -> 5 == '5' will return true, because it will automatically set the first value which is an int to a string value '5'
    - "===" -> is when you compare the data types and the value of that data. I.E -> 5 === '5' will return false, because it is not the same data type nor the same value.
    - Implicit type coercion -> Implicit type coercion usually happens when you apply operators to value of different types.
        - I.E -> '5' + '3' will yield a value of number variable 8 because we applied the + operator which implicitly type  coerces to numbers 
    - Explicit type coercion -> Explicit type coercion is when you explicity convert the datatype of the variable. 
        - I.E -> Number('3'), this is taking a character value '3' and turning it /  setting it into a number variable 3.


**Q4. Tell me about Closures in JS**
- A: 
    - Closure in JS is when you have a function inside of a function.
    - It is when the function outside the nested inside function has access to the variables from the inside functions even after it has executed
- CORRECTION : CORRECT! 


**Q5. Tell me about DOM Manipulation**
- A: 
    - DOM manipulation is ...
- CORRECTION :
    - DOM manipulation is document object model manipulation.
    - It is when we can add, remove, replace, and cody any element into a DOM tree.
    - I.E -> var elemt = document.createElement('div');
        - elemt.innerHTML = '<p>Hello World</p>';


**Q6. Bubbling vs Capturing**
- A: 
    - They have to do with event listeners
    - Bubbling is from inside and works its way out. Capturing is outside.
- CORRECTION :
    - Event Bubbling is when the event propagates from the target element to its parents. (Bottom to top)
    - Capturing is when the event propagates from the parents to the target element (Top to bottom)
        - Best way to understand this concept is to look at the DOM tree -> DOCUMENT -> HTML -> BODY / HEAD or w.e -> Elements 
            - Bubbling propagates from Elements to Document, whereas capturing propagates from Document to Element.


**Q7. Promises: Catch and Finally**
- A: 
    - Promises are like an object that you are given while you are waiting for a async function to complete
    - Beginning of promise is pending and it eventually resolves or fails
    - After finding out what the result of the promise is, then it runs a try a catch type block 
    - finally runs after the promise regardless of what happens.
- CORRECTION :
    - Promises finally() is a function that is useful for cleanup, once the promise is settled regardless of its outcome.
    - Promises catch() method returns a promise and deals with rejected cases only.


**Q8. Tell me about Componenet lifecycle Methods**
- A: 
    - Not sure.
- CORRECTION :
    - Angular creates a component - > renders it -> creates and renders its children -> checks it -> destroys it before removing it from the DOM
    - There are 8 lifecycle hooks in Angular.
    - ngOnChanges() -> ngOnInit() -> ngDoCheck() -> ngAfterContentInit() -> ngAfterContentChecked() -> ngAfterViewInit() -> ngAfterViewChecked() -> ngOnDestroy()


**Q9. What are Decorators**
- A: 
    - Not sure.
- CORRECTION : 
    - Decorators provide a way to add both annotation and a meta-programming syntax for class declarations and members.
    - I.E -> @component is a decorator. It is a decorator because we can change the content values such as the template, selector, or different imports and use those while not messing with the general @component template. 


**Q10. Structural directives Vs. Attribute directives**
- A: 
    - Structural directives are ngIf ngFor ngSwitch
        - ngIf works like an if statement,  to check if the boolean value is true in its () statements
        - ngFor iterates through a list or array and creates elements each time it does that. 
        - ngSwitch works like a switch statement in Java. Displays whatever element the ngSwitch case matches. (Has a default value like Java Switch)
- CORRECTION : 
    - Angular directives are what we use to manipulate the DOM.
    - Attribute directives are used to change the look and behavior of the DOM
    - ngModel -> directive used for binding, Structural directive ->  used for conditional statement for the DOM, Attribute directive -> used for styling of the DOM
