package desafio;
import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {

        String nome = "Kaique Castro";
        String tipoConta = "Corrente";
        double saldo = 19000;
        double deposito =0;
        double saque =0;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
        System.out.println("----------Dados do cliente----------");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);


        System.out.println("----------Operações----------");
        System.out.println("1- Consultar Saldo da conta");
        System.out.println("2- Realizar Depósito ");
        System.out.println("3- Realizar Saque");
        System.out.println("4- Sair");

        System.out.println("Digite a operação que deseja realizar: ");
        opcao = leitura.nextInt();

     if (opcao == 1) {
         System.out.println("Seu saldo é: " + saldo);

     }else if(opcao == 2){
             System.out.println("Qual será o valor do seu depósito?");
             deposito = leitura.nextDouble();
             saldo += deposito;
             System.out.println("Seu novo saldo é: " + saldo);

     }else if(opcao == 3){
             System.out.println("Qual será o valor do seu saque?");
             saque = leitura.nextDouble();
             saldo -= saque;
             System.out.println("Seu novo saldo é: " + saldo);
     }else if(opcao == 4) {
         break;
     }else
         System.out.println("Número inválido.");


     }



        }
    }


