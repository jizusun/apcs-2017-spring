# Chapter 6: Arrays and Array Lists 

## One-Dimensional Arrays

* **Definition**:  a data structure to implement a list object, where the element in the list are of **the same type**.

  * for an array of N elements in java, index values ( **subscripts**) from **0 to N-1**
  * ArrayIndexOutOfBoundsException is thrown: subscript is negative or subscript is k where k>=N

* **Initialization**

  * array is an **object** , the keyword **new** can be used in its creation.

  * the **size ** of an array remains fixed once it has been created.

  * example:

    ```java
    double[] data = new double[25];
    double data[] = new double[25];
    double data[];   data= new double[25];  data =new double[40];//memory allocated for previous data array is recycled.
    ```
  ```

  *   zero for the primitive numeric type / false for boolean variable / null for object reference

  * initializer list---when small arrays whose values are known

  * ```java
    int[] coins = new int[3];
    coins[0] = 1;
    coins[1] = 2;
    coins[2] = 3;

    or

    int[] coins={1,2,3}
  ```

  * **length of array**:*names.length*  vs **length of String objects** :*objectName.length()*

    ```java
    String s = "abc"; s.length();//String object length
    int[] a = new int[6]; a.length;//Array length
    ```

  * **Traversing an Array**

    * for-each loop: without replacing or removing any elements  
      * practice: return the number of even integer in array arr of integers.
    * for loop: access the index of any element ,to replace or remove elements, or to access just some of the elements.
      * practice: change each even-indexed element in array arr to 0.

  * **Arrays as Parameters**

    * arrays are treated as *object*, so passing a parameter means passing its *object reference*.
    * Q: So,the element of actual array can be modified????
    * **coding**
      * practice1: return index of smallest element in array arr of integer
      * practice2: add 3 to each element of array b
      * practice 3: 

  * Array variable in a class

  * Array of Class object

  * **analyzing array algorithms**

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

    ​

    * best---when ??/  worst---when ??
    * so ,**insertion or deletion of an element in an ordered list is inefficient.**

    ---

    ​

#### ARRAY LISTS

* an ArrayList is an alternative way of storing a list of object.

* Advantages:

  * ArrayList shrinks and grows as needed in a program, whereas  an array has a fixed length.

  * in ArrayList , the last slot is **list.size()-1**,whereas in array you need keep track of the last slot currently in use.

  * do insertion or deletion with just a single statement.![捕获](B:\pangpang\AP\chapter4\捕获.PNG)

  * **Collections and generics**

    * the collection classes are generic ,with the parameter, List<E> and ArrayList<E> contain elements of type E.
    * EXAMPLE: private ArrayList<Clown> clowns;

  * Auto-Boxing and Unboxing

    * There are no primitive types in collections classes. 

    * An ArrayList must contain objects not types like double and int.

    * Auto-Boxing: automatic wrapping of primitive type in their wrapper class.

    * Unboxing: automatic conversion of a wrapper class to its corresponding primitive type.

    * so, choose array or ArrayList?? when your data is all primitive type

      ---

      ### The List<E> INTERFACE

    In  a list ,duplicate elements are allowed.

  * the methods of List<E>

    see the p243.

  * notice :

    * get remove set   if **index<0||index>=size** IndexOutOfBoundsException
    * add  **index<0||index>size**

    ---

    #### TWO-DIMENSIONAL ARRAYS

    A two-dimensional array(matrix) is often the data structure of choice for theater seats,mazes.

  * declarations

    ````java
    int[][] table;
    double[][] matrix =new double[3][4]//3*4,each element has value 0.0
    String[][] str = new String[3][5]//3*5,each element is null
    int[][] mat={{1,2,3},//row0
    			{4,,5,6}};//row1
    ````


```java
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4// SUM()   for/for-each
​````

* row-column(access ,modify , replacement)
* for-each (access,modify, cannot replacement)
* row-by-row(access ,modify , replacement)
```