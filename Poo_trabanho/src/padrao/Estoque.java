package padrao;
import java.util.*;
public class Estoque implements estoqueInterface {
public ArrayList<Produto> produtoLista = new ArrayList<>();
	
	private Boolean verificaSenha() {
		Scanner ler = new Scanner(System.in);
		int senha;
		System.out.println("Digite a senha:");
		senha = ler.nextInt();
		if(senha == 123) {
			return true;
		}else {
			System.out.println("Digite uma senha válida");
			return false;
		}
	}
	
	public void addListaProduto() {
		
		if(this.verificaSenha()) {
			
			Produto p = new Produto();
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do produto:");
			p.setNome(ler.nextLine());
			System.out.println("Digite o valor do produto:");
			p.setValor(ler.nextInt());
			System.out.println("Digite o quantidade do produto:");
			p.setQuantidade(ler.nextInt());
			System.out.println("Digite o tempode de entrega do produto:");
			p.setTempoEntrega(ler.nextInt());
			
			this.produtoLista.add(p);
		}
		
	}
	
	public void addTeste() {
		Produto p = new Produto();
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3= new Produto();
		
		Scanner ler = new Scanner(System.in);
		
		p.setNome("lapis");
		p.setValor(2);
		p.setQuantidade(20);
		p.setTempoEntrega(2);
		
		p1.setNome("cd");
		p1.setValor(5);
		p1.setQuantidade(20);
		p1.setTempoEntrega(2);
		
		p2.setNome("caderno");
		p2.setValor(8);
		p2.setQuantidade(20);
		p2.setTempoEntrega(2);
		
		p3.setNome("celular");
		p3.setValor(120);
		p3.setQuantidade(20);
		p3.setTempoEntrega(2);
		
		this.produtoLista.add(p);
		this.produtoLista.add(p1);
		this.produtoLista.add(p2);
		this.produtoLista.add(p3);
	}
	
	public void listarProdutos() {
		if(this.produtoLista.size() == 0) {
			System.out.println("\n         NÃO TEM PRODUTO REGISTRADO");
		}
		for(int i =0;i < this.produtoLista.size();i++) {
			System.out.printf("Produto: %s, valor: %d, quantidade, %d | tempo de entrega: %d dias\n", 
					this.produtoLista.get(i).getNome(),
					this.produtoLista.get(i).getValor(),
					this.produtoLista.get(i).getQuantidade(),
					this.produtoLista.get(i).getTempoEntrega());
		}
		System.out.println();
	}

	public Produto buscaProduto() {
		int i;
		Scanner ler = new Scanner(System.in);
		String nomeProduto;
		System.out.println("Qual produto você quer adicionar? :");
		nomeProduto = ler.nextLine();
		
		for(i =0; i < this.produtoLista.size() && !this.produtoLista.get(i).getNome().equals(nomeProduto); i++) {
			//System.out.printf(">>>>>>>>>>>>>>>>>> %s", this.produtoLista.get(i).getNome());
		}

		return this.produtoLista.get(i);
	}
	
	public void AtualizaEstoque(int qtd, Produto p) {
		if( p.getQuantidade() < qtd ) {
			System.out.println("Não temos a quantidade do produto no estoque");
		}else {
			p.setQuantidade(p.getQuantidade() - qtd);
		}
	}
}
