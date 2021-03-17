package Classes;

public class Comprar {
    public static void main(String[] args) {
        //cria objeto cliente
        System.out.println("Cadastrando Cliente...");
        Cliente primeiroCliente = new Cliente("Joao","joao@gmail.com",313333-2222);

        //cria objeto produto
        System.out.println("Cadastrando Produtos...");
        Produto produto1 = new Produto("34509asdfllasf","Livro de História",
                "Livro", 30.5);

        //Cria objeto pedido
        System.out.println("Criando Pedido...");
        Pedido pedido1 = new Pedido(1010, 3);

        //confirma os dados do cliente cadastrado
        System.out.println(primeiroCliente.apresentacao());

        //Realizar calculo de valor total
        System.out.println(primeiroCliente.nome + " comprou " + pedido1.quantidade + " ítens de: " + produto1.titulo);
        System.out.printf("O total da compra foi de: R$%.2f",pedido1.comprar(produto1));

        //enviar mensagens de configrmação
        System.out.println(primeiroCliente.enviaSMS());
        System.out.println(primeiroCliente.enviaemail());
    }
}
