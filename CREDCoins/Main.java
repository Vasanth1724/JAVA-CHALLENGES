package CREDCoins;

import java.util.*;
import java.lang.*;


class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            int coins=x*y;
            if(coins>=100){
                int bags=coins/100;
                System.out.println(bags);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
