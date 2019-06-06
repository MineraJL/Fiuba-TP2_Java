public class Madera extends Material {


    public Madera(int durabilidadInicial) {
        super(durabilidadInicial);
    }

    @Override
    public void recibirGolpeDe(Hacha hacha) {
        this.durabilidad = this.durabilidad - hacha.Fuerza();
    }
}