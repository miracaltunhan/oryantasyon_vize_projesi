package odev;

import java.util.Random;
import java.util.Scanner;

public class odev8 {

    public static void main(String[] args) {


        //1.taş
        //2.kağıt
        //3.makas
        int kisi,computer;

        Random rnd=new Random();
        computer=rnd.nextInt(3)+1;
        System.out.println("pc"+computer);
        System.out.println("1.taş");
        System.out.println("2.kağıt");
        System.out.println("3.makas");
        System.out.println("Lütfen seçiminizi yapınız");
        Scanner gelenioku=new Scanner(System.in);
        kisi=gelenioku.nextInt();
        if(kisi!=1 && kisi!=2 && kisi!=3)
        {
            System.out.println("yanlış bir seçim yapılmıştır.");
        }
        else
        {

            if(computer==kisi)
            {
                System.out.println("quits");
            }
            if(computer==1 &&kisi==2)
            {
                System.out.println("win you");
            }
            if(computer==1 && kisi==3)
            {
                System.out.println("win computer");
            }
            if(computer==2 && kisi==1)
            {
                System.out.println("win computer");
            }
            if(computer==2 && kisi==3)
            {
                System.out.println("win you");
            }
            if(computer==3 && kisi==1)
            {
                System.out.println("win you");
            }
            if(computer==3 && kisi==2)
            {
                System.out.println("win computer");
            }

        }



    }

}