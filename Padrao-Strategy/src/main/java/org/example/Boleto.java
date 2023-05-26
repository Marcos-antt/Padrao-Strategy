package org.example;

public class Boleto implements ModoPagamento{
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto bancário.");
    }
}
