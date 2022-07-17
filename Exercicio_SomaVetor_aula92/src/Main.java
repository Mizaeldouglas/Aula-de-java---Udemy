import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma;
        double media;


        System.out.print("Quantos Numeros você vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double [n];

        for (int i = 0; i < n; i++){
            System.out.print("digite Um numero? ");
            vet[i] = sc.nextDouble();

        }
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", vet[i]);
        }
        soma = 0;
        for(int i =0; i<n; i++){
            soma = soma + vet[i];
        }
        media = soma / n;


        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("\nMEDIA = %.2f\n", media);




        sc.close();



    }
}