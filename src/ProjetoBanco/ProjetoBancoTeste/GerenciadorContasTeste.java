package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaCorrente;
import ProjetoBanco.ContaEspecial;
import ProjetoBanco.ContaPoupanca;
import ProjetoBanco.GerenciadorContas;
import org.junit.Test;

import static org.junit.Assert.*;

public class GerenciadorContasTeste {

    GerenciadorContas gc = new GerenciadorContas();

    ContaCorrente cc = new ContaCorrente("205.518.520-85","Lucas Garcia",654321,10000.00,5500);
    ContaEspecial ce = new ContaEspecial("205.518.520-85","Lucas Garcia",123456,10000.00,"Marcos Paulo");
    ContaPoupanca cp = new ContaPoupanca("205.518.520-85","Lucas Garcia",123654,10000.00);


    @Test
    public void testeAdicionarContas(){
        gc.adicionarConta(cc);
        assertFalse("Retorno de lista com uma conta",gc.getList().isEmpty());
    }

    @Test
    public void testeRemoverContas(){
        gc.adicionarConta(cc);
        gc.removerConta(654321);
        assertTrue("Retorno de lista vazia",gc.getList().isEmpty());
    }

    @Test
    public void testeBuscarContasEpeciais(){
        gc.adicionarConta(cc);
        gc.adicionarConta(ce);
        gc.adicionarConta(cp);
        assertEquals("Buscar conta separa usando um as contas usando mask",ce + "\n",gc.buscarContasEpeciais());
    }

    @Test
    public void testeBuscarClientesUsandoLimite(){
        gc.adicionarConta(cc);
        cc.sacar(11000);
        assertEquals("Buscar conta separa usando um as contas usando mask", cc + "\n", gc.buscarClientesUsandoLimite());
    }

    @Test
    public void testeBuscarConta(){
        gc.adicionarConta(cc);
        assertEquals(cc,gc.buscarConta(654321));
    }

    @Test
    public void testeTransferirValor(){
        gc.adicionarConta(cc);
        gc.adicionarConta(cp);
        assertTrue(gc.transferirValor(654321,123654,500));
    }

    @Test
    public void testeSacar(){
        gc.adicionarConta(cc);
        gc.sacar(654321,2000);
        assertEquals(8000,cc.getSaldo(),1);
    }

    @Test
    public void testeDepositar(){
        gc.adicionarConta(cc);
        gc.depositar(654321,2000);
        assertEquals(12000,cc.getSaldo(),1);
    }
}
