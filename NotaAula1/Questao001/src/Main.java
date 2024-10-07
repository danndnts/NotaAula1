import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Aluno a2 = new Aluno("Joãozinho", 10.0, 5.0, 7.0);


        Professor p = new Professor();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;

        do{
            System.out.println("Digite 0 se for Aluno e 1 se for Professor");
            int opcao = sc.nextInt();
            switch (opcao) {
                case(0):
                    System.out.println("Digite seu nome: ");
                    a.setNome(sc2.nextLine());

                    System.out.println("Digite sua idade: ");
                    a.setIdade(sc.nextInt());

                    System.out.println("Digite seu sexo: ");
                    a.setSexo(sc2.nextLine());

                    System.out.println("Digite sua matricula: ");
                    a.setMatricula(sc2.nextLine());

                    System.out.println("Digite a primeira nota:");
                    a.setNota01(sc.nextDouble());

                    System.out.println("Digite a segunda nota:");
                    a.setNota02(sc.nextDouble());

                    System.out.println("Digite a terceira nota:");
                    a.setNota03(sc.nextDouble());

                    a.calcularMedia();
                    a.verificarAprovacao();
                    a.exibirDetalhesAluno();

                    break;

                case(1):
                    System.out.println("Digite seu nome");
                    a.setNome(sc2.nextLine());

                    System.out.println("Digite sua idade: ");
                    a.setIdade(sc.nextInt());

                    System.out.println("Digite seu sexo: ");
                    a.setSexo(sc2.nextLine());

                    System.out.println("Digite sua matricula: ");
                    a.setMatricula(sc2.nextLine());

                    System.out.println("Digite as horas de serviços prestado: ");
                    p.setHora(sc.nextInt());

                    System.out.println("Digite o valor do Salário por hora: ");
                    p.setSalario(sc.nextDouble());

                    break;


            }

            System.out.println("Deseja cadastrar outro usuário, digite S");
            r = sc.next();
        } while (r.equalsIgnoreCase("S"));



    }
}