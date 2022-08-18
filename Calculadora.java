public class Calculadora {
    
    private double vlr1, vlr2, result;
    public double somar(double vlr1, double vlr2){
        this.vlr1 = vlr1;
        this.vlr2 = vlr2;
        result = this.vlr1 + this.vlr2;
        return result;
    }
    public double subtrair(double vlr1, double vlr2){
        this.vlr1 = vlr1;
        this.vlr2 = vlr2;
        result = this.vlr1 - this.vlr2;
        return result;
    }
    public double dividir(double vlr1, double vlr2){
        this.vlr1 = vlr1;
        this.vlr2 = vlr2;
        result = this.vlr1 / this.vlr2;
        return result;
    }
    public double multiplicar(double vlr1, double vlr2){
        this.vlr1 = vlr1;
        this.vlr2 = vlr2;
        result = this.vlr1 * this.vlr2;
        return result;
    }
}
