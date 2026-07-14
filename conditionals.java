// import java.util.Scanner;

// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//         if (n%2 == 0) System.out.println("even");
//         else System.out.println("odd");
//         sc.close();

//     }
// }

// import java.util.Scanner;

// public class conditionals{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
        
//         int n = sc.nextInt();

//         if (n % 5 == 0) System.out.println("yes");
//         else System.out.println("no");
// sc.close();
//     }
// }

// import java.util.Scanner;                                 //absulute value question

// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();

//         if (n >= 0) System.out.println(n);
//         else System.out.println(-n);
//         sc.close();    
//     }
// }                                                

// import java.util.Scanner;

// public class conditionals{
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);

//     System.out.println("enter the cost price");
//     double cp = sc.nextDouble();

//     System.out.println("enter the selling price");
//     double sp = sc.nextDouble();

//     if (sp > cp) {
//         System.out.println("profit");
//         System.out.println(sp-cp);
//     }
    
//     else {
//         System.out.println("loss");
//         System.out.println(cp-sp);
//     }
//     if (sp == cp && cp == sp ) System.out.println("no profi no loss");
//     sc.close();
// }

// }

// import java.util.Scanner;

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the digit");
//         int x = sc.nextInt();

//         if (x <= 99 || x >= 1000) System.out.println("its not three digit number");
//         else System.out.println(" its ");
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int x = sc.nextInt();

//         if (x % 3 == 0 || x % 5 == 0) System.out.println("yes");
//         else System.out.println("no");
//         sc.close();
//     }
// }

// import java.util.Scanner;                 //gratest number 

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter first number");
//         int a = sc.nextInt();

//         System.out.println("enter second number");
//         int b = sc.nextInt();

//         System.out.println("enter third number");
//         int c = sc.nextInt();

//         if (a >= b && a >= c)System.out.println(a);
//         else if (b >= a && b >= c)System.out.println(b);
//         else System.out.println(c);

//         sc.close();
//     }
// }

 // import java.util.Scanner;                //grading system,

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         if (n >= 81) System.out.println("wow");
//          else if (n >= 61) System.out.println("good");
//         else if (n >= 41) System.out.println("average");
//         else System.out.println("study hard");
//         sc.close();
//     }
// }

// 3 number input and chack whetever thy form side of trinagle 
// import java.util.Scanner;

// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("first number");
//         int a = sc.nextInt();
//         System.out.println("second number");
//         int b = sc.nextInt();
//         System.out.println("third number");
//         int c = sc.nextInt();
        
//         if ((a+b)>c && (b+c)>a && (c+a)>b ) System.out.println("yes its triangle");
//         else System.out.println("no");
//         sc.close();
  
//     }
// }
                                                     //same code upper 
// import java.util.Scanner ;

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.println("frist number");
//         int a = sc.nextInt();
//         System.out.println("entr second number ");
//         int b = sc.nextInt();
//         System.out.println("entr teh third number ");
//         int c = sc.nextInt();

//         if ((a+b)>c && (b+c)>a && (c+a)>b)System.out.println("yes");
//         else System.out.println("no");
//         sc.close();

//     }
// }

// calculator

// import java.util.Scanner;

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//        char op = sc.next().charAt(0);
//         int b = sc.nextInt();

//         if (op == '+')System.out.print(a+b);
//         else if (op == '*')System.out.print(a*b);
//         else if (op == '-')System.out.print(a-b);
//         else if (op == '/')System.out.print(a/b);
//         sc.close();
// }
// }

// switch statement
// import java.util.Scanner;

// public class conditionals{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//        char op = sc.next().charAt(0);
//         int b = sc.nextInt();
//         sc.close();

//         switch (op){
//             case '+':
//                 System.out.println(a+b);
//                 break;
//                 case '-':
//                 System.out.println(a-b);
//                 break;
//                 case '*':
//                 System.out.println(a*b);
//                 break;
//                 case '/':
//                 System.out.println(a/b);
//                 break;
//         }
// }
// }


