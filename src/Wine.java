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

//  public static String onStock(){
//    List<Map<String, Integer>> stock = new ArrayList<>();
//    Map<String, Integer> bottleAmount = new HashMap<>();
//    bottleAmount.put(wineList().get(0), 3);
//    bottleAmount.put("Chablis", 1);
//    bottleAmount.put("Merlot", 5);
//
//    System.out.printf("На складе имеется %d бутылок.\n", stock.get(bottleAmount.containsKey(wineList())));
//    return onStock();
//  }


}
