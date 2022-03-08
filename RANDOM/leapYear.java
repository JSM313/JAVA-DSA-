import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {// * If not a century year but mod by 4 then it is a leap year
            leap = true;
            if (year % 100 == 0) { // * Checking if it is a century year
                if (year % 400 == 0) {// * To check if the century year is a leap year
                    leap = true;
                } else {
                    leap = false;
                }
            }
        } else {
            leap = false;
        }
        if (!leap) {
            System.out.println("Not a leap year " + year);
        } else {
            System.out.println(year + " is a leap year");
        }
    }

}
