import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "João";
        String tipoConta = "Corrente";
        double saldo = 2500;
        double transferencia = 0;
        int opcao;
        System.out.println("------------------------");
        System.out.println ("Dados Iniciais do Cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("------------------------");

        do {
            System.out.println("\n" +
                    "Operações: \n" +
                    "1-Consultar saldos\n" +
                    "2-Receber valor\n" +
                    "3-Transferir valor\n" +
                    "4-Sair\n" +
                    "\n" +
                    "Digite a opção desejada: ");

            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    saldo += leitura.nextDouble();
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor para transferir: ");
                    transferencia = leitura.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Transferencia não permitida, saldo abaixo do valor a ser transferido");
                    } else {
                        saldo -= transferencia;
                        System.out.println("Transferencia realizada com sucesso");
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }while (opcao != 4);
    }
}
