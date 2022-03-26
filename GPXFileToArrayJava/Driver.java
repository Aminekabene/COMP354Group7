import java.util.List;
import org.json.JSONArray;


public class Driver {
	
	
	public static void double[] arrToJson(double coordArr[]) {
		JSONArray jsArray = new JSONArray();
		
	      for (int i = 0; i < coordArr.length; i++) {
	         jsArray.put(coordArr[i]);
	      }
	      System.out.println(jsArray);
	}

	public static void main(String[] args) {
		String GPXFileName="C:\\xampp\\htdocs\\COMP354Group7\\GPXFileToArrayJava\\testTrack.gpx";
		
		List<CoordFull> cf = GPXtoArray.convert(GPXFileName);
		
		Coord[] coordArr = Coord.coordArr(cf);
		//we pass this coordArr to the javascript to output the
		
		


		
	}

}
