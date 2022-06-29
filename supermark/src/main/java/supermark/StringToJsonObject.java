package supermark;

import org.json.JSONObject;
import org.json.JSONException;

public class StringToJsonObject {
    public static void main(String[] args){
        try {
            String str = "{\"name\":\"John\",\"age\":\"30\"}";
            JSONObject jsonObject = new JSONObject(str);
            System.out.println("OBJECT : "+jsonObject.toString());
        } catch (JSONException err) {
            System.out.println("Exception : "+err.toString());
        }
    }
}