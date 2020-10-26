package produto;

import java.util.Scanner;

import Service.ProdutoService;
import modelProduto.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		ProdutoService produtoservice = new ProdutoService();
		Produto newProduto = new Produto();
		
		ProdutoService produtoService = new ProdutoService();
        
        System.out.println("Digite de 0 a 5:");
        Produto produto = produtoService.GetProduto(leitor.nextInt());
        System.out.println("Codigo do produto:"+produto.Codigo_produto+" Nome: " + produto.Nome + " ----  Valor: " + produto.Valor + " ------ Calculo com imposto: " + produto.Calculo);


        leitor.close();


	}

}
