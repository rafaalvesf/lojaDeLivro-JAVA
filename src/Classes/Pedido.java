package Classes;

public class Pedido {
    int numeroPedido, quantidade;

    Pedido(int numeroPedido, int quantidade){
        this.numeroPedido = numeroPedido;
        this.quantidade = quantidade;
    }
    //classe pedido recebendo a classe produto
    double comprar(Produto produto){
        return this.quantidade * produto.valorDeVenda;
    }
}
