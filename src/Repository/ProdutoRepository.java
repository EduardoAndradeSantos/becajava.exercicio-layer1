package Repository;
import java.util.ArrayList;
import java.util.List;
import modelProduto.Produto;

public class ProdutoRepository {

	public List<Produto> Lista = new ArrayList<Produto>();

	public Produto GetProduto(int listagem) {
		
		Produto produto = new Produto();
		produto.Codigo_produto = 0;
		produto.Nome = "Xbox";
		produto.Valor = 1500;
		produto.Imposto = 0.18;
		Lista.add(produto);
        
		produto = new Produto();
		produto.Codigo_produto = 1;
		produto.Nome = "Playstation";
		produto.Valor = 1800;
		produto.Imposto = 0.18;
		Lista.add(produto);
		
		produto = new Produto();
		produto.Codigo_produto = 2;
		produto.Nome = "Nintendo";
		produto.Valor = 2000;
		produto.Imposto = 0.18;
		Lista.add(produto);
		
		return Lista.get(listagem);
        
	}
	
	public void setProduto(Produto produto1) {
		Lista.add(produto1);
	}
}
