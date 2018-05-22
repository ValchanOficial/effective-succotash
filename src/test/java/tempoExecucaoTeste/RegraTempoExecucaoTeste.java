package tempoExecucaoTeste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RegraTempoExecucaoTeste {

	@Rule public Timeout timeoutGlobal = Timeout.seconds(1);//regra global
	
	@Test
	public void falhaPorTimeout() throws InterruptedException {
		Thread.sleep(1001);//erro intencional
	}
}