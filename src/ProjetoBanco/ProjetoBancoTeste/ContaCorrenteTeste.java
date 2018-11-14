package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaCorrente;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * @author Matheus Oliveira
 * @author Lucas Garcia
 */

public class ContaCorrenteTeste {

    ContaCorrente c1 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);
    ContaCorrente c2 = new ContaCorrente("039.444.251-07","Lucas Garcia",25874,5000,2000);


    @Test
    public void testeUsandoLimite(){
        // Teste Unitario - UsandoLimite()
        c1.sacar(6000);
        assertTrue(c1.usandoLimite());

        c2.sacar(4000);
        assertFalse(c2.usandoLimite());
    }

    @Test
    public void testeSacar(){
        assertTrue(c1.sacar(3500));
        assertFalse(c2.sacar(10000));

    }




}
