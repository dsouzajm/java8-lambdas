import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class CursoTeste {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		/*
		 * Classe anônima
		cursos.sort(new Comparator<Curso>() {

			@Override
			public int compare(Curso curso1, Curso curso2) {
				if (curso1.getAlunos() > curso2.getAlunos())
					return -1;
				else if (curso1.getAlunos() < curso2.getAlunos())
					return 1;
				else
					return 0;
			}

		});

		cursos.forEach(new Consumer<Curso>() {

			@Override
			public void accept(Curso curso) {
				System.out.println("Nome do curso: " + curso.getNome() + ", qtde de alunos: " + curso.getAlunos());
			}

		});*/
		
		/* Lambda
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.forEach(c -> System.out.println("Nome do curso: " + c.getNome() + ", qtde de alunos: " + c.getAlunos()));
		*/
		
		/* Reference method*/
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(System.out::println);		
		
	}

}
