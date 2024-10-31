package MinimumPizzas;

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int i=0;i<t;i++){
            int n =sc.nextInt();
            int x=sc.nextInt();

            int total=n*x;

            int mini_pizza=(total+3)/4;

            System.out.println(mini_pizza);
        }
    }
}
