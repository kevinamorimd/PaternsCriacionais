package exercicio_2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class InformacaoConfidencial implements Informacao {

	@Override
	public String informacao() {

		String local = "c:\\Confidencial.txt";
		File arquivo = new File(local);

		StringBuffer buffer = new StringBuffer();

		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader(arquivo));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			buffer.append(scanner.nextLine());
			buffer.append("\n");
		}
		scanner.close();

		return buffer.toString();
	}

}