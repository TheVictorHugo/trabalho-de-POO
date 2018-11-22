package padrao;
import java.util.ArrayList;
import java.util.Scanner;
public class ContorlaCliente {
	ArrayList<Cliente> clienteList = new ArrayList<>();
	Carrinho carrinho = new Carrinho();
	Scanner ler = new Scanner(System.in);
	
	public void finalizarCompra(ArrayList<Produto> p) {
		String nomeC;
		System.out.println("Qual o nome do cliente:");
		nomeC = ler.nextLine();
		//int prazoDeEntrega;
		/*
		for(int i =0; i < carrinho.getProdutoComprar().size(); i++) {
			int maior = 0;
			if(maior < carrinho.getProdutoComprar().get(i).getTempoEntrega()) {
				maior = carrinho.getProdutoComprar().get(i).getTempoEntrega();
			}else {
				
			}
			prazoDeEntrega = maior;
		}*/
		addCliente(nomeC,p);
		carrinho.getProdutoComprar().clear();
	}
	
	public void addCliente(String nome,ArrayList<Produto> p) {
		ArrayList<Produto> pNew = new ArrayList<>();
		pNew = p;
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setProdutosComprados(pNew);
		
		//cliente.setProdutosComprados(p.get(i));
		clienteList.add(cliente);
		System.out.println(">>>>> Compra finalizada <<<<<");
	}
	
	public void listaCliente() {
		
		if(this.clienteList.size() == 0) {
			System.out.println("\n         NÃO TEM COMPRARS FINALIZADAS");
		}
		for(int i =0;i < this.clienteList.size();i++) {
			System.out.printf("Nome: %s >>>>>", this.clienteList.get(i).getNome());
			for(int j =0; j < clienteList.get(i).getProdutosComprados().size();j++ ) {
				System.out.printf("[Produto: %s, Quantidade: %d]\n", this.clienteList.get(i).getProdutosComprados().get(j).getNome(),
						this.clienteList.get(i).getProdutosComprados().get(j).getQuantidade());
			}
		}
		
		System.out.println();
	}
}
