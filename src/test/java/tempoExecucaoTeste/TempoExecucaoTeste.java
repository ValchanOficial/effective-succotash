package tempoExecucaoTeste;

import static org.junit.Assert.*;
import org.junit.Test;

public class TempoExecucaoTeste {

	@Test(timeout=1000)//1s
	public void naoPassaPeloTimeout() {
		assertTrue(true);
	}
	
	@Test(timeout=1000)//1s
	public void apresentaErroTimeout() throws InterruptedException {
		Thread.sleep(1001);//erro
	}
}