import javax.swing.JOptionPane;

public class TestShowInputDialog {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt((String) JOptionPane.showInputDialog("Donner un entier : "));
            JOptionPane.showMessageDialog(null, "Valeur Saisie : " + n);
            double x = Double.parseDouble((String) JOptionPane.showInputDialog("Donner un réel : "));
            JOptionPane.showMessageDialog(null, "Valeur Saisie : " + x);
            Object[] possibilities = { "Oracle", "MySQL", "PostegreSQL" };
            String s = (String) JOptionPane.showInputDialog(
                    null,
                    "Quel est votre SGBDR favori",
                    "Choix d'un SGBDR",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "Oracle");
            JOptionPane.showMessageDialog(null, "SGBDR choisie : " + s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Attention! vous avez saisi une valeur erronée : " +

                    e, "Erreur", JOptionPane.ERROR_MESSAGE);

        }
    }
}
