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


import java.util.Scanner;          // to count digits of any number
public class whileloop{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;

        while(n!=0)     // condition
        {
           int ld = n % 10;
           sum+=ld;
           n /= 10;
            
        }
         System.out.println(sum);
    }}
