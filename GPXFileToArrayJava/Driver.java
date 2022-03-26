import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;


public class Driver {
	
	
	public static String arrToJson(Coord[] coordArr) {
		JSONArray jsArray = new JSONArray();
		
	      for (int i = 0; i < coordArr.length; i++) {
	         jsArray.put(coordArr[i]);
	      }
	      return jsArray.toString();
	}

	public static void main(String[] args) throws IOException {
		String GPXFileName="C:\\xampp\\htdocs\\COMP354Group7\\GPXFileToArrayJava\\testTrack.gpx";
		
		List<CoordFull> cf = GPXtoArray.convert(GPXFileName);
		
		Coord[] coordArr = Coord.coordArr(cf);
		//we pass this coordArr to the javascript to output the
		
		String jsonArr = Driver.arrToJson(coordArr);
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\xampp\\htdocs\\COMP354Group7\\GPXFileToArrayJava\\JsonArr.txt"));
		writer.write(jsonArr);


		
	}

}
