package FabricasTest;

import Modelo.Fabricas.FabricaTipoMaterial;
import Modelo.Mapa.Ocupante;
import Modelo.MateriaPrima.*;
import Modelo.TipoMaterial.*;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FabricaTipoMaterialTest {
    @Test
    public void test01CreacionTipoMadera() {
        FabricaTipoMaterial fabricaMaterial = new FabricaTipoMaterial();
        ArrayList<Ocupante> trozosDeHerramienta = new ArrayList<Ocupante>();
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        TipoMaterial materialCreado = fabricaMaterial.fabricarMaterial(trozosDeHerramienta);

        assertEquals(new TipoMadera(),materialCreado);
    }

    @Test
    public void test02CreacionTipoMetal() {
        FabricaTipoMaterial fabricaMaterial = new FabricaTipoMaterial();
        ArrayList<Ocupante> trozosDeHerramienta = new ArrayList<Ocupante>();
        trozosDeHerramienta.add(new MPMetal());
        trozosDeHerramienta.add(new MPMetal());
        trozosDeHerramienta.add(new MPMetal());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        TipoMaterial materialCreado = fabricaMaterial.fabricarMaterial(trozosDeHerramienta);

        assertEquals(new TipoMetal(),materialCreado);
    }


    @Test
    public void test03CreacionTipoPiedra() {
        FabricaTipoMaterial fabricaMaterial = new FabricaTipoMaterial();
        ArrayList<Ocupante> trozosDeHerramienta = new ArrayList<Ocupante>();
        trozosDeHerramienta.add(new MPPiedra());
        trozosDeHerramienta.add(new MPPiedra());
        trozosDeHerramienta.add(new MPPiedra());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        TipoMaterial materialCreado = fabricaMaterial.fabricarMaterial(trozosDeHerramienta);

        assertEquals(new TipoPiedra(),materialCreado);
    }

    @Test
    public void test04CreacionTipoMetalYPiedra() {
        FabricaTipoMaterial fabricaMaterial = new FabricaTipoMaterial();
        ArrayList<Ocupante> trozosDeHerramienta = new ArrayList<Ocupante>();
        trozosDeHerramienta.add(new MPMetal());
        trozosDeHerramienta.add(new MPMetal());
        trozosDeHerramienta.add(new MPMetal());
        trozosDeHerramienta.add(new MPPiedra());
        trozosDeHerramienta.add(new MPMadera());
        trozosDeHerramienta.add(new MPMadera());
        TipoMaterial materialCreado = fabricaMaterial.fabricarMaterial(trozosDeHerramienta);

        assertEquals(new TipoMetalYPiedra(),materialCreado);
    }
}
