package exercicio_1_1;

public class FabricaResult implements Fabrica {
	
	public static final String SCREEN = "SCREEN";
	public static final String FILE = "FILE";
	

	@Override
	public Produto getProduto(String imprimirTipo) {
		
		switch (imprimirTipo) {
		case SCREEN: return new Imprime();
		case FILE: return new ProdutoResult();
		}
		
		return null;
	}

}