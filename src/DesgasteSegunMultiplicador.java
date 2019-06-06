public class DesgasteSegunMultiplicador {

    private int multiplicador;

    public DesgasteSegunMultiplicador(int multiplicadorInicial){
        this.multiplicador = multiplicadorInicial;
    }

    public void desgastarCon(int cantidad, Material material){
        material.reducirDurabilidadEn(cantidad);
    }
}
