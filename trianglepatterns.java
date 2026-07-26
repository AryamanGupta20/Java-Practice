// import java.util.Scanner;             //star triangle

// public class trianglepatterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
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

import java.util.Scanner;
public class trianglepatterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n;i++)
        {
            for(int j =1;j<=n+1-i;j++)
            {
                System.out.print(j);
            }
     System.out.println();
       }
    }
}