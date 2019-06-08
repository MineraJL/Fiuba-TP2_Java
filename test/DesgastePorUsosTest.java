import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DesgastePorUsosTest {

    @Test
    public void test01DesgastePorUsosSeCreaConDurabilidad10(){


        DesgastePorUsos desgaste = new DesgastePorUsos(10);

        assertEquals(10,desgaste.durabilidad());


    }

    @Test
    public void test02DesgastePorUsosSeUsaUnaVezYNoSeDesgasta(){


        DesgastePorUsos desgaste = new DesgastePorUsos(10);
        desgaste.desgastar();

        assertEquals(10,desgaste.durabilidad());


    }

    @Test
    public void test03DesgastePorUsosSeUsa9VecesYNoSeDesgasta(){


        DesgastePorUsos desgaste = new DesgastePorUsos(10);
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();

        assertEquals(10,desgaste.durabilidad());

    }

    @Test
    public void test04DesgastePorUsosSeUsa10VecesYSeDesgastoCompletamente(){

        DesgastePorUsos desgaste = new DesgastePorUsos(10);
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();

        assertEquals(0,desgaste.durabilidad());

    }


}
