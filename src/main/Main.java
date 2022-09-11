
package main;

import kontroller.Feldolgoz;
import nezet.Nezet;


public class Main {
    public static void main(String[] args) {
        String[][] pakli = Feldolgoz.pakli();
        Nezet.kirak(pakli);
        Feldolgoz.kezd();
        pakli = Feldolgoz.kever(pakli);
        Nezet.kirak(pakli);
        
        for (int i = 0; i < 3; i++) {
            int melyik = Feldolgoz.beKer();
            pakli = Feldolgoz.kever(pakli, melyik);
            Nezet.kirak(pakli);
        }
        
        Feldolgoz.megmond(pakli);
    
    }
}
