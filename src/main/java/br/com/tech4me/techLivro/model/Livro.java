package br.com.tech4me.techLivro.model;

public class Livro {

    private String nome;
    private String autor;
    private Double valor;
    private Double codigo;
    private Integer numeropagina;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getCodigo() {
        return codigo;
    }
    public void setCodigo(Double codigo) {
        this.codigo = codigo;
    }
    public Integer getNumeropagina() {
        return numeropagina;
    }
    public void setNumeropagina(Integer numeropagina) {
        this.numeropagina = numeropagina;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", codigo=" + codigo + ", nome=" + nome + ", numeropagina=" + numeropagina
                + ", valor=" + valor + "]";
    }

}
