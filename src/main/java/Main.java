import java.util.Map;

/**
 * Created by adam on 10/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        printFrequency();
        printBinarySearchTreeSum();
    }

    private static void printFrequency() {
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator();
        int[] array = new int[]{2,5,2,9,7,1,100,2,3,5,77,9,1,2,6,5};
        Map<Integer,Integer> table = frequencyCalculator.getValueFrequency(array);
        System.out.println("Problem 2:");
        System.out.println("val | freq");
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            System.out.print(entry.getKey() + " | ");
            System.out.print(entry.getValue() + "\n");
        }
    }

    private static void printBinarySearchTreeSum() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Integer[] elements = new Integer[]{100,200,300,4,5,8};
        for (Integer element : elements) {
            binarySearchTree.addElement(element);
        }
        System.out.println("\nProblem 5:");
        System.out.println(binarySearchTree.sum());
    }
}
