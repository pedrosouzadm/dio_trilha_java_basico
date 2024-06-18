package projeto_processo_seletivo;

public class Case3 {

    public static void main(String[] args) {

        String[] candidates = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos aprovados e informando o índice do elemento\n");
        for (int index = 0; index < candidates.length; index++) {
            System.out.println("O candidato de n° " + (index+1) + " é o " + candidates[index]);
        }

        System.out.println("\nImprimindo a lista de candidatos abreviada (forEach)\n");
        for (String candidate : candidates) {
            System.out.println("O candidato selecionado foi " + candidate);
        }

    }
}
