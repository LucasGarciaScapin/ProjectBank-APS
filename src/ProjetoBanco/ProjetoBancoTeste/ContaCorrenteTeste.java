package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaCorrente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaCorrenteTeste {

    @Test
    public void TesteContaCorrente(){

        ContaCorrente c1 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);
        c1.sacar(200);
        assertEquals(true,c1.usandoLimite());


    }




}
