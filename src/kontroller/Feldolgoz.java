package kontroller;

import java.io.Console;
import java.util.Scanner;


public class Feldolgoz {
    private static String[] tempPakli() {
    String[] pakli = new String[24];
    
    String[] szinek = {"P", "T", "Z", "M"};
    String[] ertekek = {"Á", "K", "F", "X", "IX", "VIII"};
        
        int i = 0;
        for (String szin:szinek) {
            for (String ertek : ertekek) {
                pakli[i] = szin+ertek;
                i+=1;
            }
        }
    return pakli;
    }
    
    public static String[][] pakli() {
        String[][] pakli = new String[3][7];
        String[] tempPakli = tempPakli();
    
        int j = 0;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 7; k++) {
                pakli[i][k] = tempPakli[j];
                j += 1;
            }
        }
        
        return pakli;
    }
    private static String[] egyDTomb(String[][] pakli) {
        String[] ujTomb = new String[21];
        int o = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                ujTomb[o] = pakli[i][j];
                o += 1;
            }
        }
        return ujTomb;
    }
    public static String[][] kever(String[][] pakli) {
        String[][] ujPakli = new String[3][7];
        String[] conv = egyDTomb(pakli);
    
        int o = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                ujPakli[j][i] = conv[o];
                o += 1;
            }
        }
        
        
        return ujPakli;
    }
    
    public static String[][] kever(String[][] pakli, int melyik) {
        if (pakli[1].equals(pakli[melyik])) {
            return kever(pakli);
        }
        else {
            boolean nincsMeg = true;
            String[] csere = pakli[1];
            int i = 0;
            while (nincsMeg && i<pakli.length) {                
                if (pakli[i].equals(pakli[melyik])) {
                    pakli[1] = pakli[i];
                    pakli[i] = csere;
                    nincsMeg = false;
                }
                i += 1;
            }
            
        return kever(pakli);
        }
    }
    public static int beKer() {
    Scanner myScanner = new Scanner(System.in);
        System.out.println("Melyik oszlopban van a lap? (1/2/3): ");
        
    return myScanner.nextInt()-1; 
    }
    public static void kezd() {
    Scanner myScanner = new Scanner(System.in);
        System.out.println("Gondoljon egy lapra.");
        myScanner.nextLine();
    }
    public static void megmond(String[][] pakli) {
        System.out.println("Az ön lapja a(z): "+pakli[1][3]);
    }
}
