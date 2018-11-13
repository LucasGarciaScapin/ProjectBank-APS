package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaPoupanca;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Matheus Oliveira
 */
public class ContaPoupancaTeste {

    ContaPoupanca c = new ContaPoupanca("123.123.123-12", "Matheus", 65432, 120);

    @Test
    public void testeCalcularRendimento(){
        assertEquals(240, c.calculaRendimento(100), 1);
    }
}
