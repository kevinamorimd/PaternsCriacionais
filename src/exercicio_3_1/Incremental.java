package exercicio_3_1;
//implementado como singleton lazy
public class Incremental {
	private static int count = 0;
	private int numero;
	private static Incremental incremental;

	private Incremental() {
		numero = ++count;
	}
	
	public static Incremental getInstance() {
		if (incremental == null) {
			incremental = new Incremental();
		}
		return incremental;
	}

	public String toString() {
		return "Incremental " + numero;
	}
}
