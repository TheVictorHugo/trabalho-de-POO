package padrao;
import java.util.*;

public class Carrinho {
	private int numeroPedido;
	private int valorCompra;
	private ArrayList<Produto> produtoComprar = new ArrayList<>();
	
	public void addCarrinho(Produto p) {
		int qtd;
		Scanner ler = new Scanner(System.in);
		Produto prod = new Produto();
		System.out.println("Digite a quantidade o produto que você precisa: ");
		qtd = ler.nextInt();
		Estoque estoque = new Estoque();
		
		estoque.AddNoCarrinho(qtd,p);
		
		prod = p;
		prod.setQuantidade(qtd);
		produtoComprar.add(prod);
		//produtoComprar.last
	}
	
	public void removerCarrinho() {
		Scanner ler = new Scanner(System.in);
		String produtorremover;
		System.out.println("Qual produto você deseja remover ?");
		for(int i = 0;i < produtoComprar.size(); i++ ) {
			System.out.printf("%s\n",produtoComprar.get(i).getNome());
		}
		produtorremover = ler.nextLine();
		int i;
		for(i =0; i < produtoComprar.size() && produtorremover != produtoComprar.get(i).getNome(); i++) {
			System.out.printf("Procurando... ");
		}
		produtoComprar.remove(i);
		//while(produtorremover != produtoComprar.)
		//cliente 
	}
	
	public void listaCarrinho() {
		if(this.produtoComprar.size() == 0) {
			System.out.println("\n         NÃO TEM PRODUTO NO CARRINHO");
		}
		for(int i =0; i < produtoComprar.size(); i++) {
			System.out.printf("Produto: %s, valor: %d, quantidade, %d\n", 
					this.produtoComprar.get(i).getNome(),
					this.produtoComprar.get(i).getValor(),
					this.produtoComprar.get(i).getQuantidade());
		}
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public int getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}

	public ArrayList<Produto> getProdutoComprar() {
		return produtoComprar;
	}

	public void setProdutoComprar(ArrayList<Produto> produtoComprar) {
		this.produtoComprar = produtoComprar;
	}
	
	
}
