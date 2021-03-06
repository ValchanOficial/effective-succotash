package validacoesFluentes;

import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class ValidacoesFluentes {

	@Test
	public void validacaoEqualsTo(){
		String produto="TV 40 polegadas";
		assertThat(produto,equalTo("TV 40 polegadas"));
	}

	@Test
	public void validacaoIs(){
		int codigo = 50;
		assertThat(codigo,is(50));
	}

	@Test
	public void validacaoAnyOf(){
		String resultadoObtido="A cor selecionada foi vermelha.";
		assertThat(resultadoObtido,anyOf(containsString("vermelha"),containsString("vermelho")));
	}

	@Test
	public void validacaoHasItem(){
		List<String>listaProdutos=new ArrayList<String>();
		listaProdutos.add("iPhone 8 Plus 64G");
		listaProdutos.add("Adaptador USB-C VGA");
		listaProdutos.add("Apple TV 4 gera��o");
		assertThat(listaProdutos,hasItem("Adaptador USB-C VGA"));
	}
}
