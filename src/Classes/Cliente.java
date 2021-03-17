package Classes;

public class Cliente {
    //Cadastro do Cliente Deve conter:
    String nome, email;
    long telefone;

    Cliente(String nome, String email, long telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    String enviaSMS(){
        return "Mensagem de confirmação enviada ao número " + telefone;
    }
    String enviaemail(){
        return "Mensagem de email enviada ao email " + email;
    }
    String apresentacao(){
        return "Fechando pedido do Sr. " + nome + " o pedido será confirmado no e-mail " + email;
    }
}
