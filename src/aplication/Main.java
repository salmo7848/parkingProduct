package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import complemts.Compls;
import convertsDate.Conversion;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		

		Conversion conn = new Conversion();
		
		System.out.println("informe a hora de entrada");
			String entrada = sc.nextLine();
			Date ent = sdf2.parse(entrada);
			Calendar calendar = conn.dateToCalendar(ent);
			//System.out.println(calendar.getTime());
			
		System.out.println("Veiculo: ");
			String veic = sc.nextLine();
		System.out.println("Placa: ");
			String plac = sc.nextLine();
		
		
		System.out.println("Hora de saida: ");
			String saida = sc.nextLine();
			Date sa = sdf2.parse(saida);
			Calendar calendar1 = conn.dateToCalendar(sa);
			
		Compls dados = new Compls(calendar, veic, plac, calendar1);
					
		System.out.println(dados);
		
		
		
			
		/*
		 * Possível alteração na linha que gere a saida do veiculo
		 * System.out.println("Hora de saida:"+sdf2.format(new Date()));
		 */
			
		sc.close();

	}
	
	

}
