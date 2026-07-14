// basic loops

// import java.util.Scanner;

// public class loops {                       // print n number of times
//     public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            System.out.println("enter number");
//            int n = sc.nextInt();
//         for (int i = 1; i <= n; i++)
//         {
//             System.out.println("hello");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class loops {                       // print 1 to 100
//     public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//         for (int i = 1; i <= 100; i++)
//         {
//             System.out.println(i);
//         }
//   sc.close();
// }
// }

// import java.util.Scanner;

// public class loops {                       // print table of given number
//     public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            int n = sc.nextInt();
//         for (int i = n; i <= 10; i++)
//         {
//             System.out.println(n +"*"+ i +"="+i*n);
//         }
//   sc.close();
// }
// }

// import java.util.Scanner;

// public class loops {                       // print 1 to 100 even numbers
//     public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//         for (int i = 2; i <= 100; i+=2)
//         {
//             System.out.println(i);
//         }
//   sc.close();
// }
// }

// import java.util.Scanner;

// public class loops {                       // print the ap 4,7,10,13... to n terms bymath fromula
//     public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            int n = sc.nextInt();

//         for (int i = 1; i <=3*n+1; i+=3)
//         {
//             System.out.println(i);
//         }
//   sc.close();
// }
// }


// import java.util.Scanner;

// public class loops {                  // print the ap 4,7,10,13... to n terms
//     public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            int n = sc.nextInt();
//            int a = 4, d = -4;
//         for (int i = 1; i <= n; i++)
//         {
//             System.out.println(a);
//             i+=d;
//         }
//   sc.close();
// }
// }

// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int  a = 1, d = 2;
//         for(int i = 1; i <= n; i++)
//         {
//                 System.out.println(a);
//                 i+=d;
//         }
//    sc.close();
// }
// }
                                          
// import java.util.Scanner;            //formula for 9,14,19,24,29....upto "n" term
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i = 9; i<= 5*n+8 ;i+=5)
//         {
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner;    //ap for23,32.... utpo n term
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for(int i = 23; i <= 9*n+24 ; i+=9)
//         {
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner;           //geometric progression
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int a =3;
     
//         for(int i = 3; i <= n; i++)
//     {
//         System.out.println(a);
//         a*=4;
//     }
//     sc.close();
// }
// }


// import java.util.Scanner;         // break  // wap to check if its composite number
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         for (int i = 2; i<= n-1; i++)
//         {
//             if (n % i == 0){
//                 System.out.println("yes its composite number");
//             break;
//             }
//         }
//   sc.close();
// }
// }


// import java.util.Scanner;         // break  // wap to check if its prime number
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int x = 0;   // 0 means prime as an example
//         for (int i = 2; i<= n-1; i++)
//         {
//             if (n % i == 0){
//                 System.out.println("yes its composite number");
//                 x = 1;  // 1 means composite
//             break;
//             }
//         }
//         if (x == 1) System.out.println("nior");
//       else if (x == 0) System.out.println("prime numebr");
//   sc.close();
// }
// }

        // break  // continue
public class loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                continue;   // Skip even numbers
            }

            System.out.println(i);
        }
    }
}
