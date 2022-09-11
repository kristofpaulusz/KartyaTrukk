package nezet;

public class Nezet {
//    public static void kirak(String[] pakli) {
//        for (int i = 0; i < pakli.length; i++) {
//            System.out.println(i+". "+pakli[i]);
//        }
//    }
    public static void kirak(String[][] pakli) {
        System.out.println("");
        System.out.println("I.\tII.\tIII.");
        System.out.println("-------------------------------");
        for (int i = 0; i < pakli[0].length; i++) {
            System.out.println(pakli[0][i]+"\t"+pakli[1][i]+"\t"+pakli[2][i]);
        }
    }
}
