import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CursoStreamTeste2 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		//Ordenação de cursos por quantidade 
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(System.out::println);
		
		//Filtrando cursos com mais de 50 alunos
		//cursos.stream()
			//.filter(c -> c.getAlunos() > 50)
			//.forEach(System.out::println);
		
		//Utilizando o método Map
		Stream<Curso> stream = cursos.stream();
		Stream<String> nomes = stream.map(Curso::getNome);
		nomes.forEach(System.out::println);

	}

}
