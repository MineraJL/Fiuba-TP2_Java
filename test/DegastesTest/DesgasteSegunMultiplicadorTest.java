package DegastesTest;

import org.junit.Test;
import Modelo.Desgastes.*;
import Modelo.Excepciones.DurabilidadDesgastadaExcepcion;

import static junit.framework.TestCase.assertEquals;

public class DesgasteSegunMultiplicadorTest {

    @Test
    public void test01DesgasteSegunMultiplicadorSeDesgastaEnLaCantidadRecibidaMultiplicadaPorElMultiplicadorConQueSeCrea() throws DurabilidadDesgastadaExcepcion{
 
        int durabilidadInicial = 10;
        DesgasteSegunMultiplicador desgaste = new DesgasteSegunMultiplicador(1,durabilidadInicial);
        desgaste.desgastarCon(1);

        assertEquals(durabilidadInicial-1,desgaste.durabilidad());    
    }
 
    @Test
    public void test02DesgasteSegunMultiplicadorSeDesgastaEnLaCantidadRecibidaMultiplicadaPorElMultiplicadorConQueSeCrea() throws DurabilidadDesgastadaExcepcion{

        int durabilidadInicial = 10;
        DesgasteSegunMultiplicador desgaste = new DesgasteSegunMultiplicador(1,durabilidadInicial);
        desgaste.desgastarCon(2);

        assertEquals(durabilidadInicial-2,desgaste.durabilidad());

    }

    @Test
    public void test03DesgasteSegunMultiplicadorSeDesgastaEnLaCantidadRecibidaMultiplicadaPorElMultiplicadorConQueSeCrea() throws DurabilidadDesgastadaExcepcion{

        int durabilidadInicial = 10;
        DesgasteSegunMultiplicador desgaste = new DesgasteSegunMultiplicador(2,durabilidadInicial);
        desgaste.desgastarCon(1);

        assertEquals(durabilidadInicial-2,desgaste.durabilidad());

    }
    
    @Test (expected = DurabilidadDesgastadaExcepcion.class)
    public void test04DesgasteSegunMultiplicadorSeUsaIndiscriminadamenteHastaDesgastarTotalmente() throws DurabilidadDesgastadaExcepcion{
        int durabilidadInicial = 10;
        DesgasteSegunMultiplicador desgaste = new DesgasteSegunMultiplicador(2,durabilidadInicial);

        
        while(true) {
            desgaste.desgastarCon(1);;
        }

    }

}
