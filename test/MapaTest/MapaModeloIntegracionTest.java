package MapaTest;

import Modelo.Mapa.Mapa;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.Modelo;
import Modelo.Recursos.Madera;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MapaModeloIntegracionTest {

    // Metodo para vista
    @Test
    public void testMetodoOcupanteDevuelveElOcupantePedido(){
        Mapa mapa = new Mapa(5,5);
        PosicionEnlazada posicionMadera = new PosicionEnlazada(2,3);
        Madera madera = new Madera();

        madera.ingresar(mapa,posicionMadera);

        Ocupante maderaEnMapa = mapa.ocupante(posicionMadera);

        assertEquals(madera,maderaEnMapa);
    }

    ///////////////////////////
    ///////// Modelo //////////
    ///////////////////////////

    @Test
    public void testModeloMapaSeCreaCon60FilasY80Columnas(){
        Modelo modelo = new Modelo();
        Assert.assertEquals(15,modelo.cantFilasMapa());
        Assert.assertEquals(16,modelo.cantColumnasMapa());
    }




}
