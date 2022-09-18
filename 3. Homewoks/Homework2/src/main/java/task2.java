import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class task2 {
    public static void main(String[] args) throws Exception {
        JSONObject jsonObject = (JSONObject) ReadJson("example1.json");
        System.out.println(jsonObject);
        String name = (String) jsonObject.get("name");
        String age = (String) jsonObject.get("age");
        String country = (String) jsonObject.get("country");
        String city = (String) jsonObject.get("city");

        StringBuilder result = new StringBuilder("select * from students ");
        if (!name.equals("null") || !age.equals("null") || !country.equals("null") || !city.equals("null")) result.append("where");
        if (!name.equals("null")) result.append(" name = '").append(name).append("'");
        if (!name.equals("null") && (!age.equals("null") || !country.equals("null") || !city.equals("null"))) result.append(" and");
        if (!age.equals("null")) result.append(" age = '").append(age).append("'");
        if (!age.equals("null") && (!country.equals("null") || !city.equals("null"))) result.append(" and");
        if (!country.equals("null")) result.append(" country = '").append(country).append("'");
        if (!country.equals("null") && !city.equals("null")) result.append(" and");
        if (!city.equals("null")) result.append(" city = '").append(city).append("'");

        System.out.println(result);
    }

    public static Object ReadJson(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }
}
