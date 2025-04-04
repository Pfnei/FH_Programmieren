package at.technikum;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            System.out.println(ymd2w(year, month, day));
            System.out.println(dayNumber(year, month, day));
            System.out.println(weekNumber(year, month, day));
            printDate(year, month, day);
            System.out.println();
            printStatistics(year, month, day);
            System.out.println(ymd2w(year, month, 1));
            System.out.println();
            printCalendar(year, month, day, true);
        }

        sc.close();
    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static int daysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2: {
                if (isLeap(year)) return 29;
                else return 28;
            }
            default:
                return 0;
        }

    }

    public static boolean checkDate(int year) {
        return !(year < 1582 || year > 2199);
        //if (year<1582 || year>2199) return false;
        //return true;
    }

    public static boolean checkDate(int year, int month) {
        if (!checkDate(year)) return false;
        if (!isMonthValid(month)) return false;
        return !(month < 10 && year == 1582);

    }

    public static boolean checkDate(int year, int month, int day) {
        if (!checkDate(year, month)) return false;
        if (day < 16 && month == 10) return false;
        // falsche Tages und Monatswerte werden ausgeschieden

        return isDaysAndMonthValid(year, month, day);
        //if (!isDaysAndMonthValid(year, month, day)) return false;
        //return true;
    }

    public static boolean isMonthValid(int month) {
        return month > 0 && month < 13;
        //if (month>0 && month <13) return true;
        //return false;
    }

    public static boolean isDaysAndMonthValid(int year, int month, int day) {
        if (!isMonthValid(month)) return false;
        if (day < 0) return false;

        return day <= daysInMonth(year, month);
        //if (day > daysInMonth(year, month)) return false;
        //return true;
    }


    public static int ymd2w(int year, int month, int day) {
        // dieser Teil hat irgendwo einen Fehler in der Formel - ich bin mir nicht sicher, ob die GaussFormel sich stimmt
        // funktioniert für den 1.3.2025 --> ergibt -1
      /*  if (!checkDate(year, month, day)) return -1;
        // jan, Feb gehoeren zum alten Jahr
        if (month<=2) year--;
        int y = year % 100;
        int c = year / 100;
        // erster Monat ist der März
        int m = month -2;
        if (m<=0) m+=12;

        int weekday = day + (int) ((2.6*m)-0.2) + y + y/4 + c/4 - 2*c;
        return weekday % 7;
        // Weekday start with 0= SUN to 6 = SAT
       // Other way:
      */
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getValue(); // Monday == 1, Sunday == 7

    }

    public static int dayNumber(int year, int month, int day) {
        if (!checkDate(year, month, day)) return -1;
        int daysUntilDate = 0;
        for (int i = 1; i < month; i++) {
            daysUntilDate += daysInMonth(year, i);
        }
        return daysUntilDate + day;
    }

    // returns the weekNumber in a year, first week starts with Jan 1st
    // Weekday start with 0= SUN to 6 = SAT and gooes form SUN to SAT
    // Week Starts with Monday!
    public static int weekNumber(int year, int month, int day) {
        if (!checkDate(year, month, day)) return -1;
        // takes into account that first weeks are not always full wekks
        // 1.1. is SAT --> ymd2w = 6 - on 1.1.: 1+6-2=5 / 7 = 0 + 1 = 1; 2.1 2+6-2=6/7=0+1=1
        // 1.1. is MON--> ymd2w = 0 - on 1.1 (MON).: 1+1-2=0 / 7 = 0 + 1 = 1; 8.1 (MON) 8+1-2=7/7=1+1=2
        // Die Logik stimmt nicht mehr , weil mit den Java Funktion beginnt der Wochendetag mit MON 1
        // Korrektur für Wochenbeginn SUN (0)
        //int firstWeekCorrection = ymd2w (year, 1, 1)-2;

        // Woche beginnt mit Montag = 1
        int firstWeekCorrection = ymd2w(year, 1, 1) - 1;
        return ((dayNumber(year, month, day) + firstWeekCorrection) / 7) + 1;

    }

    public static void printDayName(int day) {

        switch (day) {
            case 0: {
                System.out.print("Sunday");
                break;
            }
            case 1: {
                System.out.print("Monday");
                break;
            }
            case 2: {
                System.out.print("Tuesday");
                break;
            }
            case 3: {
                System.out.print("Wednesday");
                break;
            }
            case 4: {
                System.out.print("Thursday");
                break;
            }
            case 5: {
                System.out.print("Friday");
                break;
            }
            case 6: {
                System.out.print("Saturday");
                break;
            }
            default:
                System.out.printf("invalid day (%d)", day);

        }
    }

    public static void printMonthName(int month) {
        switch (month) {
            case 1: {
                System.out.print("January");
                break;
            }
            case 2: {
                System.out.print("February");
                break;
            }
            case 3: {
                System.out.print("March");
                break;
            }
            case 4: {
                System.out.print("April");
                break;
            }
            case 5: {
                System.out.print("May");
                break;
            }
            case 6: {
                System.out.print("June");
                break;
            }
            case 7: {
                System.out.print("July");
                break;
            }
            case 8: {
                System.out.print("August");
                break;
            }
            case 9: {
                System.out.print("September");
                break;
            }
            case 10: {
                System.out.print("October");
                break;
            }
            case 11: {
                System.out.print("November");
                break;
            }
            case 12: {
                System.out.print("Decemeber");
                break;
            }

            default:
                System.out.printf("invalid day (%d)", month);
        }
    }

    public static void printNmberEnding(int n) {

        switch (n % 10) {
            case 1: {
                if (n == 11) System.out.print("th");
                else System.out.print("st");
                break;
            }
            case 2: {
                if (n == 12) System.out.print("th");
                else System.out.print("nd");
                break;
            }
            case 3: {
                if (n == 13) System.out.print("th");
                else System.out.print("rd");
                break;
            }

            default:
                System.out.print("th");

        }
    }


    public static void printDate(int year, int month, int day) {
        if (!checkDate(year, month, day)) {
            System.out.printf("invalid day (%d.%d.%d)", day, month, year);
            return;
        }
        printDayName(ymd2w(year, month, day));
        System.out.print(", ");
        printMonthName(month);
        System.out.printf(" %d", day);
        printNmberEnding(day);
        System.out.printf(" %d", year);
    }

    public static void printStatistics(int year, int month, int day) {
        System.out.println("statistics for");
        printDate(year, month, day);
        System.out.println();
        if (isLeap(year)) System.out.printf("%d is a leap year\n", year);
        else System.out.printf("%d is NOT a leap year\n", year);
        printMonthName(month);
        System.out.printf(" %d has %d days\n", year, daysInMonth(year, month));
        System.out.printf("it is %d of %d\n", dayNumber(year, month, day), year);
        System.out.printf("it is week %d\n", weekNumber(year, month, day));

    }

    public static void printCalendar(int year, int month, int day, boolean highlight) {

        printMonthName(month);
        System.out.printf(" %d\n", year);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        // Einzug für die erste Woche
        int vorschub;

        if (ymd2w(year, month, 1) == 0) vorschub = 7;
        else vorschub = ymd2w(year, month, 1);

        for (int i = 1; i < vorschub; i++)
            System.out.printf("    ");

        for (int i = 1; i <= daysInMonth(year, month); i++) {
            if (highlight && i == day)
                System.out.printf("<%2d>", i);
            else
                System.out.printf(" %2d ", i);
            // new line after Sunday
            if (ymd2w(year, month, i) == 7) System.out.println();
        }
    }
}





