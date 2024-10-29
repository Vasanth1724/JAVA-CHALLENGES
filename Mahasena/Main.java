package Mahasena;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

            if (arr[i]%2==0){
                evencount++;
            } else{
                oddcount++;
            }
        }

        if(evencount>oddcount){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }

    }
}

