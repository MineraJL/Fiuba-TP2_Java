package Modelo.Herramientas;
import Modelo.Desgastes.DesgastePorUsos;
import Modelo.Desgastes.DesgasteSegunMultiplicador;
import Modelo.Excepciones.DurabilidadDesgastadaExcepcion;
import Modelo.Excepciones.HerramientaDesgastadaExcepcion;
import Modelo.Inventario.InventarioHerramienta;
import Modelo.Mapa.Ocupante;
import Modelo.Recursos.Diamante;
import Modelo.Recursos.Madera;
import Modelo.Recursos.Metal;
import Modelo.Recursos.Piedra;
import Modelo.TipoMaterial.TipoMaterial;
import Modelo.TipoMaterial.TipoMetal;
import Modelo.TipoMaterial.TipoMetalYPiedra;
import Modelo.TipoMaterial.TipoPiedra;

public class PicoFino extends Herramienta {


    public PicoFino(TipoMaterial material) {
        super(material);
        this.material.definirValores(this);
    }

    public void agregarAlInventario(InventarioHerramienta inventario) {
        inventario.agregarHerramienta(this);
    }

    // Asignar valores por material - Dispatch
    public void asignarMaterial(TipoMetalYPiedra metalYPiedra) {
        this.asignarFuerza(20);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0.1, 1000));
    }

    public void asignarMaterial(TipoPiedra piedra) {
        this.asignarFuerza(4);
        this.asignarDesgaste(new DesgasteSegunMultiplicador(0.66, 200));
    }

    public void asignarMaterial(TipoMetal metal) {
        this.asignarFuerza(12);
        this.asignarDesgaste(new DesgastePorUsos(10, 400));
    }
    // Fin Dispatch

    public void golpear(Diamante recursoDiamante) throws HerramientaDesgastadaExcepcion {
        try {
			this.desgaste.desgastarCon(this.durabilidad());
		} catch (DurabilidadDesgastadaExcepcion e) {
			throw new HerramientaDesgastadaExcepcion();
		}
        this.material.golpear(recursoDiamante, this.fuerza);
    }

    public void golpear(Madera material) {}
    public void golpear(Piedra material) {}
    public void golpear(Metal material) {}


    @Override
    public void golpear(Ocupante ocupante) throws HerramientaDesgastadaExcepcion{
        ocupante.golpeateCon(this);
    }
}