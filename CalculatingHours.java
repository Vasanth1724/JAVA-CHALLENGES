import java.util.*;
import java.lang.*;


class CalculatingHours
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            int totalhours=x*4 + y;
            System.out.println(totalhours);
        }
    }
}
