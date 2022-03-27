import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Driver {
	
	
	public static void arrToJson(Coord[] coordArr) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		JSONArray jsArray = new JSONArray();
		
	      for (int i = 0; i < coordArr.length; i++) {
	         jsArray.put(coordArr[i]);
	      }
	      
	      jsonObject.put("coord", jsArray);
	      try {
	          FileWriter file = new FileWriter("C:\\xampp\\htdocs\\COMP354Group7\\GPXFileToArrayJava\\JsonArr.json");
	          file.write(jsonObject.toString());
	          file.close();
	       } catch (IOException e) {
	          e.printStackTrace();
	       }
	      
	      System.out.println("JSON file created: "+ jsonObject);
	      
	}

	public static void main(String[] args) throws IOException {
		String GPXFileName="C:\\xampp\\htdocs\\COMP354Group7\\GPXFileToArrayJava\\testTrack.gpx";
		
		List<CoordFull> cf = GPXtoArray.convert(GPXFileName);
		
		Coord[] coordArr = Coord.coordArr(cf);
		//we pass this coordArr to the javascript to output the
		
		try {
			Driver.arrToJson(coordArr);
		} catch (JSONException e) {
			e.printStackTrace();
		}


		
	}

}
