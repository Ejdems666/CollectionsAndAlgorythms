import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * Created by adam on 10/03/2017.
 */
class FrequencyCalculatorTest {
    private FrequencyCalculator frequencyCalculator;

    @BeforeEach
    void setUp() {
        frequencyCalculator = new FrequencyCalculator();
    }

    @Test
    void getValueFrequency() {
        int[] array = new int[]{1,2,1,2,3};
        Map<Integer,Integer> table = frequencyCalculator.getValueFrequency(array);
        Assertions.assertArrayEquals(table.values().toArray(new Integer[3]),new Integer[]{2,2,1});
        Assertions.assertArrayEquals(table.keySet().toArray(new Integer[3]),new Integer[]{1,2,3});
    }

}