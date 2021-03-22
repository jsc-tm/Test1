import java.util.HashMap;

public class HashMapSet {

    private HashMap<String, String> postcodeMap;

    public HashMapSet() {
        postcodeMap = new HashMap<>();
        fillPostcodeMap();
    }

    private void fillPostcodeMap() {
        postcodeMap.put("Antwerpen 1", "2000");
        postcodeMap.put("Antwerpen 2", "2018");
        postcodeMap.put("Boom", "2850");
        postcodeMap.put("Boortmeerbeek", "3190");
        postcodeMap.put("Borgerhout", "2140");
        postcodeMap.put("Duffel", "2570");
        postcodeMap.put("Grimbergen", "1850");
        postcodeMap.put("Hombeek", "2811");
        postcodeMap.put("Leest", "2811");
        postcodeMap.put("Mechelen", "2800");
    }


    public void printoverzicht() {

    }

//    public String zoekPostcode(String gemeente)   {
//
//    }

//    public String zoekGemeente (string postcode)   {
//
//    }

//    public boolean zoekOpBeginLetters(String begin)   {
//
//    }
}





