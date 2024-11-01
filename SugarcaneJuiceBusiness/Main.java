package SugarcaneJuiceBusiness;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            //formula is available in README check there...
            int profit=15*n;
            System.out.println(profit);

        }


    }
}
