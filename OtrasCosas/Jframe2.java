import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Jframe2 {
    public static void main(String[] args) {
        // crear un contenedor superior
        JFrame ventana = new JFrame("Hola Mundo"); // contenedor superior

        // Obtener su contenedor intermedio
        JPanel panel = new JPanel(); // contenedor intermedio
        // Crear componentes
        JButton boton = new JButton("Un boton"); // boton
        JLabel texto = new JLabel("Wenas"); // Texto definico

        // agregar componentes al contenedor intermedio

        JTextField cuadrotxt = new JTextField("Di algo");// Campo de texto

        panel.setLayout(null); // panel para cambiar de tamaño
        JButton boton1 = new JButton("Boton"); // boton1

        ventana.add(panel); // añadir el panel a ventana

        panel.add(cuadrotxt); // añadir a panel cuadrotxt

        panel.add(boton1); // añadir a panel el boton1

        // tamaño del contenedor superior
        ventana.setSize(500, 250);// tamaño de ventana

        ventana.setVisible(true);// ventana sea visible (true), no visible (false)

        boton1.setBounds(10, 50, 250, 20); // boton1 (posicion en x, posicion en y, ancho, alto)
        cuadrotxt.setBounds(10, 10, 250, 30); // cuadrotxt (posicion en x, posicion en y, ancho, alto)
    }
}