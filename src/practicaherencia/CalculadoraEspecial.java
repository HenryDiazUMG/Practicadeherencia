
package practicaherencia;

public class CalculadoraEspecial extends Calculadora {
    public String tipoCalculadora;
    
    public CalculadoraEspecial(String tipoCalculadora) {
        this.tipoCalculadora = "Calculadora Especial";
    }

    
    public CalculadoraEspecial() {
    }

    // Aquí agregué los 6 nuevos métodos para la calculadora
    
    //Primer método nuevo "Raíz Cúbica"
    public double raizCubica(double numero){
        return Math.cbrt(numero);
    }
  
    //Segundo método nuevo "Función Seno"
    public double seno(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.sin(radianes);
    }
    
    //Tercer método nuevo "Función Coseno"
    public double coseno(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.cos(radianes);
    }

    //Cuarto método nuevo "Función Tangente"
    public double tangente(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.tan(radianes);
    }
    
    //Quinto método nuevo "Logaritmo"
    public double logaritmo(double numero, double base) {
        return Math.log(numero) / Math.log(base);
    }
    
    //Sexto método nuevo "Potencia"
    public double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}