/*Benjamin Bylund te16
   2018-02-05
   Komplexa tal
 */


public class Tal {
        //variabler
       private double a;
       private double b;

       //Konstruktor.
        public Tal(double re, double im){
            this.a = re;
            this.b = im;
        }

        //Metoder.
        public String toString(){

            if ( b < 0){
                return a + " - " + (-b) + " i";
            }else{
                return a + " + " + b + " i";
            }
        }

    public void add(Tal z2) {
            a = a + z2.a;
            b = b + z2.b;
    }

    public void multi(Tal z2){
        Tal temp = new Tal(this.a, this.b);
        this.a = (temp.a * z2.a) - (temp.b * z2.b);
        this.b = (temp.a * z2.b) + (z2.a * temp.b);
    }
}
