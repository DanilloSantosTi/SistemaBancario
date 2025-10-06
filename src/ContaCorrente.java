public class ContaCorrente {

    private String cpf;
    private String name;
    private Double balance;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double newValue) {
        balance = newValue;
    }

    public ContaCorrente(String cpf, String name, Double balance) {
        this.cpf = cpf;
        this.name = name;
        this.balance = balance;
    }

    public void Sacar(Double value) {
        if (balance > value) {
            this.balance -= value;
            System.out.println("Saque de R$" + value + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void Depositar(Double value) {
        this.balance += value;
        System.out.println("Depósito de R$" + value + " realizada com sucesso.");
    }

    public void Transferir(ContaCorrente destino, Double value) {
        if (value > 0 && this.balance >= value) {
            this.balance -= value;
            destino.Depositar(value);
            System.out.println("Transferência de R$" + value + " realizada com sucesso.");
        } else {
            System.out.println("Não foi possível realizar a transferência. Verifique o valor e o saldo.");
        }
    }

    public double VerSaldo() {
        return this.balance;
    }
}
