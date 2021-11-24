package org.generation.italy;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CalcolaValutazione[] arrayValutazioni = new CalcolaValutazione[20];
		Random r = new Random();
		for (int i=0; i<arrayValutazioni.length; i++) {
			int assenze = r.nextInt(100);
			float mediaVoti = (r.nextFloat() * 5);
			arrayValutazioni[i] = new CalcolaValutazione(i+1, assenze, mediaVoti);
			
//			System.out.printf("%d  %.2f\n",assenze, mediaVoti);
			System.out.printf("Id: %2d   Valutazione: ", (i+1)  );
			
			if (arrayValutazioni[i].Valutazione()) {
				System.out.println("Promosso");
			}else {
				System.out.println("Bocciato");
			}
		}
	}

}
