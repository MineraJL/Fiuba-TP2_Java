import Materiales.Madera;
import Materiales.Material;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DesgasteSegunMultiplicadorTest {
    @Test
    public void testDesgasteSegunMultiplicadorDesgastaAlMaterialRecibidoEnLaCantidadQueSeLePasaMultiplicadaPorElMultiplicadorConQueSeCrea(){

        Material material = new Madera(50);
        int durabilidadInicial = material.durabilidad();

        DesgasteSegunMultiplicador desgaste = new DesgasteSegunMultiplicador(1);
        desgaste.desgastarCon(1,material);

        assertEquals(durabilidadInicial-1,material.durabilidad());

    }

}