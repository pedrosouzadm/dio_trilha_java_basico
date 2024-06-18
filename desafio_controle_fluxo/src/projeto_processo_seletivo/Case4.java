package projeto_processo_seletivo;

import java.util.Random;

public class Case4 {

    public static void main(String[] args) {

        String[] candidates = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidate : candidates) {
            call(candidate);
        }

    }

    static void call(String candidate) {

        boolean answerThePhone = false;
        boolean tryAgain = true;
        int callThePhone = 1;

        do {
            answerThePhone = answer();
            tryAgain = !answerThePhone;
            if (tryAgain) {
                callThePhone++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (tryAgain && callThePhone < 3);

        if (answerThePhone) {
            System.out.println("Conseguimos contato com " + candidate + " na " + callThePhone + " tentativa.\n");
        } else {
            System.out.println("Não conseguimos contato com " + candidate + " sendo o número máximo de tentativas " + callThePhone + " realizadas.\n");
        }

    }

    static boolean answer() {
        return new Random().nextInt(3) == 1;
    }
}
