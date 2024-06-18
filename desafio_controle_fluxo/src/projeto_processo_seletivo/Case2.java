package projeto_processo_seletivo;

import java.util.concurrent.ThreadLocalRandom;

public class Case2 {

    public static void main(String[] args) {

        String[] candidates = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        double baseSalary = 2000.00;
        int candidateToInterview = 0;
        int candidateNumber = 0;

        while (candidateToInterview < 5 && candidateNumber < candidates.length) {
            String candidate = candidates[candidateNumber];
            double desiredSalary = valorPretendido();
            if (desiredSalary <= baseSalary) {
                System.out.println("O candidato: " + candidate + " foi selecionado para entrevista.");
                candidateToInterview++;
            } else {
                System.out.println("O candidato: " + candidate + " foi movido para lista de espera.");
            }
            candidateNumber++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
