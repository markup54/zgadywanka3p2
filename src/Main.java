import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("na lekcji programowania");

        int wylosowanaLiczba = (int) (Math.random()*100+1);
        //rzutowanie
        /*
        typy proste przechowują tylko wartość
        logiczne boolean
        całkowite byte short int long
        rzeczywiste float double
        znakowy char

        typy złożóne obiekty własności i metody
        String Integer Kosc
         */
        System.out.println(wylosowanaLiczba);


        //wczytywanie z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wpisanaLiczba = klawiatura.nextInt();


    }
}