package validarIdadePorVotacao_DDT;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadeParaVotacao_DDT {

	String nome;
	int anoDeNascimento;
	String resultado;
	
	public ValidarIdadeParaVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
	}
	
	@Test
	public void validaObrigatoriedadeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	 
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"Maria"  , 2003, "Maria voce nao pode votar"},//15
			{"Rodrigo", 2001, "Rodrigo seu voto e facultativo"},//17
			{"João"   , 2000, "João seu voto e obrigatorio"},//18
			{"Carla"  , 1999, "Carla seu voto e obrigatorio"},//19
			{"José"   , 1992, "José seu voto e obrigatorio"},//26
			{"Ana"    , 1947, "Ana seu voto e facultativo"},//71
			{"Pedro"  , 1946, "Pedro seu voto e facultativo"}//70
		});
	}
	
}