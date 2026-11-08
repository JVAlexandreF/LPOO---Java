// ENCAPSULAMENTO

// Classe com os dados protegidos (encapsulados)
class ContaBancaria {

    // Atributos PRIVADOS: ninguém fora desta classe consegue mexer neles diretamente
    private String titular;
    private double saldo;

    // Construtor para iniciar a conta com segurança
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    // GETTER: Método público apenas para LER o titular
    public String getTitular() {
        return titular;
    }

    // GETTER: Método público apenas para LER o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método controlado para ALTERAR o saldo (regra de negócio protegida)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    // Método controlado para sacar com validação
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }
}

// Classe Principal para testar o Encapsulamento
public class Encapsulamento {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Walldisney", 100.00);

        // minhaConta.saldo = -5000.00; // ERRO! O Java bloqueia porque 'saldo' é private.

        // A única forma de interagir é usando os métodos públicos permitidos:
        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Saldo inicial: R$ " + minhaConta.getSaldo());

        minhaConta.depositar(50.00);   // Funciona (valor válido)
        minhaConta.depositar(-20.00);  // Bloqueado pela regra interna
        minhaConta.sacar(200.00);      // Bloqueado (saldo insuficiente)

        System.out.println("Saldo final: R$ " + minhaConta.getSaldo());
    }
}
