package Classes;

public class Produto {
    String codigoDeBarras, titulo, tipo;
    double valorDeVenda;

    Produto(String codigoDeBarras, String titulo, String tipo, double valorDeVenda){
        this.codigoDeBarras = codigoDeBarras;
        this.titulo = titulo;
        this.tipo = tipo;
        this.valorDeVenda = valorDeVenda;
    }
}
