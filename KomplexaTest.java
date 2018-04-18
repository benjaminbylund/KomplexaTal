/*Benjamin Bylund te16
   2018-02-05
   Komplexa tal
 */

public class KomplexaTest {
    public static void main(String[] args) {

        Tal z = new Tal(25, 50);
        System.out.println(z.toString());

        Tal z2 = new Tal(2,3);
        System.out.println(z2.toString());

        z.add(z2);
        System.out.println(z.toString());

        z.multi(z2);
        System.out.println(z.toString());
    }
}
