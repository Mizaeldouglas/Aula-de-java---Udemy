import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[11];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");

            sc.nextLine();

            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] =  new Rent(name,email);

        }
        System.out.println();
        System.out.println("busy rooms:");
        for (int i = 0; i <= 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

    }
}

