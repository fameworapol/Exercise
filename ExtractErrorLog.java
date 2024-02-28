

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ExtractErrorLog {
    public static void main(String[] args) {
        List<List<String>> logs = new ArrayList<>(List.of(List.of("01-01-2023", "14:00", "ERROR",
                "failed"),
                List.of("01-01-2023", "15:00", "INFO",
                        "established"),
                List.of("01-01-2023", "01:30", "ERROR",
                        "failed")));
        System.out.println(extractErrorLogs(logs));
        ;
    }

    public static List<List<String>> extractErrorLogs(List<List<String>> logs) {
        List<List<String>> result = new ArrayList<>();
        LocalDateTime currentDateTime = LocalDateTime.now();
        for (int i = 0; i < logs.size(); i++) {
            if (i == 0) {
                String[] tempTimeArray = logs.get(i).get(1).split(":");
                if (tempTimeArray.length < 2) {
                    tempTimeArray[1] = "0";
                }
                LocalTime tempTime = LocalTime.of(Integer.parseInt(tempTimeArray[0]),
                        Integer.parseInt(tempTimeArray[1]));
                String[] tempDateArray = logs.get(i).get(0).split("-");
                LocalDate tempDate = LocalDate.of(Integer.parseInt(tempDateArray[2]),
                        Integer.parseInt(tempDateArray[1]), Integer.parseInt(tempDateArray[0]));
                LocalDateTime compareDateTime = LocalDateTime.of(tempDate, tempTime);
                currentDateTime = compareDateTime;
            }
            if (logs.get(i).get(2).equals("ERROR") || logs.get(i).get(2).equals("CRITICAL")) {
                String[] tempTimeArray = logs.get(i).get(1).split(":");
                if (tempTimeArray.length < 2) {
                    tempTimeArray[1] = "0";
                }
                LocalTime tempTime = LocalTime.of(Integer.parseInt(tempTimeArray[0]),
                        Integer.parseInt(tempTimeArray[1]));
                String[] tempDateArray = logs.get(i).get(0).split("-");
                LocalDate tempDate = LocalDate.of(Integer.parseInt(tempDateArray[2]),
                        Integer.parseInt(tempDateArray[1]), Integer.parseInt(tempDateArray[0]));
                LocalDateTime compareDateTime = LocalDateTime.of(tempDate, tempTime);
                if (compareDateTime.isBefore(currentDateTime)) {
                    result.add(0, logs.get(i));
                }
                if (compareDateTime.isAfter(currentDateTime) || compareDateTime.equals(currentDateTime)) {
                    result.add(logs.get(i));
                }
            }
        }
        // Write your code here
        return result;
    }
}
