public class MainNotaFiscal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Vitor");
        Produto produto1 = new Produto("TV", 1000, CategoriaProduto.ELETRONICO);
        Produto produto2 = new Produto("Caderno", 10, CategoriaProduto.PAPELARIA);

        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.adicionaCliente(cliente);
        notaFiscal.adicionaProduto1(produto1);
        notaFiscal.adicionaProduto2(produto2);

        notaFiscal.exibirNotaFiscal();
    }
}
