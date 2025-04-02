public class enumeration {
    public enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public boolean Workday() {
            return (this != DayOfWeek.SATURDAY && this != DayOfWeek.SUNDAY);
        }
    }
    public static void main(String[] args) {
        //Check if Monday is a Workday
        System.out.println("Is Monday a Workday?" + DayOfWeek.MONDAY.Workday());

        //check if Saturday is a workday
        System.out.println("Is Saturday a Workday?" + DayOfWeek.SATURDAY.Workday());
    }
}
