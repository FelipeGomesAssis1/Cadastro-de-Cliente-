package cadastrodecliente;

public class CadastroDeCliente {

    public static void main(String[] args) {
        UiCadastroCliente formulario = new UiCadastroCliente();
        Pessoa pessoa = new Pessoa(formulario.nome, formulario.cpf, formulario.endereco, formulario.cidade, formulario.estado);
   
        // Printei para ver as variáveis armazenando os textos que eu escrevo;//  
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getEndereco());
        System.out.println(pessoa.getCidade());
        System.out.println(pessoa.getEstado());

    }

}
