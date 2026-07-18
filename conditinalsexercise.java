// import java.util.Scanner;                           // to chek if its zro ,negaticve .positive

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//         if (n < 0) System.out.println("negative");
//         else if (n == 0) System.out.println("its zero");
//         else if (n > 0) System.out.println("its postive");
//         else System.out.println("enter digit only");
//         sc.close();
//     }
    
// }


// import java.util.Scanner;                             // evebn or odd

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
        
//         if (n % 2 == 0) System.out.println("even");
//         else System.out.println("odd");
// }
// }


// import java.util.Scanner;                        // cehck if its devisible by 5

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//         if (n % 5 == 0) System.out.println("yes");
//         else System.out.println("no");
//         sc.close();
//     }
// }


// import java.util.Scanner;                     // devisivble by 5 and 3

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
           
//         if (n % 3 == 0 && n % 5 == 0) System.out.println("yes");
//         else System.out.println("no");
//         sc.close();
//     }
// }


// import java.util.Scanner;                            // to check leap year

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int year = sc.nextInt();

//         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println("yes");
//         else System.out.println("no");
        
//         sc.close();
//     }
// }


// import java.util.Scanner;                  //grater of two number

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a > b)System.out.println(a);
//         else System.out.println(b);
//         sc.close();
//     }
// }


// import java.util.Scanner;                             // greater of hree number

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
 
//         if (a > b && a > c) System.out.println(a);
//         else if (b > a && b > c) System.out.println(b);
//         else if (c > a && c > b) System.out.println(c);
//         else System.out.println("all are equally");
//         sc.close();
//     }
// }


//import java.util.Scanner;                       // temp cold warm or hot

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int range = sc.nextInt();

//         if (range <= 10) System.out.println("cold");
//         else if (range >= 11) System.out.println("warm");
//         else if (range >= 20) System.out.println("hot");
//         else System.out.println("invalid temp");

//         sc.close();
//     }
// }


// import java.util.Scanner;                   // chcek if its vowels or consonants

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the chracter");
//         char ch = sc.next().charAt(0);
        
//         if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u') System.out.println("its vowels");
//        else if (ch != 'a' || ch != 'e' || ch != 'o' || ch != 'u') System.out.println("its consonentes");
        
//         sc.close();
//     }
// }



// import java.util.Scanner;                   // chcek if its vowels or consonants

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the chracter");
//         char ch = sc.next().charAt(0);
        
//         if (ch >= 'A' && ch <= 'Z') System.out.println("uppercase");
//           else if (ch >= 'a' && ch <= 'z') System.out.println("lowercase");
//           else if (ch >= '0' && ch <= '9') System.out.println("digit");

        
//         sc.close();
//     }
// }


// import java.util.Scanner;                   // take three sides and check if its valid triangle and determine whertever if its equaliteral , issoceles or scalene

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("frist side ");
//         int a = sc.nextInt();
//         System.out.println("second side");
//         int b = sc.nextInt();
//         System.out.println("third side ");
//         int c = sc.nextInt();

//         if ((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("valid ");
//          if (a == b && b == c && c == a) System.out.println("its equaliteral");
//         else if (a == b || b == c || c == a )System.out.println("issoceles");
//         else System.out.println("scalene");

//         sc.close();
//     }
// }



// import java.util.Scanner;              // take marks (0-100) and print gradeds(A,B,C,D)     

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter  the number");
//         int a = sc.nextInt();

//         if (a >= 90 && a <= 100) System.out.println("A");
//         else if (a >= 80) System.out.println("B");
//         else if (a >= 70) System.out.println("C");
//         else if (a >= 60) System.out.println("D");
//         else System.out.println("Study hard");
//         sc.close();
//     }
// }


// import java.util.Scanner;                   // check if one of two number is multiple of other

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("frist side ");
//         int a = sc.nextInt();
//         System.out.println("second side");
//         int b = sc.nextInt();

//         if (a % b == 0 || b % a == 0) System.out.println("yes its multiple");
//         else System.out.println("no");
//         sc.close();
//     }
// }


// import java.util.Scanner;                   // take hour of day and print wish

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("frist side ");
//         int a = sc.nextInt();
       
//         if (a >= 0 && a <= 12) System.out.println("good morning");
//         else if (a > 12 && a <= 16) System.out.println("afternoooon");
//         else if (a > 16 && a <=23)System.out.println("goodvening");
//         sc.close();
//         }
// }


// import java.util.Scanner;                 // check vote eligibility
// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("frist side ");
//         int person = sc.nextInt();
        
//         if (person >= 18) System.out.println("canvote");
//         else System.out.println("cant vote");
//         sc.close();
//     }
// }


// import java.util.Scanner;                 // take two number check if it even or odd or one even or odd
// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("frist side ");
//         int a = sc.nextInt();
//         System.out.println("enter second");
//         int b = sc.nextInt();

//         if ( a % 2 == 0 && b % 2 == 0) System.out.println("both are even");
//         else if (a % 2 != 0 && b % 2 != 0) System.out.println("both are odd");
//         else if (a % 2 == 0 && b % 2 != 0) System.out.println("frist one is even and second is odd");
//         else if (b % 2 == 0 && a % 2 != 0) System.out.println("second is even and frist is odd");
// sc.close();
//     }
// }


// import java.util.Scanner;                 // take an char and check if its lies btw a and m or n z 
// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("frist side ");
//         char ch = sc.next().charAt(0);
          
//         if ( ch >= 'a' && ch <='m') System.out.println("lies btw a and m");
//         else if (ch >= 'n' && ch <= 'z') System.out.println("lies btw n and z");
// sc.close();
//     }
// }


// import java.util.Scanner;

// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();

//         switch (a){
//             case 1 :
//                 System.out.println("monday");
//                 break;
//                  case 2 :
//                 System.out.println("tuesday");
//                 break;
//                  case 3 :
//                 System.out.println("wednesday");
//                 break;
//                  case 4 :
//                 System.out.println("thursday");
//                 break;
//                  case 5 :
//                 System.out.println("friday");
//                 break;
//                  case 6 :
//                 System.out.println("saturday");
//                 break;
//                  case 7 :
//                 System.out.println("sunday");
//                 break;
//         }
// sc.close();

//     }
// }


// import java.util.Scanner;               // take 3 digit number and chekc if are distinct

// public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("emter the 3 digit number");
//         int num = sc.nextInt();

//         int a = num / 100;          // Hundreds digit
//         int b = (num / 10) % 10;    // Tens digit
//         int c = num % 10;           // Ones digit

//         if (a != b && b != c && a != c) {
//             System.out.println("All digits are distinct.");
//         } else {
//             System.out.println("Digits are not distinct.");
//         }

//         sc.close();
//     }
// }

//  import java.util.Scanner;            // take 3 number and tell middle digit is smaller or  bigger or nighter

//  public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         int a = num / 100;
//         int b = (num / 10) % 10;
//         int c = num % 10 ;

//         if (b < a && b < c) System.out.println("smaller");
//         else if (b > a && b > c) System.out.println("bigger");
//         else System.out.println("nwighter");
//         sc.close();

//     }
//  }


//  import java.util.Scanner;            // take 4 digit number and tell frist and last is equal

//  public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         int a = num / 1000;
//         int d = num % 10 ;

//         if (a == d) System.out.println("equal");
//         else System.out.println("nwighter");
//         sc.close();

//     }
//  }


// import java.util.Scanner;

// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter first side");
//         int a = sc.nextInt();
//         System.out.println("enter second side");
//         int b = sc.nextInt();
//         System.out.println("enter third side");
//         int c = sc.nextInt();
    
//     if ((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("valid");
//     if (a == b && b == c && c == a) System.out.println("equliteral");
//     else if (a == b || b == c || c== a ) System.out.println("issoceles");
//     else System.out.println("scalene");
//     sc.close();
//     }
// }


// import  java.util.Scanner ;

// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter first side :");
//         int num = sc.nextInt();
        
//         int a = num / 100;
//         int b = (num / 10)% 10;
//         int c = num % 10;

//         if (a != b && b != c && c != a) System.out.println("yes");

//         else System.out.println("no");
//         sc.close();
//     }
// }


// import java.util.Scanner ;
// public class conditinalsexercise{
//     public static void main(String[] args) {
//              Scanner sc = new Scanner (System.in);
//             System.out.println("enter the integer ");
//             int a = sc.nextInt();

//     if (a <= 9) System.out.println("single digit");
//     else if (a <= 99)System.out.println("double digit");
//     else if ( a <= 999) System.out.println("multi digit");
//     else System.out.println("invalid digit");
//     sc.close();
//     }
// }


// import java.util.Scanner;        // check if its multiple of 7 or ends with 7

// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the digit");
//         int a = sc.nextInt();

//         if (a % 7== 0 || a % 10 == 7) System.out.println("its multiple of seven ");
//         else System.out.println("no");
//     }
// }


// import java.util.Scanner ;       // take cordinates x , y and check quadrants or origin
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter x");
//         int a = sc.nextInt();
//         System.out.println("enter y ");
//         int y = sc.nextInt();

//         if (a > 0 && y > 0) System.out.println("1");
//         else if (a < 0 && y > 0) System.out.println("2");
//         else if (a < 0 && y < 0) System.out.println("3");
//         else if (a > 0 && y < 0 ) System.out.println("4");
//         else if ( a == 0 && y == 0) System.out.println("origin");
//         else if ( a == 0) System.out.println("lies opn x axis");
        
// else System.out.println("y axis");
// sc.close();
//     }
// }

// import java.util.Scanner;
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the ampount");
//         double num = sc.nextDouble();

//     if (num % 2000 == 0) System.out.println("yes devide can by 2000");
//    else if (num % 500 == 0) System.out.println("devide by 500");
//     else if (num % 100 == 0) System.out.println("can devide by 100");
//     else System.out.println("give corect ammount");
//  }
// }


// import java.util.Scanner ;
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();

//         if (a >= 100 && a <= 999) System.out.println("its lies in btw");
//         else System.out.println("not ");
//         sc.close();
//     }
// }


// import java.util.Scanner ;      //take two angle of tringle and compute third one
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();
//          System.out.println("enter the number");
//         int b = sc.nextInt();
          
//         int c = 180 - a -b;
//         if (c <= 0) System.out.println("invalid input");
//         else System.out.println("the third angle is "+c);
//         sc.close();
//     }
// }

// import java.util.Scanner;               // check char is lettr or digit

//  public class conditinalsexercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the character");
//         char ch = sc.next().charAt(0);

//         if (ch >= 'A' && ch <= 'z') System.out.println("its letter");
//         else if (ch >= '0' && ch <= '9') System.out.println("its digit");
//         else System.out.println("neighter");
//         sc.close();
//     }
//  }


// import java.util.Scanner ;
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();

//          if (a % 3 == 0 && a % 5 == 0) System.out.println("fizzbuzz");
//          else if (a % 3 == 0) System.out.println("fizz");
//         else if (a % 5 == 0) System.out.println("buzz");
   
//         else System.out.println("invalid number");
//     }
// }


// import java.util.Scanner ;                 // takeout median value
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();
//          System.out.println("enter second number");
//         int b = sc.nextInt();
//          System.out.println("enter third number");
//         int c = sc.nextInt();
        
//  if (a > b && b > c ) System.out.println(b);
// else if (b > c && c > a) System.out.println(c);
// else if (c > a && a > b) System.out.println(a);
// else System.out.println("invalid number");
//     }
// }


// import java.util.Scanner;
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter age");
//         int age = sc.nextInt();
//         System.out.println("enter income");
//         int income = sc.nextInt();

//         if (age <= 18 && income <= 50000) System.out.println("eligible for tax");
//         else System.out.println("not eligible");
//     }
// }

// import java.util.Scanner;           // elecrticity bill

// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the units consumed ");
//         int units = sc.nextInt();

//         if (units <= 0 && units >= 999) System.out.println("the bill is"+units*3);
//         else if (units >= 1000) System.out.println("the bill us "+units*5);
//         else System.out.println("enter coorect units consumed");
//     }
// }


// import java.util.Scanner ;           // cordinates lies on x axis or y axis or orgin
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter x ");
//         int x = sc.nextInt();
//         System.out.println("enter y ");
//         int y = sc.nextInt();

//         if ( x == 0 && y == 0) System.out.println("lies on x axis and y axis ");
//         else if ( x == 0) System.out.println("lies on y axis");
//         else if (y == 0) System.out.println("lies on x axis");
//         else System.out.println("cordinates are invalid"); 
//     }
// }


// import java.util.Scanner;              //pythagorean triplet

// public class conditinalsexercise {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();

        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();

        // System.out.print("Enter third number: ");
        // int c = sc.nextInt();

//         if (a >= b && a >= c) {
//             if (b * b + c * c == a * a)
//                 System.out.println("It forms a Pythagorean Triplet.");
//             else
//                 System.out.println("It does not form a Pythagorean Triplet.");
//         }
//         else if (b >= a && b >= c) {
//             if (a * a + c * c == b * b)
//                 System.out.println("It forms a Pythagorean Triplet.");
//             else
//                 System.out.println("It does not form a Pythagorean Triplet.");
//         }
//         else {
//             if (a * a + b * b == c * c)
//                 System.out.println("It forms a Pythagorean Triplet.");
//             else
//                 System.out.println("It does not form a Pythagorean Triplet.");
//         }

//         sc.close();
//     }
// }


// import java.util.Scanner ;           // to check if its in arithmatic progression
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int num = sc.nextInt();

//         int c = num / 100;
//         int b = (num/10)%10;
//         int a = num % 10 ;

//         if ( (b-a)==(c-b)) System.out.println("yes its in progression");
//         else System.out.println("there is noo ap");
//     }
// }

// import java.util.Scanner ;                 // to check if its in geometric progression
// public class conditinalsexercise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();
      

//         if ( (b/a)==(c/b)) System.out.println("yes its in progression");
//         else System.out.println("there is noo ap");
//     }
// }

// revision of codes 

// import java.util.Scanner;
// public class conditinalsexercise{
//  public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter the char");
//        char ch = sc.next().charAt(0);
       
//        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' ) System.out.println("vowels");
//        else if(ch != 'a' && ch != 'e' && ch != 'o' && ch != 'i' && ch != 'u' ) System.out.println("consonents");
//        else System.out.println("enter valid char");
//  }
//  }


// import java.util.Scanner ;
// public class conditinalsexercise{
//         public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//           System.out.println("enter first side");
//                 int a = sc.nextInt();
//           System.out.println("second side");
//           int b = sc.nextInt();
//           System.out.println("third");
//           int c = sc.nextInt();

// if ((a+b)>c && (b+c)>a && (c+a)>b)System.out.println("valid triangle");
// if (a == b && b == c && c == a) System.out.println("equaliteral");
// else if (a == b || b == c || c == a) System.out.println("issoceles");
// else System.out.println("scalene");        
//         }
// }

// import java.util.Scanner ;
// public class conditinalsexercise{
//         public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//           System.out.println("enter first side");
//                 int a = sc.nextInt();
//           System.out.println("second side");
//           int b = sc.nextInt();
          
//           if ( a % b == 0 || b % a == 0) System.out.println("yes its multiple");
//           else System.out.println("no");
//         }
// }


import java.util.Scanner ;
public class conditinalsexercise{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
          System.out.println("enter the number");
          int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) System.out.println("distinct");
        else System.out.println("no");
        }
}
