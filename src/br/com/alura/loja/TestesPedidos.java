package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente,valorOcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.executa(gerador);
    }
}
