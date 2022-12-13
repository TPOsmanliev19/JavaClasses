package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        float points=0;

        if (num<=100)
        {
            points+=5;
        }
        else if (num>100)
        {
            points= (float) (num*0.2);
        }
        else if (num>1000)
        {
            points= (float) (num*0.1);
        }

        if (num%2==0)
        {
            points+=1;
        }

        if (num%10==5)
        {
            points+=2;
        }

        System.out.println(points);
        System.out.print(points+num);
    }
}