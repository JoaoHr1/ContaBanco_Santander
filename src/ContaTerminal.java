import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao nosso banco.\nPor favor, insira o número da sua conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.next();
        System.out.println("Por fim, digite o seu saldo");
        BigDecimal saldoConta = sc.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a de número " + agencia + ", conta número " + numero + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");
        System.out.println("Digite 1 para realizar um saque ou 2 para finalizar a aplicação: ");
        int confirmacao = sc.nextInt();

        if (confirmacao == 1) {
            System.out.println("Digite o valor do saque: ");
            BigDecimal saque = sc.nextBigDecimal();
            if (saque.equals(saldoConta) || saque.doubleValue() < saldoConta.doubleValue()) {
                BigDecimal novoSaldo = saldoConta.subtract(saque);
                System.out.println("Saque feito com sucesso, seu nomo saldo é de R$" + novoSaldo);
            } else System.out.println("O saque não foi concluido pois o saldo é insuficiente. Tente novamente:");
        } else if (confirmacao == 2) {
            System.out.println("Finalizando...");
            sc.close();
        }
        System.out.println("Obrigado pela preferência!");
    }
}