# Chapter 6: Arrays and Array Lists 



## Topics

* You don't know ``Hello World`` in Java!
* Mini Lab: April Fool's Day 2017 Gift (For one-dimensional arrays)
* Arrays Essentials
* Lab: Pictures Lab (For two-dimensional arrays)

## Introduction

* **Bonus**: ``Ctrl + Shift + L`` in ``Eclipse``, show all keyboard shortcuts

* You **don't know** ``Hello World`` in Java!

  ```java
  public class Demo {
      public static void main(String[] args) {
        // What's the hell does it mean? ---> String[] args
        // http://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
        System.out.println("Hello World!"); 
      }
    }
  ```

* ``AprilFoolsDay2017Gift`` Program

  ```java
  /**
   * A gift ...
   * 
   * Special for April Fool's Day in 2017
   * Special for APCS 2017
   * Special for Y-O-U
   * 
   * This program pretends to "format" your hard-disk, according to the command line arguments
   * 
   * If you provide "C", then prompt "Partition C is formatted" 
   * If you provide "C D", then prompt "Partition C and D are formatted"
   * If you provide nothing or anything else ...
   * then prompt "Nothing provided or recognized, all partitions are formatted"
   * 
   */
  public class AprilFoolsDay2017Gift {
    // See source code
  }
  ```

## One-Dimensional Arrays

![objects-tenElementArray](../images/objects-tenElementArray.gif)
(Source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

### What's New 

* A data structure (container) to implement a list object, where the element in the list are of **the same type**.
* Each item in the array is call an **element**
* For an array of N elements in Java
  * index values (also called **subscripts**) range from ``0`` to ``N-1``
  * ``ArrayIndexOutOfBoundsException`` is thrown, when subscript is negative or subscript is ``k`` where ``k >= N ``

### **Declare, Initialize, and Use**

*   Array is an **object** , the keyword **new** can be used for its creation.

* Once initialized, the length(aka. the size) is **fixed**

  ```java
  double arr[];    // declared
  arr= new double[25];  // Initialized, but what's the default value?
  arr =new double[40];  // memory allocated for previous data array is recycled.

  // declare and initialize at the same time
  double[] data = new double[25];
  double data[] = new double[25]; // also works
  ```

* Default value when initialized:

  * ``0`` for the primitive numeric data types, e.g. ``int``, ``double``
  * ``false`` for ``Boolean`` variables
  * ``null`` for object references

* Initializer list

  * when small-sized arrays whose values are known
  * must be used in the same line of array declaration 

  ```java
  // initialize with your own values
  int[] coins = new int[3];
  coins[0] = 1;
  coins[1] = 2;
  coins[2] = 3;
  arr[100] = 10000; // ArrayIndexOutOfBoundsException 
  // or this way
  int[] coins = {1,2,3};
  ```

* get the **length** of array: ``arr.length``

    ```java
    String s = "abc"; 
    s.length(); //String object length
    int[] a = new int[6]; 
    a.length; //Array length
    ```

* **Traversing an Array**

    * ``for-each`` loop: not for replacing or removing any elements  

    * ``for`` loop: one-for-all 


### Arrays as Parameters

* Arrays are treated as *Object*, so passing a parameter means passing its *object reference*.
* **Ahhhhh! Dangerous!!** You can modify the original array passed in! 

### Array Variable in a Class

### Array of Class Object

### Analyzing Array Algorithms

```java
public static int countNegs(int[] arr){
  int count=0;
  for(int num: arr){
    if(num<0){
      count++;
    }
  }
  return count;
}
```

```java
{
  /** 
  arr[0]....arr[n-1] contain integers sorted in increasing order
  num need to be inserted in its correct position
  n is arr.length
  **/
  //find insertion positioin
  int i =0;
  while (i<n && num>arr[i]){
    i++;
  }
  for(int j=n;j>=i+1;j--){
    arr[j]=arr[j-1];
    //insert num in i-th slot and update n
    arr[i]=num;
    n++;
  }
}
```

* best---when ??/  worst---when ??
* so ,**insertion or deletion of an element in an ordered list is inefficient.**



## Two-dimensional Arrays

A two-dimensional array (matrix) is often the data structure of choice for theater seats,mazes.

### Declarations

```java
int[][] table;
double[][] matrix = new double[3][4]; //3*4,each element has value 0.0
String[][] str = new String[3][5]; //3*5,each element is null
int[][] mat = { {1,2,3},      //row0
			    {4,5,6} };    //row1
```
### Matrix as Array of Row Arrays

### Processing a Two-Dimensional Array
* row-column(access ,modify , replacement)
* for-each (access,modify, cannot replacement)
* row-by-row(access ,modify , replacement)



## ArrayList

* an ArrayList is an alternative way of storing a list of object.

* Advantages:

  * ArrayList shrinks and grows as needed in a program, whereas  an array has a fixed length.

  * in ArrayList , the last slot is **list.size()-1**,whereas in array you need keep track of the last slot currently in use.

  * do insertion or deletion with just a single statement.![捕获](B:\pangpang\AP\chapter4\捕获.PNG)


### Collections and generics**

* the collection classes are generic ,with the parameter, List<E> and ArrayList<E> contain elements of type E.
* EXAMPLE: private ArrayList<Clown> clowns;

### Auto-Boxing and Unboxing

* There are no primitive types in collections classes. 

* An ArrayList must contain objects not types like double and int.

* Auto-Boxing: automatic wrapping of primitive type in their wrapper class.

* Unboxing: automatic conversion of a wrapper class to its corresponding primitive type.

* so, choose array or ArrayList?? when your data is all primitive type

### The List<E> INTERFACE

In  a list ,duplicate elements are allowed.

*   the methods of List<E>, see the p243.

*   notice :

    * get remove set   if **index<0||index>=size** IndexOutOfBoundsException
    * add  **index<0||index>size**