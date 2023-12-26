import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class TimeConversion {

    public static void main(String[] args) {
        String time12HourFormat = "07:30:45 PM"; // Replace with your input time

        // Parse input time in 12-hour format
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time12 = LocalTime.parse(time12HourFormat, inputFormatter);

        // Format time in 24-hour format
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time24HourFormat = time12.format(outputFormatter);

        System.out.println("Input Time (12-hour format): " + time12HourFormat);
        System.out.println("Converted Time (24-hour format): " + time24HourFormat);
    }
}