package ATV02;

public class Cadastro {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("11", "999999999");
        Endereco endereco = new Endereco(12345, "Rua Fragoso", "Recife");
        Cliente cliente = new Cliente("João da Silva", telefone, "123.456.789-10", endereco);

        cliente.getTelefone().alterarNumero("888888888");
        cliente.getTelefone().alterarDdd("22");
        //forma alternativa de imprimir as informações não modificadas
        //cliente.getEndereco().imprimeEnd();

        cliente.getEndereco().setCep(87654321);
        cliente.getEndereco().setLogradouro("Rua C");
        cliente.getEndereco().setBairro("Bairro D");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: (" + cliente.getTelefone().getDdd() + ") " + cliente.getTelefone().getNumero());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("--- ENDEREÇO ---");
        System.out.println("CEP: " + cliente.getEndereco().getCep());
        System.out.println("Logradouro: " + cliente.getEndereco().getLogradouro());
        System.out.println("Bairro: " + cliente.getEndereco().getBairro());
    }
}

