public class Triangulo extends Figura {

    private double lado1;
    private double lado2;
    private double base;
    private double altura;
    
    public Triangulo(String nombreDeFigura, String color, double lado1, double lado2, double base, double altura) {
        super(nombreDeFigura, color, lado1 + lado2 + base, base * altura / 2);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
        
    }

    public void dimeCaracteristicas(Triangulo tri) {
        if(getTipoTriangulo(tri).equals("equilátero")){
            System.out.println("Cada lado de este triangulo mide " + tri.getBase() + " Su area es: " + tri.getArea() + " Su perimetro es:  " + tri.getPerimetro() + " El tipo de triangulo es: " + getTipoTriangulo(tri));
        }
        else if(getTipoTriangulo(tri).equals("isósceles")){
            System.out.println("El lado1 y el lado 2 miden: " + tri.getLado1() + " La base mide: " + tri.getBase() + " Su area es: " + tri.getArea() + " Su perimetro es: " + tri.getPerimetro() + "El tipo de triangulo es: " + getTipoTriangulo(tri));
        }
        else{
            System.out.println("El lado1 mide: " + tri.getLado1() + " El lado2 mide: " + tri.getLado2() + " La base mide: " + tri.getBase() + " Su area es: " + tri.getArea() + " Su perimetro es: " + tri.getPerimetro() + "El tipo de triangulo es: " + getTipoTriangulo(tri));
        }
    }

    public static String getTipoTriangulo(Triangulo tri){
        if(tri.getLado1() == tri.getLado2() && tri.getLado2() == tri.getBase()){
            return "equilátero";
        }
        else if(tri.getLado1() == tri.getLado2()){
            return "isósceles";
        }
        else{
            return "escaleno";
        }
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
}
