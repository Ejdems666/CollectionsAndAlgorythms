import java.util.HashMap;
import java.util.Map;

/**
 * Created by adam on 10/03/2017.
 */
public class FrequencyCalculator {
    public Map<Integer,Integer> getValueFrequency(int[] array) {
        HashMap<Integer,Integer> table = new HashMap<>();
        Integer frequency;
        for (int i = 0; i < array.length; i++) {
            if (table.containsKey(array[i])) {
                frequency = table.get(array[i]);
                table.replace(array[i],++frequency);
            } else {
                table.put(array[i],1);
            }
        }
        return table;
    }
}
