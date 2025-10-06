public class Main {
    public static void main(String[] args) {
        // 1. Criação das contas correntes
        System.out.println("--- Criando as contas ---");
        ContaCorrente contaJoao = new ContaCorrente("111.222.333-44", "João Silva", 1500.00);
        ContaCorrente contaMaria = new ContaCorrente("555.666.777-88", "Maria Souza", 800.50);

        // 2. Exibindo os saldos iniciais
        System.out.println("\n--- Saldos Iniciais ---");
        System.out.println("Saldo da conta de " + contaJoao.getName() + ": R$ " + contaJoao.VerSaldo());
        System.out.println("Saldo da conta de " + contaMaria.getName() + ": R$ " + contaMaria.VerSaldo());

        // 3. Realizando operações
        System.out.println("\n--- Iniciando Operações ---");

        // Operação A: Depósito na conta de Maria
        System.out.println("\n> Maria recebeu um depósito de R$ 200,00.");
        contaMaria.Depositar(200.00);
        System.out.println("Novo saldo de " + contaMaria.getName() + ": R$ " + contaMaria.VerSaldo());

        // Operação B: Saque na conta de João
        System.out.println("\n> João está sacando R$ 350,00.");
        contaJoao.Sacar(350.00);
        System.out.println("Novo saldo de " + contaJoao.getName() + ": R$ " + contaJoao.VerSaldo());

        // Operação C: Tentativa de saque com saldo insuficiente
        System.out.println("\n> João tenta sacar R$ 2000,00 (valor maior que o saldo).");
        contaJoao.Sacar(2000.00); // Isso irá imprimir "Saldo insuficiente"

        // Operação D: Transferência de João para Maria
        System.out.println("\n> João vai transferir R$ 400,00 para Maria.");
        // Use o método Transferir corrigido na sua classe ContaCorrente
        contaJoao.Transferir(contaMaria, 400.00);

        // 4. Exibindo os saldos finais após a transferência
        System.out.println("\n--- Saldos Finais ---");
        System.out.println("Saldo final da conta de " + contaJoao.getName() + ": R$ " + String.format("%.2f", contaJoao.VerSaldo()));
        System.out.println("Saldo final da conta de " + contaMaria.getName() + ": R$ " + String.format("%.2f", contaMaria.VerSaldo()));
    }
}