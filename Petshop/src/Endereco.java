

public class Endereco {
    private String rua;
    private String bairro;
    private String complemento;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pontoRefencial;

    public Endereco(String rua, String bairro, String complemento, int numero, String cep, String cidade, String estado, String pontoRefencial) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pontoRefencial = pontoRefencial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPontoRefencial() {
        return pontoRefencial;
    }

    public void setPontoRefencial(String pontoRefencial) {
        this.pontoRefencial = pontoRefencial;
    }

}
