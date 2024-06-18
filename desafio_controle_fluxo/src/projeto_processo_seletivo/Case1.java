package projeto_processo_seletivo;

import java.util.Scanner;

public class Case1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double baseSalary = 2000.00;
        System.out.println("Digite o salário pretendido: ");
        double desiredSalary = sc.nextDouble();

        if (baseSalary > desiredSalary) {
            System.out.println("Ligar para o candidato.");
        } else if( baseSalary == desiredSalary) {
            System.out.println("Ligar para o candidato, com contra proposta.");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
