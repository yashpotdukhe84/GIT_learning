import java.util.*;

public class test {
    public static void main(String[] args)
    {
        // float a =6.5f;
        // int b=4;
        // System.out.println(a+b);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // String nm = sc.nextLine();
        // System.out.println("You entered: " + nm);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter length of rectangle");
        // float Ln = sc.nextFloat();
        // System.out.println("Enter breadth of rectangle");
        // float Br = sc.nextFloat();
        // float area = Ln * Br;
        // System.out.println("Area of rectangle is: " + area);

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the age");
    //     int age = sc.nextInt();


    //     if(age <18){
    //         System.out.println("teenager");
    //     }
    //     else if (age > 20){
            
    //         System.out.println("adult");

    //     }
    //     else{
    //         System.out.println("old");
    //     }

    // for loop
    //print table of 2
        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter the number");
        //   int a =sc.nextInt();

        //   for(int i=1; i<=10; i++){
            
        //     System.out.println("table is follows: ");
        //     System.out.println(a + " * " + i + " = " + (a*i));
        //   }

        //natural numbers

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int i =0;
        // int sum=0;
        // while(i<=a){
        
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("Sum of natural numbers up to " + a + " is: " + sum);
       
        // fehrenheit to celsius
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the temperature in Fahrenheit: ");
        // float fahrenheit = sc.nextFloat();
        // float celsius = (fahrenheit - 32) * 5/9;
        // System.out.println("Temperature in Celsius: " + celsius);

        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter the choice(1,2,3): ");
        // int a = sc.nextInt();
        // switch (a) {
        //     case 1:
        //         System.out.println("Namste");
        //         break;
        //     case 2:
        //         System.out.println("Hello");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Invalid input");
            
        // }

        // enter month number and print month name
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the month number (1-12): ");
        // int month = sc.nextInt();
        // switch (month) {
        //     case 1:
        //         System.out.println("January");
        //         break;
        //     case 2:
        //         System.out.println("February");
        //         break;
        //     case 3:
        //         System.out.println("March");
        //         break;
        //     case 4:
        //         System.out.println("April");
        //         break;
        //     case 5:
        //         System.out.println("May");
        //         break;
        //     case 6:
        //         System.out.println("June");
        //         break;
        //     case 7:
        //         System.out.println("July");
        //         break;
        //     case 8:
        //         System.out.println("August");
        //         break;
        //     case 9:
        //         System.out.println("September");
        //         break;
        //     case 10:
        //         System.out.println("October");
        //         break;
        //     case 11:
        //         System.out.println("November");
        //         break;
        //     case 12:
        //         System.out.println("December");
        //         break;
        //     default:
        //         System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        // }
      //  make calulator 
    //   Scanner sc = new Scanner(System.in);
    //   System.out.println("Enter first number: ");
    //   float a = sc.nextFloat();
    //   System.out.println("Enter second number: ");
    //     float b = sc.nextFloat();
    //     System.out.println("Enter the operation (1.Add, 2.Subtract, 3.Multiply, 4.Divide): ");
    //     int choice = sc.nextInt();
    //     switch (choice) {
    //         case 1: 
    //             System.out.println("Result: " + (a + b));
    //             break;
    //         case 2:
    //             System.out.println("Result: " + (a - b));
    //             break;
    //         case 3:
    //             System.out.println("Result: " + (a * b));
    //             break;
    //         case 4:
    //             System.out.println("Result: " + (a / b));
    //             break;
    //             default:
    //             System.out.println("Invalid operation");

    //     }

    //swap to numbers whithout third variable
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println("After swapping: a = " + a + ", b = " + b);

    // convert total numbers of seconds into hours, minutes and seconds
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter total number of seconds: ");
    // int totalseconds = sc.nextInt();
    // int hours = totalseconds / 3600;
    // int seconds = totalseconds % 3600;
    // int minutes = (totalseconds % 3600) / 60;
    // int remainingSeconds = totalseconds % 60;
    // System.out.println("Hours: " + hours + ", Minutes: " + minutes + ", seconds: " + remainingSeconds);
    //find the largest of three numbers

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter first number: ");
    // int num1 = sc.nextInt();
    // System.out.println("Enter second number: ");
    // int num2 = sc.nextInt();
    // System.out.println("Enter third number: ");
    // int num3 = sc.nextInt();

    //     if (num1 >= num2 && num1 >= num3) {
    //         System.out.println("num1 is the largest number: " + num1);
    //     }
    //     else if (num2 >= num1 && num2 >= num3) {
    //         System.out.println("num2 is the largest number: " + num2);
    //     } 
    //     else {
    //         System.out.println("num3 is the largest number: " + num3);
    //         }

    // find if year is leap year or not 
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a year: ");
              int year = sc.nextInt();
              if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                  System.out.println(year + " is a leap year.");
              } else {
                  System.out.println(year + " is not a leap year.");
              }

        }
        }
