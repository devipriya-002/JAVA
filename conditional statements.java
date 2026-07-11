//if 
boolean isRaining = true;

if (isRaining) {
  System.out.println("Bring an umbrella!");
}

if (20 > 18) {
  System.out.println("20 is greater than 18");
}

int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}

//else
boolean isRaining = false;

if (isRaining) {
  System.out.println("Bring an umbrella!");
} else {
  System.out.println("No rain today, no need for an umbrella!");
}

int time = 20;

if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

//else if 
int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

if (weather == 1) {
  System.out.println("Bring an umbrella.");
} else if (weather == 2) {
  System.out.println("Wear sunglasses.");
} else {
  System.out.println("Just go outside normally.");
}

int time = 16;

if (time < 12) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

//nested if 
int x = 15;
int y = 25;

if (x > 10) {
  System.out.println("x is greater than 10");
  
  // Nested if 
  if (y > 20) {
    System.out.println("y is also greater than 20");
  }
}

int age = 20;
boolean isCitizen = true;

if (age >= 18) {
  System.out.println("Old enough to vote.");
  
  if (isCitizen) {
    System.out.println("And you are a citizen, so you can vote!");
  } else {
    System.out.println("But you must be a citizen to vote.");
  }
} else {
  System.out.println("Not old enough to vote.");
}

//switch
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
