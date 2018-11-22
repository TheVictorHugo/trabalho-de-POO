package padrao;
import java.util.*;

public class Cliente {
	private String nome;
	private int numero = 0;
	private ArrayList<Produto> produtosComprados = new ArrayList<>();
	/*
	Carrinho carrinho = new Carrinho();
	Scanner ler = new Scanner(System.in);
	
	public void finalizarCompra() {
		String nomeC;
		System.out.println("Qual o nome do cliente:");
		nomeC = ler.nextLine();
		//this.numero = this.numero + 1;
		int prazoDeEntrega;
		
		for(int i =0; i < carrinho.getProdutoComprar().size(); i++) {
			int maior = 0;
			if(maior < carrinho.getProdutoComprar().get(i).getTempoEntrega()) {
				maior = carrinho.getProdutoComprar().get(i).getTempoEntrega();
			}else {
				
			}
			prazoDeEntrega = maior;
			//carrinho.getProdutoComprar().get(i).getTempoEntrega();
			addCliente(nomeC,carrinho.getProdutoComprar());
		}
		
	}
	
	public void addCliente(String nome,ArrayList<Produto> p) {
		this.nome = nome;
		this.numero = this.numero + 1;
		produtosComprados.addAll(p);
		System.out.println(">>>>> Compra finalizada <<<<<");
	}*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList<Produto> getProdutosComprados() {
		return produtosComprados;
	}
	public void setProdutosComprados(ArrayList<Produto> produtosComprados) {
		this.produtosComprados = produtosComprados;
	}
	
}
