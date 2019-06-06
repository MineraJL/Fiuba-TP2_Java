import Materiales.Material;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaterialTest {
    @Test
    public void testMaterialSeCreaConLaDurabilidadIndicada(){
            Material materialTest =  new Material(9);
            assertEquals(9, materialTest.durabilidad());

    }

    @Test
    public void testMaterialReduceSuDurabilidadEn4(){
        Material materialTest =  new Material(9);
        materialTest.reducirDurabilidadEn(4);
        assertEquals(5, materialTest.durabilidad());
    }

}