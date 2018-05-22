package testeCategorizado;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import categorias.Positivos;
import categorias.Smoke;

public class TesteCategorizado {
	
	@Test
	@Category(Smoke.class)//importantes
	public void test1() {
		
	}
	@Test
	@Category(Positivos.class)//positivos
	public void test2() {
		
	}
	@Test
	public void test3() {
		
	}
}
