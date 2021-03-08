
import javax.swing.JOptionPane;

public class Descriptografando {
	public static void main(String[] args) {

		/// criptografia de "eu amo java" é "ZXUgYW1vIGphdmE="
		String fraseDescriptografada="";

		String fraseCriptografada= JOptionPane.showInputDialog("Insira o codigo criptografado");

		Funcao f = new Funcao();


		fraseDescriptografada= f.descriptografia(fraseCriptografada);
		

		JOptionPane.showMessageDialog(null,fraseDescriptografada,"Descriptografia", JOptionPane.CLOSED_OPTION);
		

	}
}
