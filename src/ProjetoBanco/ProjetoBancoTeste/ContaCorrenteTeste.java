package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaCorrente;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContaCorrenteTeste {

    @Test
    public void testeUsandoLimite(){

        // Teste Unitario - UsandoLimite()
        ContaCorrente c1 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);
        c1.sacar(6000);
        assertTrue(c1.usandoLimite());

        ContaCorrente c2 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);
        c2.sacar(4000);
        assertFalse(c2.usandoLimite());

    }

    @Test
    public void testeSacar(){

        ContaCorrente c1 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);
        assertTrue(c1.sacar(3500));

        ContaCorrente c2 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);
        assertFalse(c2.sacar(10000));

    }




}
