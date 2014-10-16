package ejemploswing.interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame{
    ActionListener manejadorEventos = new ManejadorEventos();
    JMenuItem altaCuenta=new JMenuItem("Alta Cuentas");
    JMenuItem acreditarCuenta=new JMenuItem("Acreditar");
    JMenuItem debitarCuenta=new JMenuItem("Debitar");
    JMenuItem salirSi=new JMenuItem("SI");
    JDesktopPane escritorio;
    public Principal(String titulo) {
        super(titulo);
        escritorio=new JDesktopPane();
        setContentPane(escritorio);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setSize(dimension);
        JMenuBar menuPrincipal = new JMenuBar();
        setJMenuBar(menuPrincipal);

        JMenu cuentas= new JMenu("Cuentas");
        JMenu salir= new JMenu("Salir");
        menuPrincipal.add(cuentas);
        menuPrincipal.add(salir);
        altaCuenta.addActionListener(manejadorEventos);
        cuentas.add(altaCuenta);
        cuentas.addSeparator();
        acreditarCuenta.addActionListener(manejadorEventos);     
        cuentas.add(acreditarCuenta);
        debitarCuenta.addActionListener(manejadorEventos);
        cuentas.add(debitarCuenta);
        
        salirSi.addActionListener(manejadorEventos);
        salir.add(salirSi);
        salir.add(new JMenuItem("NO"));
        
        setVisible(true);                
        
    }
    class ManejadorEventos implements ActionListener  {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == altaCuenta)
                ventana();
            if (e.getSource() == salirSi)
                System.exit(0);
        };
    };
    private void ventana( ) {
        VentanaAltaCuenta ventanaAltaCuenta= new VentanaAltaCuenta();
        escritorio.add(ventanaAltaCuenta,new Integer(1));
        Dimension dim_pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dim_cuadro = ventanaAltaCuenta.getSize();
        ventanaAltaCuenta.setLocation((dim_pantalla.width-dim_cuadro.width)/2,(dim_pantalla.height-dim_cuadro.height)/2);
        ventanaAltaCuenta.show();
    }        
    
}
