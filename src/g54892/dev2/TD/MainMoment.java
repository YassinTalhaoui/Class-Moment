package g54892.dev2.TD;

/**
 *
 * @author g54892
 */
public class MainMoment {

    public static void main(String[] args) {
        /*Moment moment1 = new Moment(23,45,10);
        System.out.println(moment1);
        System.out.println("heures: "+moment1.getHour());
        System.out.println("minutes: "+moment1.getMinute());
        System.out.println("secondes: "+moment1.getSecond());
        
        Moment moment2 = new Moment(5,33,6);
        System.out.println(moment2);
        System.out.println("heures: "+moment2.getHour());
        System.out.println("minutes: "+moment2.getMinute());
        System.out.println("secondes: "+moment2.getSecond());
        
        Moment moment3 = new Moment(9,59,20);
        System.out.println(moment3);
        System.out.println("heures: "+moment3.getHour());
        System.out.println("minutes: "+moment3.getMinute());
        System.out.println("secondes: "+moment3.getSecond());*/

        Moment moment1 = new Moment(8, 15, 0);
        Moment moment2 = new Moment(8, 15, 0);
        Moment moment3 = moment1;
        Moment moment4 = new Moment(10, 15, 0);
        Moment moment5 = new Moment();
        System.out.println(" resultat" + moment5.compareTo(moment1));
        System.out.println("Secondes " + moment1.toSecond());
        System.out.println(moment1 + " == " + moment2 + " : " + (moment1 == moment2));
        System.out.println(moment1 + " == " + moment3 + " : " + (moment1 == moment3));
        System.out.println(moment1 + " == " + moment4 + " : " + (moment1 == moment4));
        System.out.println(moment1 + " equals " + moment2 + " : " + moment1.equals(moment2));
        System.out.println(moment1 + " equals " + moment3 + " : " + moment1.equals(moment3));
        System.out.println(moment1 + " equals " + moment4 + " : " + moment1.equals(moment4));
    }
}
