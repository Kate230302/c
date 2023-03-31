package Tarea2;

//Se crea la clase de deducciones voluntarias heredada de la clase cSalario 
public class cSalario_Deducciones_Voluntarias extends cSalario { 

//Se declaran los atributos
    private int asocia;
    private int coope;
    private double ahorro;
    private double otros;

    //Se crea el constructor sin parámetros para llamar al constructor padre               
    public cSalario_Deducciones_Voluntarias() {
        super();
        this.asocia = 0;
        this.coope = 0;
        this.ahorro = 0;
        this.otros = 0;
    }

    //Se crea el onstructor con párametros para llamar al constructor padre   
    public cSalario_Deducciones_Voluntarias(int asocia, int coope, double ahorro, double otros, double miSalario) {
        super(miSalario);
        this.asocia = asocia;         
        this.coope = coope;
        this.ahorro = ahorro;
        this.otros = otros;
    }

    //Setters y Getters 
    public int getAsocia() {
        return asocia;
    }

    public void setAsocia(int asocia) {
        this.asocia = asocia;
    }

    public int getCoope() {
        return coope;
    }

    public void setCoope(int coope) {
        this.coope = coope;
    }

    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }

    public double getOtros() {
        return otros;
    }

    public void setOtros(double otros) {
        this.otros = otros;
    }

    @Override
    
    public String toString() {
        return "cSalario_Deducciones_Voluntarias{" + "asocia=" + asocia + ", coope=" + coope + ", ahorro=" + ahorro + ", otros=" + otros + '}';
    }
        
    //Se crea un método para calcular el monto de la Asociación
    public double calculoAsocia() {
        return (asocia * 0.03 * getMiSalario());  
    }
    
    //Se crea un método para calcular el monto de la Cooperativa
    public double calculoCoope() {
        return (coope * 0.01 * getMiSalario());
    }
    
    //Se crea un método para calcular el monto del porcentaje de ahorro
    public double calculoAhorro() {
        return (getMiSalario() * ahorro / 100);
    }
    
    //Los otros rebajos no se calculan porque son montos fijos
    //Se sobreescribe el salario neto, para mostrar el final
    
    @Override
    public double neto() {
        return super.neto()- this.calculoAsocia() - this.calculoCoope() - this.calculoAhorro() - this.getOtros();

    }

}
