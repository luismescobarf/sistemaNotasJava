package src.Interfaces;
import javax.swing.*;
import java.awt.event.*;
import src.MundoProblema.*;

public class Formulario extends JFrame implements ActionListener{
    private JLabel label1;
    private JButton boton1,boton2;
    public Formulario() {

        //Establecer ubicación de elementos
        setLayout(null);

        //Creación de etiquetas
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(100,100,200,30);
        add(label1);
        
        //Agregar botones
        boton1 = new JButton("Varón");
        boton1.setBounds(10,10,100,30);
        boton1.addActionListener(this);
        add(boton1);
        boton2 = new JButton("Mujer");
        boton2.setBounds(10,70,100,30);
        boton2.addActionListener(this);
        add(boton2);

        //Durante la carga del formulario, instanciar y mostrar nota
        //Nota instanciaNota = new Nota(77);
        //instanciaNota.mostrarNota();

        //Crear una materia durante la carga del formulario (tres cortes por defecto)
        Materia instanciaMateria = new Materia();
        instanciaMateria.mostrarInfoMateria();

    }

    //Manejo de los eventos de los botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("Varón");
        }
        if (e.getSource()==boton2) {
            setTitle("Mujer");
        }
    }
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}