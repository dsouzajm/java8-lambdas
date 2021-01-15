import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CursoStreamTeste {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		Stream<Curso> streamCurso = cursos.stream();
//		streamCurso
//			.filter(c -> c.getAlunos() > 100)
//			.forEach(c -> System.out.println("Nome do curso " + c.getNome() + ", qtde de cursos: " + c.getAlunos()));

//		streamCurso
//		   .filter(c -> c.getAlunos() > 100)
//		   .map(c -> c.getAlunos())
//		   .forEach(qtdeAlunos -> System.out.println(qtdeAlunos));
		
		/* Stream com reference method
		streamCurso
		   .filter(c -> c.getAlunos() > 100)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);*/		
		
		
		int soma = streamCurso
			.filter(c -> c.getAlunos() > 100)
			.mapToInt(Curso::getAlunos)
			.sum();
			
		System.out.println("Soma total de qtde alunos: " + soma);
			
	}

}
