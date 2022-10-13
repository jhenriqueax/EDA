package produto;

public class main {
	
	public static void main(String[] args) {
		
		RepositorioProdutoNaoPerecivelArray repo = new RepositorioProdutoNaoPerecivelArray(10);
		ProdutoNaoPerecivel prod = new ProdutoNaoPerecivel(13, "ovos" , 12.50, "duzia de ovos para venda", "Produto Perecivel");
		
		
		repo.inserir(prod);
		repo.existe(13);
		repo.existe(10);
		
		
		
		
	}

}
