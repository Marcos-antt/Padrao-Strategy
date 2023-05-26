package org.example;

public class test {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(new CartaoCredito());
        cliente1.realizarPagamento(100.0);

        Cliente cliente2 = new Cliente(new Boleto());
        cliente2.realizarPagamento(150.0);
    }
}
