import java.text.DecimalFormat;
import java.util.Scanner;

public class _1_Atividade_Cadastro_de_Notas_de_Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int quantidadeDeAlunos = 0;
        int numeroDoAluno = 0;
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        Double mediaDasNotasAlunos = 0.0;
        Double[] notaDosAlunos = new Double[0];
        Double somaDasNotas = 0.0;
        String mediaFormatado = "";

        System.out.print("\nInformar quantidade de Alunos: ");
        quantidadeDeAlunos = sc.nextInt();
        notaDosAlunos = new Double[quantidadeDeAlunos];

        for (int i = 0; i < quantidadeDeAlunos ; i++) {
            numeroDoAluno++;
            System.out.print("Informe a nota de 0 a 10 do aluno " + numeroDoAluno + ": ");
            notaDosAlunos[i] = sc.nextDouble();
            if (notaDosAlunos[i] < 6) {
                alunosReprovados++;
            } else if (notaDosAlunos[i] >= 6 && notaDosAlunos[i] <= 10) {
                alunosAprovados++;
            } else if (notaDosAlunos[i] > 10) {
                do {
                    System.out.print("Informe um valor de nota entre 0 e 10 do Aluno "+numeroDoAluno+": ");
                    notaDosAlunos[i] = sc.nextDouble();
                } while (notaDosAlunos[i] > 10);

                if (notaDosAlunos[i] < 6) {
                    alunosReprovados++;
                } else if (notaDosAlunos[i] >= 6 && notaDosAlunos[i] <= 10) {
                    alunosAprovados++;
                }
            }
            somaDasNotas = somaDasNotas + notaDosAlunos[i];
        }
        mediaDasNotasAlunos = somaDasNotas / quantidadeDeAlunos;
        mediaFormatado = df.format(mediaDasNotasAlunos);
        System.out.println("\nA média dos Alunos foram "+mediaFormatado +"\nTiveram "+ alunosAprovados +" Alunos Aprovados\nTiveram "+ alunosReprovados+" Alunos Reprovados");
    }
}
