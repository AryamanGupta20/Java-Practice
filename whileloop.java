// public class whileloop {
// public static void main(String[] args) {
//         int i = 1;
        
//          while(i <= 10)
//         {
//             System.out.println(i);
//             i++;
//         }  
// }
// }


// import java.util.Scanner;          // to count digits of any number
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int count = 0;
//         int sum = 0;

//         while(n!=0)     // condition
//         {
//            int ld = n % 10;
//            sum+=ld;
//            n /= 10;
            
//         }
//          System.out.println(sum);
//     }}

// import java.util.Scanner;         //print 1 to 10
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int i = 1;

//         while(i <= 10)
//         {
//             System.out.println(i);
//             i++;
//         }
//    sc.close();
//  }
// }


// import java.util.Scanner;        //print reverse 10 to 1
// public class whileloop{
//     public static void main(String[] args) {
//         int i = 10;
//         while(i >= 1)
//         {
//             System.out.println(i);
//             i--;
//         }
//     }
// }


// public class whileloop{          // print even numbers 1 to 100
//     public static void main(String[] args) {
//         int i = 2;

//         while( i <= 100)
//         {
//             System.out.println(i);
//             i += 2;
//         }
//     }
// }

// public class whileloop{             // odd numbers 
//     public static void main(String[] args) {
//         int i = 3;

//         while(i <= 100)
//         {
//             System.out.println(i);
//             i += 2;
//         }
//     }
// }


// import java.util.Scanner;        //multiplication table
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//         int i = 1;

//         while(i <= 10)
//         {
//             System.out.println(n +"*"+i+"="+n*i);
//             i++;
//         }
//     }
// }

// import java.util.Scanner;      //sum of even number sfrom 1 to n
// public class whileloop{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner (System.in);
//          int n = sc.nextInt();

//         int i = 2;
//          int sum= 0;

//          while(i <= n)
//          {
//             sum = sum + i;
//             System.out.println(i);
//             i += 2;
//          }
//          System.out.println(sum);
//     }
// }

// import java.util.Scanner;         // print odd numbers 1 to n
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 3;
//         int sum = 0;

//         while(i <= n)
//         {
//             sum = sum + i;
//             i += 2;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;        // sum of odd numbers from 1 to n
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 3;
//         while ( i <= n)
//         {
//             System.out.println(i);
//             sum += i;
//             i += 2;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;                //factorial of given number
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int i = 1;
//         int fact = 1;

//         while (i <= n)
//         {
//             fact = fact * i;
//             System.out.println(fact);
//             i++;
//         }
       
// }
// }

// import java.util.Scanner;              // find and print product of all digits
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int pro = 1;

//         while ( n != 0)
//         {
//             int pr = n % 10;
//             pro = pro * pr;
//             n /= 10;
//         }
//         System.out.println(pro);
//     }
// }

// import java.util.Scanner;  // count the digits
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;

//         while(n != 0)
//         {
//             int ld = n % 10;
//             count += 1;
//             n /= 10;
//         }
//         System.out.println(count);
//     }
// }


// import java.util.Scanner;    // check whether the given number is prime or not
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 2;
//         boolean factorFound = false;

//         while (i <= n)
//         {
//             if (n % i == 0)
//                 factorFound = true;
//                 break;
//         }
//         if ( factorFound == true) System.out.println("no");
//         else if ( factorFound == false ) System.out.println("prime number");

//    sc.close();
//  }
// }


// import java.util.Scanner;   //revision
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int i = 1;
//         int fact = 1;

//         while ( i <= n)
//         {
//             fact = fact * i;
//               System.out.println(fact);
//             i++;
//         }
      
//     }
// }

// import java.util.Scanner;
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int pro = 1;

//         while (n != 0)
//         {
//             int ld = n % 10;
//             pro = pro * ld;
//             n /=10;
//         }
//         System.out.println(pro);
//     }
// }

// import java.util.Scanner;      //revision
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int count = 0;
        
//         while(n != 0)
//         {
//             int ld = n % 10;
//             count += 1;
//             n/=10;
//         }
// System.out.println(count);
//     }
// }

// import java.util.Scanner;
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 2;
        
//         boolean factorFound = false;

//         while( i <= n)
//         {
//             if (n % i == 0)
//                 factorFound = true;
//             break;
//         }
//         if (factorFound == true) System.out.println("no");
//         else if (factorFound == false) System.out.println("yes");
//     }
// }

// import java.util.Scanner;  //fibonacci series till n term
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         int i = 0;

//         int num1 = 0;
//         int num2 = 1;

//         while(i <= n)
//         {
//             int next = num1 + num2;
//             System.out.println(num1);
//            i++;
//             num1 = num2;
//             num2 = next;
//         }
//     }
// }

// import java.util.Scanner;      // sum of fibonacci series
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
// int i = 0;
//         int num1 = 0;
//         int num2 = 1;
// int sum = 0;

//         while(i <= n)
//         {
//             int next =num1+num2;
//             System.out.println(num1);
//             sum+=num1;
//             i++;

//              num1 = num2;
//             num2 = next;
//         }
//         System.out.println("sum of series is "+sum);
//     }
// }

// import java.util.Scanner;         //square of every number from 1 to n
// public class whileloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int i = 1;

//         while(i <= n)
//         {
//             System.out.println(i*i);
//             i++;
//         }
//     }
// }