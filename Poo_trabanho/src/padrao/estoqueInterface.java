package padrao;

public interface estoqueInterface {
	public void addListaProduto();
	public void addTeste();
	public void listarProdutos();
	public Produto buscaProduto();
	public void AtualizaEstoque(int qtd, Produto p);
}
