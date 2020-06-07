package exercicio_1_1;

public class Cliente {
	
	public static void main (String[] args) {
		
		Fabrica fabrica = new FabricaResult();
		
		Produto produto = null;
		
		produto = fabrica.getProduto(FabricaResult.SCREEN);
		
		produto.imprimir();
		
		System.out.println("------------------------------");
		
		produto = fabrica.getProduto(FabricaResult.FILE);
		produto.imprimir();
		
		
		
	}

}