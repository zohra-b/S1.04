
<p align="center"><h1 align="center">S1.04. Testing</h1></p>

<br>

---

## 📍 Objectives

Learn to work with the JUnit and AssertJ assertion libraries, as well as get introduced to test-driven development (TDD).
---

## 👾 Exercises
### 📌 Level 1 - ex 1
Create a Java class that manages a collection of books in a library. The class should allow adding books, retrieving the list of books, getting a specific book by its position, adding a book at a specific position, and removing a book by title.
Implement the following functionalities:
- The class should allow adding books to the collection.
- It should be possible to retrieve the complete list of books
- It should be possible to obtain the title of a book given a position.
- It should be possible to add a book at a specific position.
- It should be possible to remove a book by title.
Verify its correct operation with JUnit:
- Verify that the list of books is not null after creating a new object.
- Confirm that the list has an expected size after inserting multiple books.
- Ensure that the list contains a specific book at its correct position.
- Verify that there are no duplicate book titles in the list.
- It verify that a book title can be retrieved given a specific position.
- It ensure that adding a book correctly modifies the list.
- It confirm that removing a book decreases the size of the list.
- It verify that the list remains alphabetically sorted after adding or removing a book.

### 📌 Level 1 - ex 2
Create a class called CalculateDni that calculates the letter of the DNI when receiving the number as a parameter.
Create a jUnit class that verifies its correct operation, parameterizing it so that the test receives a wide spectrum of data and validates whether the calculation is correct for 10 predefined DNI numbers.

### 📌 Level 1 - ex 3
Create a class with a method that throws an ArrayIndexOutOfBoundsException.
Verify its correct operation with a jUnit test.

### 📌 Level 2 
Create the Java classes and/or tests that test them to demonstrate the following:
  - **ex1**
An assertion that proves that the value of two integer objects is equal, and another that indicates that it is not.
  - **ex2**
An assertion that proves that the reference to one object is the same as another, and another that indicates that it is different.
  - **ex3**
An assertion that indicates that two arrays of integers are identical.
  - **ex4**
Create an arrayList containing various types of objects (create them too). Write an assertion to verify the order of the objects in the ArrayList as they were inserted.
Now verify that the above list contains the objects in any order.
Verify that, in the above list, one of the objects has been added only once. Leave one of the elements unadded, and verify that the list does not contain the last one.
  - **ex5**
Create a map and verify that it contains one of the keys you add to it.
  - **ex6**
Produce an ArrayIndexOutOfBoundsException in any class. Create an assertion that validates that the exception is thrown when appropriate.
    - **ex7**
Create an empty Optional object. Write the correct assertion to verify that it is indeed empty.

### 📌 Level 3 - ex 1
Let's say we want to create a class called Calculator that has methods to perform basic operations such as addition, subtraction, multiplication, and division. Let's write tests before implementing the functionality:

Create a test class called CalculatorTest.
Write tests to verify the calculator's add, subtract, divide, and multiply methods.
Run the tests. They should fail, since we haven't implemented the methods in the Calculator class yet.
Create a Calculator class that contains the methods specified by the tests.
Run the tests.
Iterate over the process: After each iteration, continue the TDD process, rewrite the tests, refactor the code if necessary, and repeat the development cycle to improve and extend the functionality of the Calculator class.

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with S1.04, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 23SE
- IntelliJ or Eclipse IDE (with Maven)



### ⚙️ Installation

Clone the S1.04 repository:
```sh
❯ git clone https://github.com/zohra-b/S1.04
```
