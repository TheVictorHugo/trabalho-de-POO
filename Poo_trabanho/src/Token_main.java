import java.util.Scanner;

public class Token_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		Estoque estoque = new Estoque();
		Carrinho carrinho = new Carrinho();
		//Scanner ler = new Scanner(System.in);
		//System.out.println("Digite uma opção:");
		//opcao = ler.nextInt();
		
		//estoque.addListaProduto();
		//1estoque.addListaProduto();
		Scanner ler = new Scanner(System.in);
		//1opcao = ler.nextInt();
	
		do {
			
			System.out.println("-----------------MENU-----------------");
			System.out.println("1 - Cadastrar produtos                |");
			System.out.println("2 - Adicionar no carrinho           |");
			//System.out.println("3 - Adicionar no carrinho             |");
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
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				estoque.addListaProduto();
				break;
			case 2:
				
				
				carrinho.addCarrinho(estoque.buscaProduto());
				
				break;
			default:
				//
			}
			
			
		}while(opcao !=0);
	}

}
