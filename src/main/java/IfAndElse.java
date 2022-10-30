import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
        System.out.println("________________________________________________________");
        System.out.println("Wpisz swój wiek aby dowiedzieć się czy możesz pracować.");
        Scanner scanner = new Scanner(System.in);
        String lata;
        System.out.println("Podaj swój wiek: ");
        System.out.println("________________________________________________________");
        lata = scanner.next();
        // Chce wpisywać wiek w lini z "Podaj swój wiek: " ale nie wychodzi :<



        int wiek = Integer.parseInt(lata);
        if (wiek >= 18) {
            System.out.println("Możesz Pracować na pełen etat.");
        }
        else if (wiek >=16) {
            System.out.println("Możesz pracować do 6  godzin dziennie.");
        }
        else {
            System.out.println("Nie możesz pracować.");
        }
        String info = wiek >= 16 ? "Oraz otrzymać umowę o pracę." : "Jesteś za młody oby podjąć pracę musisz ukończyć 16 lat.";
        System.out.println(info);
    }
}