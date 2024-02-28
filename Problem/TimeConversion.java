package Problem;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:39AM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String timeUnit = s.substring(s.length() - 2, s.length());
        String time = s.substring(0, s.length() - 2);
        String[] splitTime = time.split(":");
        String result = "";
        if (timeUnit.equals("AM")) {
            if (splitTime[0].equals("12")) {
                splitTime[0] = "00";
            }
            Integer convertTime = Integer.parseInt(splitTime[0]) + 0;
            String convertTimeStr = convertTime.toString();
            if (convertTimeStr.length() == 1) {
                convertTimeStr = "0"+convertTimeStr;
            }
            result += (convertTimeStr + ":" + splitTime[1] + ":" + splitTime[2]);
        } else if (timeUnit.equals("PM")) {
            if (splitTime[0].equals("12")) {
                splitTime[0] = "0";
            }
            Integer convertTime = Integer.parseInt(splitTime[0]) + 12;
            String convertTimeStr = convertTime.toString();
            if (convertTimeStr.length() == 1) {
                convertTimeStr = "0"+convertTimeStr;
            }
            result += (convertTimeStr + ":" + splitTime[1] + ":" + splitTime[2]);
        }
        System.out.println(result.trim());
        return result;
    }
}
