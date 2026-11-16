import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestShowMessageDialog {
    public static void main(String[] args) {
        // default title and icon
        JOptionPane.showMessageDialog(null,
                "Message affiché au milieu de la boite.");
        // custom title, warning icon
        JOptionPane.showMessageDialog(null,
                "Message affiché au milieu de la boite.",
                "barre de titre : Warning Message",
                JOptionPane.WARNING_MESSAGE);
        // custom title, error icon
        JOptionPane.showMessageDialog(null,
                "Message affiché au milieu de la boite.",
                "Barre de titre : Error Message",
                JOptionPane.ERROR_MESSAGE);
        // custom title, no icon
        JOptionPane.showMessageDialog(null,
                "Message affiché au milieu de la boite.",
                "Barre de titre : A plain message",
                JOptionPane.PLAIN_MESSAGE);
        // custom title, custom icon
        Icon tigerIcon = new ImageIcon("C:/Users/hassouni/Pictures/java/tiger.gif");
        JOptionPane.showMessageDialog(null,
                "Message affiché au milieu de la boite.",
                "Barre de titre : affichage d'une image icone",
                JOptionPane.INFORMATION_MESSAGE,
                tigerIcon);
    }
}
