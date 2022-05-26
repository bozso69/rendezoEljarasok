package window;

import javax.swing.*;
import java.awt.*;


public class window {
    static JFrame ablak = new JFrame("Rendező Eljarasok");
    static TextArea buborekszamlista = new TextArea("Üres adatok", 10, 200);
    static JPanel panel = new JPanel();
    static JLabel buborekLabel = new JLabel();
    static JButton buttonKilepes = new JButton("Kilépés");


    public window() {

    }

    public static void creareWindow() {
        /*Buborék*/
        buborekszamlista.setEditable(true);
        panel.setLocation(10,10);
        panel.add(buborekLabel);
        panel.add(buborekszamlista);

        /*Ablak elemek*/
        panel.add(buttonKilepes);
        ablak.add(panel);
        ablak.setSize(1500, 600);
        ablak.setLocationRelativeTo(null);
        ablak.setSize(1500, 600);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setVisible(true);


    }


}
