package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaCorrente;
import ProjetoBanco.ContaEspecial;
import ProjetoBanco.ContaPoupanca;
import ProjetoBanco.GerenciadorContas;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Testes Unitarios de todos os métodos de GerenciarConta
 * Para a realizacao dos testes foi utilizado a lib - JUnit 4.x
 * @author Lucas Garcia Scapin
 */

public class GerenciadorContasTeste {

    GerenciadorContas gc = new GerenciadorContas();

    ContaCorrente cc = new ContaCorrente("205.518.520-85","Lucas Garcia",65421,10000.00,5500);
    ContaEspecial ce = new ContaEspecial("205.520.518-85","Lucas Garcia",12356,10000.00,"Marcos Paulo");
    ContaPoupanca cp = new ContaPoupanca("518.518.520-85","Lucas Garcia",12654,10000.00);


    @Test
    public void testeAdicionarContas(){
        gc.adicionarConta(cc);
        assertFalse("Retorno de lista com uma conta",gc.getList().isEmpty());
    }

    @Test
    public void testeRemoverContas(){
        gc.adicionarConta(cc);
        gc.removerConta(65421);
        assertTrue("Retorno de lista vazia", gc.getList().isEmpty());
    }

    @Test
    public void testeBuscarContasEpeciais(){
        gc.adicionarConta(cc);
        gc.adicionarConta(ce);
        gc.adicionarConta(cp);
        assertEquals("Retorno de iguais",ce + "\n" + "\n",gc.buscarContasEpeciais());
    }

    @Test
    public void testeBuscarClientesUsandoLimite(){
        gc.adicionarConta(cc);
        cc.sacar(11000);
        assertEquals("Retorno de iguais", cc + "\n" + "\n", gc.buscarClientesUsandoLimite());
    }

    @Test
    public void testeBuscarConta(){
        gc.adicionarConta(cc);
        assertEquals(cc,gc.buscarConta(65421));
    }

    @Test
    public void testeTransferirValor(){
        gc.adicionarConta(cc);
        gc.adicionarConta(cp);
        assertTrue(gc.transferirValor(65421,12654,500.00));
    }

    @Test
    public void testeSacar(){
        gc.adicionarConta(cc);
        gc.sacar(65421,2000);
        assertEquals(8000,cc.getSaldo(),1);
    }

    @Test
    public void testeDepositar(){
        gc.adicionarConta(cc);
        gc.depositar(65421,2000);
        assertEquals(12000,cc.getSaldo(),1);
    }
}
