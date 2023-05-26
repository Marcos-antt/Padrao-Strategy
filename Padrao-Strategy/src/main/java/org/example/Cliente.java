package org.example;

public class Cliente {
    private ModoPagamento modoPagamento;

    public Cliente(ModoPagamento modoPagamento) {
        this.modoPagamento = modoPagamento;
    }

    public void realizarPagamento(double valor) {
        modoPagamento.pagar(valor);
    }
}
