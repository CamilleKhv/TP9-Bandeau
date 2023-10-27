package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.util.ArrayList;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        monBandeau.setMessage("Hello World");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.WHITE);
        monBandeau.setForeground(Color.ORANGE);
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.GREEN);
        monBandeau.sleep(1000);

        ArrayList<Effet> Scen = new ArrayList<Effet>();

        monBandeau.setForeground(Color.BLACK);
        monBandeau.sleep(1000);
        Rotation R1 = new Rotation(75);
        Rotation R2 = new Rotation(-75);
        ChangerCouleur Ccou = new ChangerCouleur();
        Clignote Cli = new Clignote();

        Scenario S= new Scenario ("Scenario 1", Scen);
        S.AjouteAuScenario(R1,16);
        S.AjouteAuScenario(R2,16);
        S.AjouteAuScenario(Ccou,1);
        S.AjouteAuScenario(Cli,4);

        S.executerScenario(monBandeau);
        monBandeau.setForeground(Color.BLACK);
        monBandeau.setMessage("C'est fini!");
        monBandeau.sleep(2000);
        monBandeau.close();
    }
}
