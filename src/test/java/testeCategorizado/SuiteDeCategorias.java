package testeCategorizado;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import categorias.Positivos;

@RunWith(Categories.class)
@IncludeCategory(Positivos.class)
@SuiteClasses({
	TesteCategorizado.class
})
public class SuiteDeCategorias {

}
