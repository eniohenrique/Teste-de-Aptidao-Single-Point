import java.util.Base64;
public class Funcao {

	public Funcao() {

	}
	public static String criptografia(String pValor) {
		return new String(Base64.getEncoder().encode(pValor.getBytes()));
	}
	public static String descriptografia(String pValor) {
		return new String(Base64.getDecoder().decode(pValor.getBytes()));
	}

}
