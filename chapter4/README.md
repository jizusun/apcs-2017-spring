<script type="text/javascript" src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=default"></script>
$$x=\frac{-b\pm\sqrt{b^2-4ac}}{2a}$$

$$r=\sqrt{A/\pi}$$

### Some standard classes

#### String Class

```java
"unhappy".subString(2)
"cold".subString(4)
"cold".subString(5)
"strawberry".subString(5,7)
"delicious".subString(4,10)
```

```java
String s = "funntfarm";
int x = s.indexOf("farm");
int y = s.indexOf("farmer");
int l = s.length();
```

---

#### Integer Class

```java
Integer intObj =new Integer(6);

int j = intObj.intValue(); 

system.out.println("Integer value is " + intObj);   //what is the output?

Integer intObj2 = new Integer(3);

int g = intObj2.intValue();

if (j.equals(g)){....}  //true or false?

if (j == g){....}      //true or false?

if(intObj.equals(intObj2)){...}             //true or false?

Object object = new Integer(5);

if (intObject.compareTo(object)){...}        //true or false?

if (intObject.compareTo((Integer)object)){...}//true or false?

if (object.compareTo(intObject)){...}         //true or false?

if ((Integer)object.compareTo(intObject)){...}//true or false?



```



---

#### Double Class

```java
Double dObj = new Double (2.5);

double d = dObj.doubleValue();  //d=??

Object obj = new Double(7.3);

Object intObj = new Integer(4);

if (dObj.compareTo(object)){...}       //true or false?

if (dObj.compareTo((Double)obj)){...}  //true or false?

if (dObj.compareTo((Double)intObj)){...}//true or false?   

```

---

#### Math Class

$$r=\sqrt{A/\pi}$$

$$A = P(1.05)^{10}$$

$$D=|X_P-X_Q|$$

---

### Random Numbers

##### random reals

* 0.0 <= x <6.0
* 2.0 <=x <3.0
* 4.0 <=x <6.0

##### random integers

1-100

40-80

### coding practice

1.  create a string m= "Never say die "

2. print "say die","say",the length of m

   ​