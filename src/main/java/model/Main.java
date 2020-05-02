package model;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Library library = createLibraryWithBooks();


        int choose = s.nextInt();

        while (true) {
            menu();
            switch (choose) {
                case 1:
                    System.out.println("1. Wyświetl wszystkie książki");
                    break;
                case 2:
                    System.out.println("2. Dodaj książkę");
                    break;
                case 3:
                    System.out.println("3. Usuń książkę");
            }
        }

    }
    public static void menu() {
        System.out.println("Witaj w bibliotece, co mogę dla Ciebie zrobić?");
        System.out.println("1. Wyświetl wszystkie książki");
        System.out.println("2. Dodaj książkę");
        System.out.println("3. Usuń książkę");
    }

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }
}