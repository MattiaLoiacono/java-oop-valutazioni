package org.generation.italy;

public class CalcolaValutazione {
	int id, assenze;
	float mediaVoti;
	
	CalcolaValutazione(int id, int assenze, float mediaVoti) {
		this.id = id;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
		
	}
	
	boolean Valutazione () {
		boolean promosso = false;
		
		if (assenze < 25 && mediaVoti >= 2) {
			promosso=true;
		}else if (assenze <= 50 && mediaVoti > 2){
			promosso=true;
		}
		return promosso;
	}
}
