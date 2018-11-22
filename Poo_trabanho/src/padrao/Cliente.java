package padrao;
import java.util.*;

public class Cliente {
	private String nome;
	private int numero = 0;
	private ArrayList<Produto> produtosComprados = new ArrayList<>();
	
	//private ArrayList<Produto> produtosFix = new ArrayList<>();
	//Scanner ler = new Scanner(System.in);
	
	/*
	public void finalizarCompraCliente(Produto p) {
		System.out.println("Qual o nome do cliente:");
		this.nome = ler.nextLine();
		produtosComprados.add(p);
		addCliente(nomeC,carrinho.getProdutoComprar());
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
