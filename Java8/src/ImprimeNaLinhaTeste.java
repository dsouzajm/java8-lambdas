import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ImprimeNaLinhaTeste {

	public static void main(String args[]) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumer = new ImprimeNaLinha();
		
		//Utilizando lambda
		palavras.forEach(s -> System.out.println(s));
		
	}

}


