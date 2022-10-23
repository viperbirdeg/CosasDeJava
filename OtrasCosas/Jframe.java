import javax.swing.*;
import java.awt.*;

class Jframe {
    public static void main(String[] args) {
        // crear un contenedor superior
        JFrame ventana = new JFrame("Hola Mundo");

        // Obtener su contenedor intermedio
        JPanel panel = new JPanel();
        // Crear componentes
        JButton boton = new JButton("Un boton");
        JLabel texto = new JLabel("Wenas");

        // agregar componentes al contenedor intermedio

        JTextField cuadrotxt = new JTextField("Di algo");

        ventana.add(panel);

        panel.add(texto);

        panel.add(boton);

        panel.add(cuadrotxt);

        // tamaño del contenedor superior
        ventana.setSize(1000, 500);

        ventana.setVisible(true);

    }
}