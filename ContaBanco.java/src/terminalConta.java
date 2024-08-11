import java.util.Scanner;

public class terminalConta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Conta  conta = new Conta();
        System.out.println("Digite a agencia:");
        String digiteAgencia = sc.nextLine();
        if(digiteAgencia.equals(conta.Agencia)){
             //String quebra_linha = sc.nextLine();
             System.out.println("digite seu nome para criar a conta:");
             conta.nome = sc.nextLine();
             System.out.println("insira um saldo: ");
             conta.saldo = sc.nextDouble();
             System.out.println("obrigado SR: " + conta.nome);
             System.out.println("sua conta está criada e sua agencia é: " + conta.Agencia);
             System.out.println("o numero da conta: " + conta.Agencia);
             System.out.println("eu saldo é de: " + conta.saldo);
        // conta.registro(conta.nome, novoCliente);
            
        }
        else{
            System.out.println("AGENCIA ERRADA:");
        }
        sc.close();

    }
}
