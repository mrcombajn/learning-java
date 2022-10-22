package DataTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Types {

    // 1 bajt - 8 bitów
    // -128 do 127
    byte b;

    short s;

    // 4 bajty - 32 bity
    // -2 147 483 648 -2 147 483 647
    int i;

    // 8 bajtów
    // -9 223 372 036 854 775 808 - 9 223 372 036 854 775 807
    long l;

    //double i float służą do zapisywania liczb zmiennoprzecinkowych
    double a;
    float f;

    //prawda/ fałsz
    boolean bool;

    char c = 'A';

    String string;

    public Types() throws IOException {
        System.out.println("Podaj imie: ");
        //Scanner scanner = new Scanner(System.in);
        //string = scanner.next();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        string = reader.readLine();

        System.out.println("Hello " + string + "!");

        l = Long.MAX_VALUE;
        System.out.println("max long:" + l);

        l = Long.MIN_VALUE;
        System.out.println("min long:" + l);

        System.out.println(c);
    }

}
