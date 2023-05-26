package org.example;

public class CartaoCredito implements ModoPagamento{
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}
