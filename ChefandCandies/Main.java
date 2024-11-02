package ChefandCandies;

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();

            int candies=n-x;
            //Using ternary operator 
            int packets=(candies>0) ? (candies+3)/4 : 0;

            System.out.println(packets);
        }

    }
}
