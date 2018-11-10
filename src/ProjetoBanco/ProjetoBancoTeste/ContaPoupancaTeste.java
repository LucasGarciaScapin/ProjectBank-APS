package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaPoupanca;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Matheus Oliveira
 */
public class ContaPoupancaTeste {

    ContaPoupanca c = new ContaPoupanca("12312312312", "Mathues", 65432, 120);

    @Test
    public void testeCalcularRendimento(){
        assertEquals(240, c.calculaRendimento(100), 1);
    }
}
