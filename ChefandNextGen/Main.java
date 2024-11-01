package ChefandNextGen;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            int ab=a*b;
            int xy=x*y;

            if(ab<=xy){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
