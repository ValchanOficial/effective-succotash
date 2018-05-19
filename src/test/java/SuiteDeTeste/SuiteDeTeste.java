package SuiteDeTeste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import exercicio.Teste;
import exercicio.ValidacaoIgualdade;
import exercicio.ValidacaoVedadeiroFalso;
import exercicio.PreEPosCondicoesDeTeste;

@RunWith(Suite.class)
@SuiteClasses({
	Teste.class,
	ValidacaoIgualdade.class,
	ValidacaoVedadeiroFalso.class,
	PreEPosCondicoesDeTeste.class
})
public class SuiteDeTeste {

}
