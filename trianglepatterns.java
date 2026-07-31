//  = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =1; i <= n;i++)
//         {
//             for(int j =1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//         System.out.println();}
//     }
    
// }

// import java.util.Scanner;        //number pattern
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1;i <=n;i++)
//         {
//             for(int j =1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//         System.out.println();
//     }
//     }
// }

// import java.util.Scanner;       //capital alphabet triangle
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print((char)(j+64));
//             }
//         System.out.println();
//     }
//     }
// }

// import java.util.Scanner;              // 1 22 333 4444 55555 input from 5
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i =1;i<=n;i++)
//         {
//             for(int j=1;j <= i;j++)
//             {
//                 System.out.print(i);
//             }
//         System.out.println();}
//     }
// }

// import java.util.Scanner;             // print 1 ab 123 abcd
// public class trianglepatterns{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i=1;i<=n;i++)
//     {
//         for(int j=1;j<=i;j++)
//         {
//             if(i % 2 == 0)
//                 System.out.print((char)(j+64));
//           else  System.out.print(j);
//         }
//    System.out.println();
//  }
// }
// }

// import java.util.Scanner;          // horizontal flip star tiangle
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =1;i<=n;i++)
//         {
            
//             for(int j = i;j<=n+1-1;j++)
//             { 
//                 System.out.print("*");
               
//             }
//     System.out.println();    }
//     }
// }

// import java.util.Scanner;
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n;i++)
//         {
//             for(int j =1;j<=n+1-i;j++)
//             {
//                 System.out.print(j);
//             }
//      System.out.println();
//        }
//     }
// }

// import java.util.Scanner;               // revision
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =1; i <= n;i++)
//         {
//             for(int j =1; j <= i;j++)
//             {
//                 System.out.print((char)(j+96));
//             }
//         System.out.println();
//     }
//     }
// }

// import java.util.Scanner;       // revision
// public class trianglepatterns{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =1; i<=n; i++)
//         {
//             for(int j =1; j <= n+1-i;j++)
//             {
//                 System.out.print((char)(i+64));
//             }
//         System.out.println();}
//     }
// }

// import java.util.Scanner;     //odd number triangle  1st method
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i =1; i<=n;i++)
//         {
//             for(int j =1;j<=i;j++)
//             {
//                 System.out.print(2*j-1);                
//             }
//         System.out.println();
//     }
//     }
// }

// import java.util.Scanner;     //odd number triangle  2nd method by ap
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i =1; i<=n;i++)
//         {
//             for(int j =1;j<=2*i-1;j+=2)
//             {
//                 System.out.print(j);                
//             }
//         System.out.println();
//     }
//     }
// }

// import java.util.Scanner;     //odd number triangle  3rd method 
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i =1; i<=n;i++)
//         {
//             int a = 1;               // to start very line from 1
//             for(int j =1;j<=i;j++)
//             {
//                 System.out.print(a);
//                 a += 2;                
//             }
//         System.out.println();
//     }
//     }
// }
// import java.util.Scanner;         //floyd,s triangle
// public class trianglepatterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//          int a = 1;                // for change the value 
//         for(int i =1; i<= n;i++)
//           {
//             for(int j =1;j<=i;j++)
//             {
//                 System.out.print(a);
//                 a +=1 ;                     // changing j  constantly 1 to 2 2 to 3 3 to 4
//             }
//        System.out.println(); }
//      }
// }

// import java.util.Scanner;
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();
// int a =1;
//     for(int i =1;i <=n;i++)
//     {
//       for(int j =1;j<=i;j++)
//       {
//         System.out.print(a);
//         a++;
//       }
//    System.out.println();
//    }
//   }
// } 

// import java.util.Scanner;                 // print the pattern q 8 star plus 
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
// int mid = n/2+1;
//     for(int i=1;i<=n;i++)
//     {
//       for(int j =1;j<=n;j++)
//       {
//         if ( i== mid || j == mid)
//           System.out.print("* ");
//         else 
//           System.out.print(" "+" ");
//       }
//     System.out.println();
//   }
//   }
// }

// import java.util.Scanner;              //star cross
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=n;j++)
//       {
//         if ( i == j || i + j == n+1)
//           System.out.print("* ");
//         else System.out.print(" "+" ");
//       }
//    System.out.println(); }
//   }
// }

// import java.util.Scanner;             //binary traingle
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=i;j++)
//       {
//         if (i % 2 != 0){
//          if (j % 2 == 1)
//           System.out.print("1 ");
//         else System.out.print("0 ");
// }
//  if (i % 2 == 0){
//    if(j%2==0)
//    System.out.print("1 ");
//   else System.out.print("0 ");
//   }}
//   System.out.println();}

// }
// }

// import java.util.Scanner;            //reevision
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();

//     int mid = 2/n+1;

//     for(int i=1;i<=n;i++)
//     {
//       for(int j =1;j<=n;j++)
//       {
//         if(i == mid || j == mid)
//         System.out.print("* ");
//         else 
//         System.out.print(" "+" ");    
//        }
//     System.out.println();
//   }
//   }
// }

// import java.util.Scanner;           //method 1 star triangle flipped
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=n;j++)
//       {
//         if (i+j>n)
//           System.out.print("*"+" ");
//         else System.out.print(" "+" ");
//       }
//     System.out.println();
//   }
//   }
// }

// import java.util.Scanner;             // composite important method of star triangle flip
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i =1;i<=n;i++)
//     {
//       for(int j =1;j<=n-i;j++)
//       {
//         System.out.print(" "+" ");
//       }
//       for(int j=1;j<=i;j++)
//       {
//         System.out.print(j+" ");
//       }
//     System.out.println();
//   }
//   }
// }

// import java.util.Scanner;              //rhombus
// public class trianglepatterns{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i =1;i<=n;i++)
//     {
//       for(int j =1;j<=n-i;j++)
//         {
//           System.out.print(" "+" ");
//       }
//       for(int j =1;j<=n;j++)
//       {
//         System.out.print("*"+" ");
//       }
//     System.out.println();
//   }
//   }
// }

import java.util.Scanner;                    //star pyramid
public class trianglepatterns{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

     for(int i =1;i<=n;i++)
    {
      for (int j =1;j<=n-i;j++)
      {
        System.out.print(" "+" ");
      }
      for(int j = 1;j<=2*i-1;j++)
      {
          System.out.print("*"+" ");
      }
    System.out.println();
  }
 sc.close(); }
}