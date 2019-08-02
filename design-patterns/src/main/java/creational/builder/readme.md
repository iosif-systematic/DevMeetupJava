### Builder pattern
#### Reason to use the pattern: 
In Clean Code, Uncle Bob argues for three as an general upper limit for number of parameters. He makes the radical claim:

The ideal number of arguments for a function is zero (niladic). Next comes one (monadic) followed closely by two (dyadic). Three arguments (triadic) should be avoided where possible. More than three (polyadic) requires very special justification—and then shouldn't be used anyway.

He says this because of readability; but also because of testability:

Imagine the difficulty of writing all the test cases to ensure that all various combinations of arguments work properly.


#### Pros
1) Code is more maintainable if number of fields required to create object is more than 4 or 5.
2) Object Creation code less error-prone as user will know what they are passing because of explicit method call.
3) Builder pattern increase robustness, as only fully constructed object will be available to client.
4) You can force immutability to the object once its created.
#### Cons
1) Builder pattern is verbose and requires code duplication as Builder needs to copy all fields from Original or Item class.

#### Description




#### Exercises

1. Refactor [Car](./exercises/Car.java) class to use "Builder design pattern".
2. Discuss about [version 2](./exercises/CarV2.java) of the Car class. What are the advantages and disadvantages.
3. Discuss security issue by throwing exception in constructor