package Modelo.Fabricas;

import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.HerramientaInexistente;
import Modelo.Herramientas.Pico;
import Modelo.Mapa.Ocupante;
import Modelo.Mapa.PosicionEnlazada;
import Modelo.MesaDeTrabajo.Mesa;
import Modelo.TipoMaterial.TipoMaterial;

import java.util.ArrayList;
import java.util.List;

public class FabricaPico extends FabricaHerramienta {

    public FabricaPico(){
            this.modeloForma = new ArrayList<PosicionEnlazada>();
            this.modeloFondo = new ArrayList<PosicionEnlazada>();
            this.generarForma();
        }

        private void generarForma(){
            this.modeloForma.add(new PosicionEnlazada(0,0));
            this.modeloForma.add(new PosicionEnlazada(0,1));
            this.modeloForma.add(new PosicionEnlazada(0,2));
            this.modeloForma.add(new PosicionEnlazada(1,1));
            this.modeloForma.add(new PosicionEnlazada(2,1));
            
            this.modeloFondo.add(new PosicionEnlazada(1,0));
            this.modeloFondo.add(new PosicionEnlazada(1,2));
            this.modeloFondo.add(new PosicionEnlazada(2,0));
            this.modeloFondo.add(new PosicionEnlazada(2,2));
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
            return mesa.obtenerOcupantesEn(this.modeloForma);
        }
}
