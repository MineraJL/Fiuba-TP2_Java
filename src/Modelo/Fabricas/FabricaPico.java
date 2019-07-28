package Modelo.Fabricas;

import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.HerramientaInexistente;
import Modelo.Herramientas.Pico;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.Posicion;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMaterial;

import java.util.ArrayList;
import java.util.List;

public class FabricaPico extends FabricaHerramienta {

    public FabricaPico(){
            this.modeloForma = new ArrayList<Posicion>();
            this.modeloFondo = new ArrayList<Posicion>();
            this.generarForma();
        }

        private void generarForma(){
            this.modeloForma.add(new Posicion(0,0));
            this.modeloForma.add(new Posicion(0,1));
            this.modeloForma.add(new Posicion(0,2));
            this.modeloForma.add(new Posicion(1,1));
            this.modeloForma.add(new Posicion(2,1));
            
            this.modeloFondo.add(new Posicion(1,0));
            this.modeloFondo.add(new Posicion(1,2));
            this.modeloFondo.add(new Posicion(2,0));
            this.modeloFondo.add(new Posicion(2,2));
        }

        @Override
        public Herramienta fabricarHerramienta(Mesa mesaDeTrabajo){
            Herramienta herramientaCreada = new HerramientaInexistente();
            FabricaTipoMaterial fabricaTipoMaterial = new FabricaTipoMaterial();
            if (formaEsCorrecta(mesaDeTrabajo)){
                TipoMaterial tipoMaterial = fabricaTipoMaterial.fabricarMaterial(this.obtenerElementosComponentes(mesaDeTrabajo));
                herramientaCreada = new Pico(tipoMaterial);
            }
            return herramientaCreada;
        }

        private List<Ocupante> obtenerElementosComponentes(Mesa mesa){
            return mesa.obtenerItemsEn(this.modeloForma);
        }
}
