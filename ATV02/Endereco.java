package ATV02;

public class Endereco {

    private int cep;
    private String logradouro, bairro;

    Endereco(int cep, String logradouro, String bairro){
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void imprimeEnd(){
        System.out.println("--- ENDEREÇO ---");
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.print("Bairro: " + bairro);
    }

}