package tp2_CounterTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp2_Counter.Counter;

class CounterTestCase {
	
	Counter contador;
	
	@BeforeEach
	public void setUp() {
		contador = new Counter();
		
		contador.addNumber(2);
		contador.addNumber(5);
		contador.addNumber(2);
		contador.addNumber(5);
		contador.addNumber(98);
		contador.addNumber(0);
		contador.addNumber(4);
		contador.addNumber(7);
		contador.addNumber(1);
		contador.addNumber(8);
		
	}
	
	@Test
	void unContadorSabeLaCantidadDeElementosQueTiene() {
		
		assertEquals(10, contador.getListaDeNumeros().size());
	}

}
