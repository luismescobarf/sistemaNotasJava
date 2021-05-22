package src.Interfaces;
import javax.swing.*;
import src.MundoProblema.*;

public class Formulario extends JFrame{
    private JLabel label1;
    public Formulario() {
        setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        add(label1);        

        //Durante la carga del formulario, instanciar y mostrar nota
        //Nota instanciaNota = new Nota(77);
        //instanciaNota.mostrarNota();

        //Crear una materia durante la carga del formulario (tres cortes por defecto)
        Materia instanciaMateria = new Materia();
        instanciaMateria.mostrarInfoMateria();

    }
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}