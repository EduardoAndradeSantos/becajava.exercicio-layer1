package Service;

import Repository.ProdutoRepository;
import modelProduto.Produto;

public class ProdutoService {

	public void setProduto(Produto produto) {
		ProdutoRepository produto1 = new ProdutoRepository();

	}

	public Produto GetProduto(int listagem) {
		Produto obj = new Produto();
		obj.Calculo = (obj.Valor * obj.Imposto) + (obj.Valor);

		ProdutoRepository repository = new ProdutoRepository();
		Produto result = repository.GetProduto(listagem);
		return result;
	}
}
