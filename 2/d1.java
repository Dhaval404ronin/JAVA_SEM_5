import java.util.Random;

public class d1 {
    public static void main(String[] args) {
        Random r = new Random();
        StringBuilder p = new StringBuilder();

        for (int i = 0; i < 3; i++)
            p.append((char)(r.nextInt(26) + 'A'));
        
        for (int i = 0; i < 4; i++)
            p.append(r.nextInt(10));

        System.out.println("Plate Number: " + p);
    }
}
/* each time random
o/p->
Plate Number: JTX8827
o/p->
Plate Number: EDF1722
*/