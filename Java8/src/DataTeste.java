import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataTeste {

	public static void main(String[] args) {

		/*Obter a data de hoje*/
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		/*Definir data*/		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		System.out.println(olimpiadasRio);
		
		/*Diferença de ano entre datas*/
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		/*Diferença entre datas de maneira ampla*/
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		/*Decremento e incremento de datas*/
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2));

		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		/*Formatar datas*/
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		LocalDate data1 = LocalDate.of(2099, 1, 25);
		System.out.println(data1);
		
		//Diferença entre datas
		Period periodo1 = Period.between(hoje, data1);
		System.out.println(periodo1);
		
		//Pesquise a respeito da classe Duration caso queira trabalhar com intervalo de horas.
		
		DateTimeFormatter formatadorBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatadorBr));
		
	}

}
