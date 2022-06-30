package supermark;
import java.util.ArrayList;
import com.google.gson.Gson;
public class ListToJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> foo = new ArrayList<String>();
		ArrayList<String> bar = new ArrayList<String>();
		bar.add("valor");
		foo.add("A");
		foo.add("B");
		foo.add("C");
		foo.add(bar.toString());

		String json = new Gson().toJson(foo);
		System.out.println(json.toString());
	}
}
