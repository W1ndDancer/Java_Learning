import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class task3 {
    public static void main(String[] args) throws Exception {

        JSONParser parser = new JSONParser();
        StringBuilder res = new StringBuilder();

        FileReader reader = new FileReader("example2.json");
        JSONArray students = (JSONArray) parser.parse(reader);
        System.out.println(students);

        for (Object st: students) {
            JSONObject stud = (JSONObject) st;
            String surname = (String) stud.get("фамилия");
            String point = (String) stud.get("оценка");
            String subject = (String) stud.get("предмет");
            res.append("Студент/ка ").append(surname).append(" получил ").append(point).append(" по предмету ").append(subject);
            System.out.println(res);
            res.setLength(0);
        }
    }
}
