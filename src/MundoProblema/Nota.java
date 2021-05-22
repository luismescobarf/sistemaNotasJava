package src.MundoProblema;

public class Nota {

    //Atributos Nota
    int nota100;
    double nota5;
    String descripcion;

    //Constructores
    public Nota(int pNota100){

        nota100 = pNota100;
        descripcion = "Descripción de la nota por defecto";
        //Conversión de la nota a escala de 5
        nota5 = nota100/20.0;

    }

    //Métodos
    public void mostrarNota(){
        
        System.out.println("------------------------");
        System.out.printf("Nota/100 %d %n",nota100);
        System.out.printf("Nota/5 %f %n",nota5);
        System.out.printf("Descripción %s %n",descripcion);
        System.out.println("------------------------");

    }

    //Getters
    public String getDescripcion() {
        return descripcion;
    }

    public int getNota100() {
        return nota100;
    }

    public double getNota5() {
        return nota5;
    }

    //Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNota100(int nota100) {
        this.nota100 = nota100;
    }
    
    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }
    
}
