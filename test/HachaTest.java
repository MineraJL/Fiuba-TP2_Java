import Herramientas.Hacha;
import Herramientas.Herramienta;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Material;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HachaTest {

    @Test
    public void testHachaDeMaderaSeCreaConDurabilidadYFuerzaCorrespondiente(){
        Madera material = new Madera(10) ;
        Herramienta herramienta = new Hacha(2,material);
        assertEquals(100, herramienta.durabilidad());

    }


    @Test
    public void testHachaDeMaderaSeUsaContraMaterialMaderaYSeReduceSuDurabilidad(){
        Madera material = new Madera(10) ;
        Herramienta herramienta = new Hacha(2,material);
        herramienta.golpear(material);
        assertEquals(98, herramienta.durabilidad());
    }
}
