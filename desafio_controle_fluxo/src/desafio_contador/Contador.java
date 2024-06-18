package desafio_contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro paramêtro: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite o segundo paramêtro: ");
        int numberTwo = sc.nextInt();

        try {
            count(numberOne, numberTwo);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void count (int numerOne, int numerTwo) throws ParametrosInvalidosException {
        validateFirstLargestSecondNumber(numerOne, numerTwo);
        int counting = numerTwo - numerOne;
        for (int i = 0; i < counting; i++) {
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }

    static boolean validateFirstLargestSecondNumber (int numerOne, int numerTwo) throws ParametrosInvalidosException {
        if (numerOne > numerTwo) {
            throw new ParametrosInvalidosException();
        }
        return false;
    }
}