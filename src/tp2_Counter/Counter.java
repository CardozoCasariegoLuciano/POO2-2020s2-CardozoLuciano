package tp2_Counter;

import java.util.ArrayList;

public class Counter {

	//Variables
	private ArrayList<Integer> listaDeNumeros;	
	
	//coinstructor
	public Counter() {		
		this.listaDeNumeros = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getListaDeNumeros() {
		
		return this.listaDeNumeros;
	}


	//metodos
	public void addNumber(int i) {
	
		this.listaDeNumeros.add(i);
	}

	public int cantidadDePares() { 
		
		int cont = 0;		
		for(int unNum:listaDeNumeros){			
			if((unNum % 2) == 0) {				
				cont ++;
			}
		}		
		return cont;
	}
	
	
	public int cantidadDeImares() {
		
		int cont = 0;
		
		for(int unNum:this.listaDeNumeros){
			
			if((unNum % 2) == 1) {
				
				cont ++;
			}
		}
		
		return cont;
	}
	
	
	public int multiplosDe(int unNumero) { 
		
		int cont = 0;
		
		for(int elem:this.listaDeNumeros) {
			
			if((elem % unNumero) == 0) {
				
				cont ++;
			}
		}
		
		return cont;
	}

	

}
