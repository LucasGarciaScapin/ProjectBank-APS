package ProjetoBanco.ProjetoBancoTeste;

import ProjetoBanco.ContaCorrente;
import ProjetoBanco.GerenciadorContas;
import org.junit.Test;

import static org.junit.Assert.*;

public class GerenciadorContasTeste {

    GerenciadorContas gc = new GerenciadorContas();

    @Test
    public void testeAdicionarContas(){
        ContaCorrente cc = new ContaCorrente("205.518.520-85","Lucas Garcia",29874,25800.00,5500);
        gc.adicionarConta(cc);
        assertFalse("Retorno de lista com uma conta",gc.getList().isEmpty());
    }

    @Test
    public void testeRemoverContas(){
        ContaCorrente cc = new ContaCorrente("205.518.520-85","Lucas Garcia",25874,20000.00,5000);
        gc.adicionarConta(cc);
        gc.removerConta(25874);
        assertTrue("Retorno de lista vazia",gc.getList().isEmpty());

    }

    @Test
    public void testeBuscarContasEpeciais(){

    }
}
