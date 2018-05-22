package ignorarTestes;

import org.junit.Test;
import org.junit.Ignore;

public class IgnorarTestes {

	@Test
	public void test1() {
		
	}
	
	@Test
	@Ignore
	public void testIgnorado() {
		
	}
	
	@Test
	@Ignore(value="teste ignorado pelo motivo x")
	public void testIgnoradoComMotivo() {
		
	}
}