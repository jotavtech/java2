class Produto implements Calculavel {
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(String nome, double preco, CategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public double calcularImposto() {
        return preco * 0.1;
    }

    public double calcularJuros() {
        return 0;
    }

    public double calcularLucro() {
        return preco * 0.2;
    }

    public double calcularDesconto() {
        return preco * 0.05;
    }

    public double calcularTaxaManuseio() {
        return 2;
    }

    public double calcularPrecoFinal() {
        return preco + calcularImposto() - calcularDesconto() + calcularTaxaManuseio();
    }

    public double calcularTotal() {
        return calcularPrecoFinal();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
