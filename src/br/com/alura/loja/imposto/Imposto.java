package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

   private Imposto outro;

   public Imposto(Imposto outro) {
      this.outro = outro;
   }
   protected abstract BigDecimal realizarCaluclo(Orcamento orcamento);

   public BigDecimal calcular(Orcamento orcamento){
      BigDecimal valorImposto = realizarCaluclo(orcamento);
      BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
      if (outro != null){
         valorDoOutroImposto = outro.realizarCaluclo(orcamento);
      }
      return valorImposto.add(valorDoOutroImposto);

   }
}
