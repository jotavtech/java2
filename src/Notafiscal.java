class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }

    public void adicionaProduto2(Produto produto) {
        this.produto2 = produto;
    }

    public void adicionaProduto3(Produto produto) {
        this.produto3 = produto;
    }

    public void exibirNotaFiscal() {
        System.out.println("Nota Fiscal:");
        System.out.println("Cliente: " + cliente.getNome());

        Produto[] produtos = { produto1, produto2, produto3 };
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Preço Final: " + produto.calcularPrecoFinal());
            }
        }
    }
}