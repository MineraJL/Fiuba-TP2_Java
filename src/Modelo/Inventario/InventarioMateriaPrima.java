package Modelo.Inventario;

import java.util.ArrayList;
import Modelo.MateriaPrima.*;

public class InventarioMateriaPrima {
	
	//Coleccion materias primas
		protected ArrayList<MPMadera> mpMadera = 
				new ArrayList<MPMadera>();
		
		protected ArrayList<MPPiedra> mpPiedra = 
				new ArrayList<MPPiedra>();
		
		protected ArrayList<MPMetal> mpMetal =
				new ArrayList<MPMetal>();
		
		protected ArrayList<MPDiamante> mpDiamante =
				new ArrayList<MPDiamante>();
		
		
		
		public void agregarMateriaPrima(MPMadera madera) {
			mpMadera.add(madera);
		}
		
		public void agregarMateriaPrima(MPPiedra piedra) {
			mpPiedra.add(piedra);
		}
		
		public void agregarMateriaPrima(MPMetal metal) {
			mpMetal.add(metal);
		}
		
		public void agregarMateriaPrima(MPDiamante diamante) {
			mpDiamante.add(diamante);
		}
		
		public MPMadera extraerMadera() {
			MPMadera madera = mpMadera.get(0);
			mpMadera.remove(0);
			
			return madera;
		}
		
		public MPPiedra extraerPiedra() {
			MPPiedra piedra = mpPiedra.get(0);
			mpPiedra.remove(0);
			
			return piedra;
		}
		
		public MPMetal extraerMetal() {
			MPMetal metal = mpMetal.get(0);
			mpMetal.remove(0);
			
			return metal;
		}
		
		public MPDiamante extraerDiamante() {
			MPDiamante diamante = mpDiamante.get(0);
			mpDiamante.remove(0);
			
			return diamante;
		}

}
