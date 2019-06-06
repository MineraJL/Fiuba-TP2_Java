public class Material {
    private int durabilidad;
    public Material(int durabilidadInicial) {
        this.durabilidad = durabilidadInicial;
    }

    public int durabilidad(){
        return this.durabilidad;
    }

    public void reducirDurabilidadEn(int cantidadAReducir) {
        this.durabilidad = this.durabilidad - cantidadAReducir;
    }
}