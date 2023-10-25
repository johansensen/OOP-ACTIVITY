public class DayOfWeekDemo {

    public enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday! Time to start the workweek.");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday. Keep working hard!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Almost the weekend. Finish strong!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Relax and enjoy!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
