// public class chardatatype {
//     public static void main(String[] args) {
//         char ch = '8';
//         System.out.println(ch);
//         System.out.println(8);
//     }
// }


// below code is to take out ascii value of char :

import java.util.Scanner;

public class chardatatype {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the character : ");
    
    char ch = sc.next().charAt(0);
    int x = (int)ch;
    System.out.println(x);
    sc.close();
  
    }
}
