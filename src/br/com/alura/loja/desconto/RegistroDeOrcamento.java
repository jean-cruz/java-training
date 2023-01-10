package br.com.alura.loja.desconto;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.Orcamento;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        //chamada HTTP para a API externa
        // URL Connection
        // Http Client
        // lib Rest
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado!!!");
        }
        String url = "http//api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor",orcamento.getValor(),
                "quantidadeItens",orcamento.getQuantidadeItens()
        );
        http.post(url,dados);
    }
}
