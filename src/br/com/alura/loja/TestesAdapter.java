package br.com.alura.loja;

import br.com.alura.loja.desconto.RegistroDeOrcamento;
import br.com.alura.loja.http.JavaHttClient;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(BigDecimal.TEN,1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttClient());
        registro.registrar(orcamento);
    }
}
