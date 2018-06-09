import java.util.Scanner;

public class lesson8 {
    public static void main (String [] args) {
        try (Scanner sc = new Scanner (System.in)){
            /*System.out.print("Imput number a:");
            int a = sc.nextInt();
            System.out.print("Imput number b:");
            int b = sc.nextInt();
            System.out.print("Imput number c:");
            int c = sc.nextInt();
            System.out.println("c="+c);
            System.out.println("b="+b);
            System.out.println("a="+a);
            System.out.println("Programm done");
*/
            int a = sc.nextInt();
            while (a>0 && a<20) {
                System.out.println("Ya Programyst");
                a--;
            }
        }

    }
}
