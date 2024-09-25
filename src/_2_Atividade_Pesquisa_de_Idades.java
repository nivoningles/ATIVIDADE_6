import java.util.Scanner;

public class _2_Atividade_Pesquisa_de_Idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamahoDoGrupo = 0;
        int[] idadeDoGrupo = new int[0];
        int menorDeIdade = 0;
        int maiorDeIdade = 0;
        int numeroDePessoas = 0;

        System.out.print("\nInformar tamanho do grupo: ");
        tamahoDoGrupo = sc.nextInt();
        idadeDoGrupo = new int[tamahoDoGrupo];

        for (int i = 0; i < tamahoDoGrupo; i++) {
            System.out.print("\nInforme a idade da pessoa "+(i+1)+": ");
            idadeDoGrupo[i] = sc.nextInt();
            if (idadeDoGrupo[i] >= 18) {
                maiorDeIdade++;
            }else {
                menorDeIdade++;
            }
        }

        System.out.println("\nA quantidade de membros do grupo foram: "+tamahoDoGrupo+"\nTendo "+menorDeIdade+" menores de idade\nTendo "+maiorDeIdade+" maiores de idades");
    }
}
