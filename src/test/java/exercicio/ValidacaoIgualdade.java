package exercicio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValidacaoIgualdade {
	@Test
	public void validacaoIgualdade_Sucesso(){
		String resultadoObtido = "Registro salvo com sucesso!";
		assertEquals("Registro salvo com sucesso!", resultadoObtido);
	}
	
	@Test
	public void validacaoIgualdade_Falha(){
		String resultadoObtido = "Registro excluido com sucesso!";
		assertEquals("Registro salvo com sucesso!", resultadoObtido);
	}
}