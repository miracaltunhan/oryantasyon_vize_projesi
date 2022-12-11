package odev;

public class odev9 {
    public static void main(String[]args){
// aradığımız sayının mevcut olup olmadığını yazdıran sistem

        int [] sayilar= new int[]{1,2,3,5,6,8};
        int aranacak= 7;
        boolean varmi=false;
        for(int sayi: sayilar){
            if(sayi==aranacak){
                varmi= true;
                break;
            }
        }

        if(varmi==true){
            System.out.println("Sayı mevcuttur");
        }else{
            System.out.println("Sayı mevcut değildir");

        }
    }}