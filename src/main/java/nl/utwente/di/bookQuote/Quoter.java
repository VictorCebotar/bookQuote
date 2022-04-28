package nl.utwente.di.bookQuote;

import java.util.HashMap;
import java.util.Map;

public class Quoter {
    Map <String, Double> map = new HashMap<String, Double>();
    double getBookPrice(String isbn)
    {
        map.put("1", 10.0);
        map.put("2", 45.0);
        map.put("3", 20.0);
        map.put("4", 35.0);
        map.put("5", 50.0);
        for(String i : map.keySet())
            if(isbn.equals(i))
                return map.get(i);
        return 0;
    }
}
