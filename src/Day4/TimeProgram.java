package Day4;

public class TimeProgram {
	    public static void main(String[] args) {
	        String[] tasks = {
	            "Drink Water",
	            "Do Java Programs",
	            "Complete your Lunch",
	            "Watch a Movie",
	            "Practice Coding"
	        };

	        double[] times = {9.00, 11.00, 13.00, 15.00, 17.00};  // 24-hour format
	        String meridiem;

	        for (int i = 0; i < times.length; i++) {
	            double hour = times[i];
	            meridiem = (hour < 12) ? "AM" : "PM";

	            int displayHour = (int) hour;
	            if (displayHour > 12) {
	                displayHour -= 12;
	            } else if (displayHour == 0) {
	                displayHour = 12;
	            }

	            System.out.println("Now the time is: " + displayHour + ":00 " + meridiem);
	            System.out.println("Your task: " + tasks[i]);
	            System.out.println("---------------------------");
	        }
	    }
	}
