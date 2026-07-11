int sum1 = 100 + 50;       
int sum2 = sum1 + 250;      
int sum3 = sum2 + sum2;  

//arithmetic operators
int x = 10;
int y = 3;

System.out.println(x + y); 
System.out.println(x - y); 
System.out.println(x * y); 
System.out.println(x / y); 
System.out.println(x % y); 

int z = 5;
++z;
System.out.println(z);
--z;
System.out.println(z); 

//Assignment Operators
int savings = 100; 
savings += 50; 
System.out.println("Total savings: " + savings);

//Comparison Operators
int age = 18;

System.out.println(age >= 18); // true, old enough to vote
System.out.println(age < 18);  // false

//Logical Operators
boolean isLoggedIn = true;
boolean isAdmin = false;

System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
System.out.println("Has access: " + (isLoggedIn || isAdmin));
System.out.println("Not logged in: " + (!isLoggedIn));
