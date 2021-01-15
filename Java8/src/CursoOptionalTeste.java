import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CursoOptionalTeste {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		//Find Any
		/*Optional<Curso> cursosOpcionais = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .findAny();*/
		
		//Or Else
		/*Curso orElse = cursosOpcionais.orElse(new Curso("Teste", 12));
		System.out.println(orElse);*/
		
		//Optional com tratamento de exceção
		/*cursos.stream()
		   .filter(c -> c.getAlunos() > 300)
		   .findAny()
		   .ifPresent(c -> System.out.println(c.getNome()));*/
		
		
		/* Trabalhando com lists
		 * List<Curso> resultados = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toList());
		
		resultados.forEach(System.out::println);*/
		
		/* Trabalhando com mapas
		 * Map mapa = cursos.stream() 
				.filter(c -> c.getAlunos() > 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));*/
		
		//Trabalhando com optional findFirst
		/*cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.findFirst()
			.ifPresent(System.out::println);;*/
		
		//Calculando média de quantidade de alunos
		OptionalDouble media = cursos
			.stream()
			.mapToInt(c -> c.getAlunos())
			.average();
		
		System.out.println(" Média de alunos entre os cursos " + media);	
		
	}

}
