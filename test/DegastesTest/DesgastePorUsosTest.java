package DegastesTest;

import Desgastes.DesgastePorUsos;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DesgastePorUsosTest {



    @Test
    public void test01DesgastePorUsosSeCreaConDurabilidad10(){

        DesgastePorUsos desgaste = new DesgastePorUsos(10, 10);

        assertEquals(10,desgaste.durabilidad());

        assertEquals(10,10);
    }

    @Test
    public void test02DesgastePorUsosSeUsaUnaVezYNoSeDesgasta(){

        DesgastePorUsos desgaste = new DesgastePorUsos(10, 10);
        int fuerza = 12;
        
        desgaste.desgastarCon(fuerza);

        assertEquals(10,desgaste.durabilidad());


    }

    @Test
    public void test03DesgastePorUsosSeUsa9VecesYNoSeDesgasta(){

        DesgastePorUsos desgaste = new DesgastePorUsos(10, 10);
        int fuerza = 12;
        
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);

        assertEquals(10,desgaste.durabilidad());

    }

    @Test
    public void test04DesgastePorUsosSeUsa10VecesYSeDesgastoCompletamente(){

        DesgastePorUsos desgaste = new DesgastePorUsos(10, 10);
        int fuerza = 12;
        
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);
        desgaste.desgastarCon(fuerza);

        assertEquals(0,desgaste.durabilidad());

    }

}
