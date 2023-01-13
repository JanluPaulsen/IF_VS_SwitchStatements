public class Main {
    public static void main(String[] args) {
        //uses switch case
        printDayOfWeek(2);
        //uses if statements
        printWeekDay(5);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        if (day == 0){
            System.out.println(day + " Sunday");
        } else if (day == 1) {
            System.out.println(day + " Monday");
        } else if (day == 2) {
            System.out.println(day + " Tuesday");
        } else if (day == 3) {
            System.out.println(day + " Wednesday");
        } else if (day == 4) {
            System.out.println(day + " Thursday");
        } else if (day == 5) {
            System.out.println(day + " Friday");
        } else if (day == 6) {
            System.out.println(day + " Saturday");
        }else {
            System.out.println("Invalid Day");
        }
    }
}