package JugadorTest;

import Herramientas.*;
import Jugador.*;
import TipoMaterial.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InventarioTest {
	@Test
	public void testInventarioSeCreaElMismoYSeLeAgregaUnaHachaDeMadera() {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		Inventario unInventario = new Inventario(unHacha);
		
		assertEquals(1, unInventario.cantidadHerramientas());
	}
	
	@Test
	public void testInventarioSeSeLeAgregaDosHerramientas() {
		TipoMadera madera = new TipoMadera();
		Hacha unHacha = new Hacha(madera);
		Pico unPico = new Pico(madera);
		Inventario unInventario = new Inventario(unHacha);
		
		unInventario.agregarHerramienta(unPico);
		
		assertEquals(2, unInventario.cantidadHerramientas());
	}

}
