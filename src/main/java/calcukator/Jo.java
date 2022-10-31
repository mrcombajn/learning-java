package calcukator;

import java.util.Scanner;

public class Jo {
    public static void main(String[] args){
        System.out.println("Kliknij 1 aby dodać");
        System.out.println("Kliknij 2 aby odjąć");
        System.out.println("Kliknij 3 aby podzielić");
        System.out.println("Kliknij 4 aby pomnożyć");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        if (i == 1){
            System.out.println(j + k);
        }else if( i == 2){
            System.out.println(j - k);
        }else if (i == 3){
            System.out.println(j / k);
        }else if(i == 4){
            System.out.println(j * k);
        }else{
            System.out.println("Debil :)");
        }
    }
}
