import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome de Usúario");
        String usuario = entrada.nextLine();

        System.out.println("Digite o Número da Conta :");
        int conta = entrada.nextInt();

        System.out.println("Por favor, digite o número da Agência! :");
        String agencia = entrada.next();

        System.out.println("Digite o saldo disponivel :");
        int saldo = entrada.nextInt();

        System.out.println("Olá " + usuario + ", " + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + conta 
        + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
