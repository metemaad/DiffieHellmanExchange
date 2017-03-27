import java.util.Random;
import java.util.Scanner;

/**
 * Created by mohammad on 3/27/17.
 */
public class main {
    private static int random(int n)
    {
        Random rand = new Random();

        return rand.nextInt(n) + 1;
    }
        public static void main(String[] args) {
            int p,q;
            double Ta,Tb,Sa,Sb,KeyTa,KeyTb;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the value of p: ");
            p=scan.nextInt();
            System.out.println("Please enter the value of q: ");
            q=scan.nextInt();
            Sa=random(Math.min(p,q));
            Sb=random(Math.min(p,q));
            System.out.println("Generate Random Secret Number Sa: " +Sa);
            System.out.println("Generate Random Secret Number Sb: " +Sb);
            Ta=(int)(Math.pow(q,Sa)%p);
            Tb=(int)(Math.pow(q,Sb)%p);
            System.out.println("Ta: " +Ta);
            System.out.println("Tb: " +Tb);
            System.out.println("Exchange Ta and Tb ");
            KeyTa=(int)(Math.pow(Tb,Sa)%p);
            KeyTb=(int)(Math.pow(Ta,Sb)%p);
            System.out.println("Key Ta: "+KeyTa);
            System.out.println("Key Tb: "+KeyTb);
            if(KeyTa==KeyTb) System.out.println("Secret Key: " + KeyTa);

        }


}
