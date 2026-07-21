// import java.util.Scanner;

// public class forlooppractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++)
//         {
//             System.out.println(i);
//         }
//     sc.close();
// }
// }

// import java.util.Scanner ;    // print no 1 to 10
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         for(int i = 1; i <= 10; i++)
//         {
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner ;    // print no 10 to 1 in reverse ordfer
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         for(int i = 10 ; i >= 1; i--)
//         {
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner ;    // print all even numbers 1 to 100
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         for(int i = 2 ; i <= 100; i+=2)
//         {
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner ;    // print all odd numbers 1 to 100
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         for(int i = 1 ; i <= 100; i+=2)
//         {
//             System.out.println(i);
//         }
//     }
// }

// import java.util.Scanner;         //print table of n
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter number");
//         int n = sc.nextInt();

//         for(int i = 1; i <= 10; i++)
//         {
//             System.out.println(n +"*"+ i +"="+n*i);
//         }
//     }
// }

// import java.util.Scanner;          // factorial of givrn number
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//     int fact = 1;

//     for (int i = 1; i <= n; i++)
//     {
//         fact = fact * i;
//         System.out.println(fact);
//     }
//     }
// }

// import java.util.Scanner ;       // factorial of evry number 1 to n
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("entr the number");
//         int n = sc.nextInt();

//         int fact = 1;

//         for(int i = 1; i<= n; i++)
//         {
//             fact = fact * i;
//             System.out.println(i +"* ="+fact);
//         }
//     }
// }

// import java.util.Scanner;       // check if its prime or nnot
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         boolean factorFound = false;

//         for(int i = 2; i <= n-1; i++)
//         {
//             if ( n % i == 0)
//             {
//                 System.out.println("not prime");
//                 factorFound = true;
//                 break;
//             }
//         }
//         if ( factorFound = true) System.out.println("not");
//         else if (factorFound = false) System.out.println("yes");
//     }
// }


// import java.util.Scanner ;             // another exmaple of previous question
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
          
//         boolean factorFound = false;

//         for(int i = 2; i <= n-1; i++)
//         {
//             if ( n % i == 0)
//             {
//                 factorFound = true;
//                 break;
//             }
//         }
//         if (factorFound == true) System.out.println("not found yet");
//         else if (factorFound== false)System.out.println("yeas its prime number");
//     }
// }

// import java.util.Scanner;       // fibonacci series

// public class forlooppractice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner (System.in);

//         System.out.println("Enter the number of terms:");
//         int n = sc.nextInt();

//         int num1 = 0;
//         int num2 = 1;

//         for (int i = 0; i < n; i++) {

//             System.out.println(num1);

//             int next = num1 + num2;

//             num1 = num2;
//             num2 = next;
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;          // sum of all fibonacci terms
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         int num1 = 0;
//         int num2 = 1;
//          int sum =0;

//         for(int i = 0; i <= n-1; i++)
//         {
//             System.out.println(num1);
//             sum += num1;

//             int next = num1 + num2;
//             num1  = num2 ;
//             num2 = next;
//         }
//        System.out.println(sum);
//     }
// }


// import java.util.Scanner;       // print all factors of the given number
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for ( int i = 1; i <= n; i++)
//         {
//             if (n % i == 0)System.out.println(i);
//         }
//     }
// }

// import java.util.Scanner;      // sum of all factors 
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= n; i++)
//         {
//             if (n % i == 0) 
//             {
//                 System.out.println(i);
//                 sum+=i;
//             }
//         }
//         System.out.println(sum);
//     }
// }


// import java.util.Scanner;            // hcf
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter first number");
//         int num1 = sc.nextInt();
//         System.out.println("second number");
//         int num2 = sc.nextInt();
//         int hcf = 1;

//         int min = (Math.min(num1,num2));

//         for (int i=1; i <= min; i++)
//         {
//             if ( num1 % i == 0 && num2 % i == 0)
//             hcf = i;
//         }
// System.out.println(hcf);
//     }
// }
 

// import java.util.Scanner;
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter first number");
//         int num1 = sc.nextInt();
//         System.out.println("second number");
//         int num2 = sc.nextInt();
//          int max= (Math.max(num1,num2));

//         for (int i=max; ;i++)
//         {
//              if ( i % num1 == 0 && i % num2 == 0){
//    System.out.println(i);
//    break;
//         }
//     }
   
//     }
// }

// import java.util.Scanner;          //revision
// public class forlooppractice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
// int sum = 0;
//         for(int i = 1; i <= n;i++)
//         {
//             if (n % i == 0)
//             {
//                 System.out.println(i);
//                 sum += i;
//             }
//         }
//         System.out.println(sum);
//     }
// }


// import java.util.Scanner;   // fibonnaacci revsion + sum of all
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         int num1 = 0;
//         int num2 =1;
// int sum = 0;
//         for(int i = 0; i <= n; i++)
//         {
//             System.out.println(num1);
//             sum += num1;
//             int next = num1+num2;

//             num1 = num2;
//             num2 = next;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;        // hcf revision
// public class forlooppractice{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner (System.in);
//          System.out.println("first number");
//          int num1 = sc.nextInt();
//          System.out.println("second number");
//          int num2 = sc.nextInt();
// int hcf = 1;
//          int min = (Math.min(num1,num2));

//          for(int i = 1; i <= min; i++)
//          {
//             if(num1 % i == 0 && num2 % i == 0)
//             {
//                 hcf = i;
                 
//             }
//          }
//          System.out.println(hcf);
//     }
// }

// import java.util.Scanner;                  // lcm revision
// public class forlooppractice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("first number");
//         int num1 = sc.nextInt();
//         System.out.println("second number");
//         int num2 = sc.nextInt();

      
//         int max = (Math.max(num1,num2));

//         for(int i = max ; ; i++)
//         {
//             if (i % num1 == 0 && i % num2 == 0)
//             {
//                 System.out.println(i);
//                 break;
//             }
//         }
//     }
// }

import java.util.Scanner;        // cube of evry number from 1 to n
public class forlooppractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int mul = 1;
        for(int i = 1; i<= n;i++)
        {
             mul = i*i*i;
             System.out.println(mul);
        }
   sc.close();
 }
}