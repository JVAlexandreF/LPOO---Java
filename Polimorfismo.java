// POLIMORFISMO

// Classe Pai (Define o comportamento genérico)
class Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento genérico de R$ " + valor);
    }
}

// Classe Filha 1 (Dá a sua própria forma ao método)
class CartaoCredito extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " aprovado no Cartão de Crédito!");
    }
}

// Classe Filha 2 (Dá outra forma ao mesmo método)
class Pix extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Transferência Pix de R$ " + valor + " concluída na hora!");
    }
}

// Classe Principal para testar o Polimorfismo
public class Polimorfismo {
    public static void main(String[] args) {
        
        // O segredo está aqui: a variável é do tipo Pai (Pagamento),
        // mas recebe objetos dos tipos Filhos (CartaoCredito e Pix).
        Pagamento forma1 = new CartaoCredito();
        Pagamento forma2 = new Pix();

        // Chamamos o MESMO método, mas cada um reage do seu jeito:
        forma1.processarPagamento(150.00);
        forma2.processarPagamento(85.50);
    }
}
