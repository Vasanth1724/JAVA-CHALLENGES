package WaterFilling;

import java.util.*;
import java.lang.*;


class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int b3=sc.nextInt();
//            AND (&&): Returns true if both conditions are true.
//            OR (||): Returns true if at least one condition is true.
            if(b1==1 && b2==1 && b3==1 || b1==1 && b2==1 && b3==0 || b2==1 && b3==1 && b1==0 || b1==1 && b3==1 && b2==0){
                System.out.println("Not now");
            }
            else{
                System.out.println("Water filling time");
            }
        }

    }
}

