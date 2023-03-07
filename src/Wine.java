import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wine {
  String name;
  String sort;
  int year;
  @Override
  public String toString() {
    return "Wine{" +
        "name = " + name +
        ", sort= " + sort +
        ", year= " + year +
        '}';
  }

  public static List<String> wineList(){
    List<String> wineList = new ArrayList<>();
    wineList.add("Gewurztraminer");
    wineList.add("Chablis");
    wineList.add("Merlot");
    return wineList;
  }



}
