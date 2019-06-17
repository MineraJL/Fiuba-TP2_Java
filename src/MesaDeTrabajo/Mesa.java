package MesaDeTrabajo;

import Herramientas.Hacha;
import MateriaPrima.MPMadera;
import MateriaPrima.MPVacio;
import MateriaPrima.MateriaPrima;
import TipoMaterial.TipoMadera;

public class Mesa {

    public Mesa(){
    }

    public MateriaPrima[][] obtenerDisposicionCorrectaHachaDeMadera(){

        MateriaPrima[][] disposicion = new MateriaPrima[3][3];

        MPMadera maderita = new MPMadera();
        MPVacio vacio = new MPVacio();

        disposicion[0][0]=maderita;
        disposicion[0][1]=maderita;
        disposicion[0][2]=vacio;

        disposicion[1][0]=maderita;
        disposicion[1][1]=maderita;
        disposicion[1][2]=vacio;

        disposicion[2][1]=vacio;
        disposicion[2][1]=maderita;
        disposicion[2][2]=vacio;

        return disposicion;
    }

    public Hacha construiHerramienta(MateriaPrima[][] disposicionRecibida){
        // if(disposicionRecibida.equals(obtenerDisposicionCorrectaHachaDeMadera()))
            // en el futuro en vez de usar ese metodo obtenerDisp..., se itera una coleccion "disposicionesCorrectas"
            // obs: que devolvemos si no coincide ?
            // tal vez deberia delegarse algo aca..., a la disposicion, que deberia ser una clase que haga equals para cada elemento
                    // igual el problema persiste...
        return new Hacha(new TipoMadera());

    }

}