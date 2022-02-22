package systemCalculations;

import complemts.Compls;

public class CarCalculations {
	Compls cps = new Compls(null, null, null, null);
	
	public void valor() {
		
		switch(cps.getVeiculo()) {
			
			case "Sedan":
				System.out.println("Rs 15,00");
				break;
				
			case "Pickup":
				System.out.println("Rs 20,00");
				break;
				
			case "Sport":
				System.out.println("Rs 40,00");
				break;
				
			case "Trilha":
				System.out.println("Rs 30,00");
				break;
				
			case "Motocicleta":
				System.out.println("Rs 10,00");
				break;
			default:
				System.out.println("Invalido!");
			
		
		}
	
		
	}
		
}



