package variables;
//libreria para usar JOptionpane
import javax.swing.*;

public class entradaJoptionpane {

    public static void main(String[] args) {

        String club;
        int copas;

        club = JOptionPane.showInputDialog("Escriba el nombre de su club favortito");

        //con el <Integer.parseInt> convertimos de string a entero pq el JOptionpane es String y la variable copas es int
        copas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas Copas libertadores tiene su club?"));

        System.out.println("Su club favorito es " + club + " y tiene " + copas + " Libertadores\n");
    }

}
