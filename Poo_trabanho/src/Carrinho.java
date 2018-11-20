import java.util.*;

public class Carrinho {
	private int numeroPedido;
	private int valorCompra;
	private ArrayList<Produto> produtoComprar = new ArrayList<>();
	
	public void addCarrinho(Produto p) {
		
		produtoComprar.add(p);
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
}
