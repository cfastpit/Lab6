
public class monthMain {

    public static void main(String[] args) {
        Month month1 = new Month();
        Month month2 = new Month(20);
        Month month3 = new Month(4);
        Month month4 = new Month("january");
        Month month5 = new Month("this");
        Month month6 = new Month("may");

        System.out.println(month1.monthNumber);
        System.err.println(month2.monthNumber);
        System.err.println(month3.monthNumber);
        System.err.println(month4.monthNumber + month4.monthName);
        System.err.println(month5.monthNumber + month5.monthName);
        System.err.println(month6.monthNumber + month6.monthName);
        System.err.println(month6.equals(month5));
        System.err.println(month4.equals(month1));
        System.err.println(month6.lessThan(month1) + " lessthan");
        System.err.println(month6.graterThan(month1) + " graterthan");

    }

}
