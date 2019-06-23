package Inventario;

import java.util.ArrayList;
import MateriaPrima.*;

public class InventarioMateriaPrima {
	
	//Coleccion materias primas
		protected ArrayList<MateriaPrima> mpMadera = 
				new ArrayList<MateriaPrima>();
		
		protected ArrayList<MateriaPrima> mpPiedra = 
				new ArrayList<MateriaPrima>();
		
		protected ArrayList<MateriaPrima> mpMetal =
				new ArrayList<MateriaPrima>();
		
		protected ArrayList<MateriaPrima> mpDiamante =
				new ArrayList<MateriaPrima>();
		
		
		
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

}
