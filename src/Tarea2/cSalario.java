package Tarea2;

//Se crea la clase cSalario 
public class cSalario {
    
//Se crean los atributos
    private double miSalario;

    //Se crea un constructor sin parámetros
    public cSalario() {
        this.miSalario = 0;
    }
    
    //Se crea un constructor con parámetros
    public cSalario(double miSalario) {
        this.miSalario = miSalario;
    }
    
    //Getters y setters
    public double getMiSalario() {
        return miSalario;
    }

    public void setMiSalario(double miSalario) {
        this.miSalario = miSalario;
    }
    
    @Override
    public String toString() {
        return "cSalario{" + "miSalario=" + miSalario + '}';
    }
    
    //Se crea un método para calcular el monto de la CCSS
    public double ccss(){
        return ( miSalario * 0.055 );
    }
    
    //Se crea un método para calcular el monto de la Pensión
    public double pension(){
        return (miSalario * 0.0417);
    }
    
    //Se crea un método para calcular el monto del Banco Popular
    public double popular(){
        return (miSalario * 0.01);
    }
    
    //Se crea un método para calcular el monto del Impuesto de Renta
    public double renta(){
        double impuesto;          
        
        if (miSalario <= 941000) {
            impuesto = 0;
        } else if (miSalario > 941000 && miSalario <= 1381000) {
            impuesto = (miSalario - 941000) * 0.1;
        } else if(miSalario > 1381000 && miSalario <= 2423000) {
            impuesto = (1381000 - 941000) * 0.1 + (miSalario - 1381000) * 0.15;
        } else if(miSalario > 2423000 && miSalario <= 4845000) {
            impuesto = (1381000 - 941000) * 0.1 + (2423000 - 1381000) * 0.15 + (miSalario - 2423000) * 0.2;
        } else{
            impuesto = (1381000 - 941000) * 0.1 + (2423000 - 1381000) * 0.15 + (4845000 - 2423000) * 0.2 + (miSalario - 4845000) * 0.25;
        }
        return impuesto;
    }
    
    //Se crea un método para calcular el Salario Neto
    public double neto() {
        return (miSalario - this.ccss() - this.pension() - this.popular() - this.renta());
    }
    
}
