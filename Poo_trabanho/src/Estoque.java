
import java.util.*;


public class Estoque {

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
		Scanner ler = new Scanner(System.in);
		String nomeProduto;
		System.out.println("Qual produto você quer adicionar? :");
		nomeProduto = ler.nextLine();
		System.out.printf("%s", nomeProduto);
		int i ;
		for(i =0; i < this.produtoLista.size() && nomeProduto != this.produtoLista.get(i).getNome(); i++) {
			System.out.println("...");
		}
		return this.produtoLista.get(0);
	}
	
}
