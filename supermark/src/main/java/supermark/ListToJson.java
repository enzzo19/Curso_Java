package supermark;
import java.util.ArrayList;
import com.google.gson.Gson;
public class ListToJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> foo = new ArrayList<String>();
		foo.add("A");
		foo.add("B");
		foo.add("C");

		String json = new Gson().toJson(foo);
		System.out.println(json.toString());
	}
}
