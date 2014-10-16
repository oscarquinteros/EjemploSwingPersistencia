package ejemploswing;

import ejemploswing.interfaz.Principal;
import javax.swing.JFrame;

public class EjemploSwing {

    public static void main(String[] args) {
        JFrame aplication = new Principal("Gestion de Cuentas");
        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
}
