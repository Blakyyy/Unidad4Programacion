public abstract class Figura {
    protected String nombreDeFigura;
    protected String color;
    protected double perimetro;
    protected double area;
    
    public Figura(String nombreDeFigura, String color, double perimetro, double area) {
        this.nombreDeFigura = nombreDeFigura;
        this.color = color;
        this.perimetro = perimetro;
        this.area = area;
    }

    public String getNombreDeFigura() {
        return nombreDeFigura;
    }

    public void setNombreDeFigura(String nombreDeFigura) {
        this.nombreDeFigura = nombreDeFigura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
}
