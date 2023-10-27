package exemple;
import java.awt.Color;

import bandeau.Bandeau;


public class ChangerCouleur extends Effet{
    public ChangerCouleur() {

    }
    public void executer(Bandeau Bd)
    {
            Bd.setMessage("On change de couleur");

            Bd.setForeground(Color.yellow);
            Bd.sleep(600);
            Bd.setForeground(Color.red);
            Bd.sleep(600);
            Bd.setForeground(Color.green);
            Bd.sleep(600);
            Bd.setForeground(Color.pink);
            Bd.sleep(600);
    }
}