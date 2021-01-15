import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStringsPorTamanhoTeste {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		// Ordena
		//Comparator<String> comparador = new OrdenaStringsPorTamanho();
		// palavras.sort(comparador);

		// Imprime
		//Consumer<String> consumidor = new ImprimeNaLinha();
		// palavras.forEach(consumidor);

		// Lambda
		/*
		 palavras.sort((String s1, String s2) -> { return Integer.compare(s1.length(),
		 s2.length()); });
		 */

		// Lambda
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		// Method Reference
		//palavras.sort(Comparator.comparing(String::length));
		
		//Outra
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		//Lambda
		//palavras.forEach(s -> System.out.println(s));
		
		palavras.forEach(System.out::println);

	}

}
