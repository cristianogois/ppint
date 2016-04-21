
// Formatando datas e horas com o caractere de conversão t e T.
import java.util.Calendar;

public class DateTimeTest {
	public static void main(String args[]) {
		// obtém a data e hora atual
		Calendar dateTime = Calendar.getInstance();
		// imprimindo com caracteres de conversão para composições de data/hora
		System.out.printf("%tc\n", dateTime);
		System.out.printf("%tF\n", dateTime);
		System.out.printf("%tD\n", dateTime);
		System.out.printf("%tr\n", dateTime);
		System.out.printf("%tT\n", dateTime);

		// imprimindo com caracteres de conversão para data
		System.out.printf("%1$tA, %1$tB %1$td, %1$tY\n", dateTime);
		System.out.printf("%1$TA, %1$TB %1$Td, %1$TY\n", dateTime);
		System.out.printf("%1$ta, %1$tb %1$te, %1$ty\n", dateTime);
		// imprimindo com caracteres de conversão para hora
		System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);
		System.out.printf("%1$tZ %1$tI:%1$tM:%1$tS %tp", dateTime);
	} // fim de main
} // fim da classe DateTimeTest