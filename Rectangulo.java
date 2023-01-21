public class Rectangulo extends Figura {
    private double ladoIzquierdo;
    private double ladoAlto;
    private double ladoDerecho;
    private double ladoBajo;

    public Rectangulo(String nombreDeFigura, String color, double ladoIzquierdo, double ladoAlto, double ladoDerecho, double ladoBajo) {
        super(nombreDeFigura, color, ladoIzquierdo + ladoAlto + ladoDerecho + ladoBajo, ladoIzquierdo * ladoAlto);
        this.ladoIzquierdo = ladoIzquierdo;
        this.ladoAlto = ladoAlto;
        this.ladoDerecho = ladoDerecho;
        this.ladoBajo = ladoBajo;
        
    }

    public boolean comprobarCuadrado(Rectangulo rec){
        if(rec.getLadoIzquierdo() == rec.getLadoAlto() && rec.getLadoAlto() == rec.getLadoDerecho() && rec.getLadoDerecho() == rec.getLadoBajo()){
            return true;
        }
        else{
            return false;
        }
    }

    public double getLadoIzquierdo() {
        return ladoIzquierdo;
    }

    public void setLadoIzquierdo(double ladoIzquierdo) {
        this.ladoIzquierdo = ladoIzquierdo;
    }

    public double getLadoAlto() {
        return ladoAlto;
    }

    public void setLadoAlto(double ladoAlto) {
        this.ladoAlto = ladoAlto;
    }

    public double getLadoDerecho() {
        return ladoDerecho;
    }

    public void setLadoDerecho(double ladoDerecho) {
        this.ladoDerecho = ladoDerecho;
    }

    public double getLadoBajo() {
        return ladoBajo;
    }

    public void setLadoBajo(double ladoBajo) {
        this.ladoBajo = ladoBajo;
    }
    
}
