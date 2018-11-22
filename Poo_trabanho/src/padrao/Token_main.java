package padrao;
import java.util.ArrayList;
import java.util.Scanner;
public class Token_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		Estoque estoque = new Estoque();
		Carrinho carrinho = new Carrinho();
		
		Carrinho carrinhoFinalizado = new Carrinho();
		
		//ArrayList<Cliente> clienteLista = new ArrayList<>();
		ContorlaCliente contorlaCliente = new ContorlaCliente();
		
		
		//Scanner ler = new Scanner(System.in);
		//System.out.println("Digite uma opção:");
		//opcao = ler.nextInt();
		estoque.addTeste();
		//estoque.addListaProduto();
		//1estoque.addListaProduto();
		Scanner ler = new Scanner(System.in);
		//1opcao = ler.nextInt();
	
		do {
			
			System.out.println("-----------------MENU-----------------");
			System.out.println("1 - Cadastrar produtos                |");
			System.out.println("2 - Adicionar no carrinho             |");
			System.out.println("3 - Fechar compra                     |");
			System.out.println("--------------------------------------");
			
			System.out.println();
			
			System.out.println("--------------PRODUTOS NA LOJA--------------");
			System.out.println("       Produto | Valor | Quantidade         |");
			System.out.println("--------------------------------------------");
			//System.out.println("CD            | 5");
			//System.out.println("lápis            | 5");
			//System.out.println("Caderno            | 5");
			estoque.listarProdutos();
			
		
			System.out.println("--------------------------------------------");
			
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("                           CARRINHO");
			carrinho.listaCarrinho();
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("                           COMPRAS FINALIZADAS");
			contorlaCliente.listaCliente();
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				estoque.addListaProduto();
				break;
			case 2:
				//estoque.AtualizaEstoque(qtd, p);
				carrinho.addCarrinho(estoque.buscaProduto());
				break;
			case 3:
				contorlaCliente.finalizarCompra(carrinho.getProdutoComprar());
				//carrinho.setProdutoComprarCliente(carrinho.getProdutoComprar()); 
				//carrinho.produtoComprar.clear();
				
				//carrinho.removerCarrinhoCompra();
				break;
			default:
				//
			}
			
			
		}while(opcao !=0);
	}
}
