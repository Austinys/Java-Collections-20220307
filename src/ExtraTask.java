/*
import org.json.simple.JSONArray,
import org.json.simple.JSONObject,
import org.json.simple.parser.JSONParser,
import org.json.simple.parser.ParseException,

import java.io.FileNotFoundException,
import java.io.FileReader,
import java.io.IOException,

public class ExtraTask {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser(),
        try (FileReader reader = new FileReader("src/main/resources/users.json"))
        {
            Object obj = jsonParser.parse(reader),
            JSONArray usersList = (JSONArray) obj,

            usersList.forEach( user -> parseEmployeeObject( (JSONObject) user ) );


        } catch (FileNotFoundException e) {
            e.printStackTrace(),
        } catch (IOException e) {
            e.printStackTrace(),
        } catch (ParseException e) {
            e.printStackTrace(),
        }
    }

    private static void parseEmployeeObject(JSONObject user) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) user.get("user"),

        //Get user first name
        String firstName = (String) employeeObject.get("firstname"),
        System.out.println(firstName),

        //TODO: First complete step 1, then step 2 and etc...
        //TODO: Make application working. There could be problems with gradle, refresh dependencies.
        //TODO: Create User class with parameters from user.json file.
        //TODO: Set User firstname, lastName... Use Enum for country code.
        //TODO: Create User list and add all Users.
        //TODO: Order list from youngest user to oldest (Use Custom Comparator).
        //TODO: Filter list by userId > 10000. If ID is not existent, remove those users. (Use Stream)
        //TODO: Find the Oldest and the Youngest user.
    }
}*/
