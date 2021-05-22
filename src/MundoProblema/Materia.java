package src.MundoProblema;
import java.util.ArrayList;

public class Materia {

    //Atributos
    ArrayList<Nota> notas;
    String docente;
    String nombre;
    double promedio;
    double promedioAjustado;

    //Constructores
    public Materia(){

        //Inicializar el contenedor de notas que compone la materia (tres cortes por defecto)
        notas = new ArrayList<Nota>();
        notas.add(new Nota(0));
        notas.add(new Nota(0));
        notas.add(new Nota(0));

        //Inicializar los demás campos
        nombre = "Nombre Materia Por Defecto";
        docente = "Docente Encargado";
        promedio = 0.0;
        promedioAjustado = 0.0; 

    }

    public Materia(Nota nota1, Nota nota2, Nota nota3){

        //Inicializar el contenedor de notas que compone la materia
        notas = new ArrayList<Nota>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        //Inicializar los demás campos
        nombre = "Nombre Materia Por Defecto";
        docente = "Docente Encargado";
        promedio = 0.0;
        promedioAjustado = 0.0;        

    }

    //Métodos
    public void mostrarInfoMateria(){

        System.out.println("**------------------------**");
        
        System.out.printf("Nombre: %s %n",nombre);
        System.out.printf("Docente: %s %n",docente);
        System.out.printf("Promedio: %f %n",promedio);
        System.out.printf("Promedio Ajustado: %f %n",promedio);
        
        //Mostrar cada una de las notas
        for (Nota nota_i : notas)
            nota_i.mostrarNota();

        System.out.println("**------------------------**");

    }

    //Getters
    public String getDocente() {
        return docente;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public double getPromedioAjustado() {
        return promedioAjustado;
    }

    //Setters
    public void setDocente(String docente) {
        this.docente = docente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setPromedioAjustado(double promedioAjustado) {
        this.promedioAjustado = promedioAjustado;
    }

    
}
