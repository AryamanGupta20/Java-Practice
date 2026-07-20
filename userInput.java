// import java.util.Scanner;

// public class userInput {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         System.out.println(n*n);           
//     }
// }

// import java.util.Scanner;

// public class userInput {
//       public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the radius");
//         double r = sc.nextDouble();
//         double pi = 3.14;
//         double area = pi *r*r;
//         System.out.println(area);
//       sc.close();
//     }
// }

// import java.util.Scanner;

// public class userInput{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("emter the radius : ");
//     double r = sc.nextDouble();
//     double pi = 3.14;
//     double volume = (4*pi*r*r*r)/100;
//     System.out.println("the volume opf sphere is : "+volume);
//     sc.close();
//   }
// }

import java.util.Scanner;

public class userInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter the length :");
    double l = sc.nextDouble();

    System.out.print("enter the breadth : ");
    double b = sc.nextDouble();

    System.out.println("the area of rectangle :"+l*b);
    sc.close();
}
}