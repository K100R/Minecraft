package creation;

public class Piramida {

    public static void main(String[] args) {
        
    //fill ~1 ~0 ~1 ~121 ~0 ~121 minecraftice
        int bokPiramidy = 100;
        int gruboscPlastra = 2;
        int pietro = 0;
        String nazwaBloku = "minecraft:sandstone";

        int x1 = 1;
        int y = 0;
        int z1 = 1;
        int x2 = 1 + bokPiramidy;
        int z2 = 1 + bokPiramidy;

        do {
//            System.out.println("bokPiramidy  : "+ bokPiramidy);
//            System.out.println("pietro  : "+ pietro);
            StringBuilder komenda = new StringBuilder("fill ~");
            komenda.append(x1).append(" ~");
            komenda.append(y).append(" ~");
            komenda.append(z1).append(" ~");

            komenda.append(x2).append(" ~");
            komenda.append(y+1).append(" ~");
            komenda.append(z2).append(" ");

            komenda.append(nazwaBloku);

            x1 += gruboscPlastra;
            y += gruboscPlastra;
            z1 += gruboscPlastra;
            
            x2 -= gruboscPlastra;
            z2 -= gruboscPlastra;


            System.out.println(komenda);
            bokPiramidy -= gruboscPlastra * 2;
            pietro++;
        } while (bokPiramidy > 10);
        System.out.println("Z Susła na Git");
    }
//    Dorobić schody
//        pobierz wysokość piramidy = pietro*2
//        oblicz Z = bokPiramidy/2
//        tyle ile pięter wykonaj :
//                fill ~x+1 ~y+1 ~Z ~x+1 ~y+1 ~Z+1 minecraft:sandstoneSchody

}
