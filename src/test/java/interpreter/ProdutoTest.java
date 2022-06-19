package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveCalcularDescontoProduto() {
        Produto produto = new Produto();
        produto.setValor(50.0);
        produto.setDesconto(5.0);

        assertEquals(45.0, produto.calcularDesconto());
    }

}
