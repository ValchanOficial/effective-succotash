package validarIdadePorVotacao_Parametros;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import votacao.Votacao;

	@RunWith(Parameterized.class)
	public class ValidarIdadePorVotacao_Parametros {

		@Parameter(0) public String nome;
		@Parameter(1) public int anoDeNascimento;
		@Parameter(2) public String resultado;
		
		@Test
		public void validaObrigatoriedadeVoto() {
			assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
		}
		 
		@Parameters(name = "{0}|{1}|{2}")
		public static Collection<Object[]> data() {
			return Arrays.asList(new Object[][] {
				{"Maria"  , 2003, "Maria você não pode votar"},//15
				{"Rodrigo", 2001, "Rodrigo seu voto é facultativo"},//17
				{"João"   , 2000, "João seu voto é obrigatório"},//18
				{"Carla"  , 1999, "Carla seu voto é obrigatório"},//19
				{"José"   , 1992, "José seu voto é obrigatório"},//26
				{"Ana"    , 1947, "Ana seu voto é facultativo"},//71
				{"Pedro"  , 1946, "Pedro seu voto é facultativo"}//70
			});
		}
		
	}