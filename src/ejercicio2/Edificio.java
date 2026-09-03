package ejercicio2;

public abstract class Edificio {

    private double superficieEdificio;

    public Edificio(double superficieEdificio) {
        this.superficieEdificio = superficieEdificio;
    }

    public double getSuperficieEdificio() {
        return superficieEdificio;
    }

    public void setSuperficieEdificio(double superficieEdificio) {
        this.superficieEdificio = superficieEdificio;
    }

}