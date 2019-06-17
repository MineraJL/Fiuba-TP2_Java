package MateriaPrima;

public class MPVacio extends MateriaPrima {

    public MPVacio(){}

    public Boolean equals(MateriaPrima otraMateriaPrima){
        return (this.getClass().equals(otraMateriaPrima.getClass()));
    }
}
