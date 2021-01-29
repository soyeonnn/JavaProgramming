public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        }

        int max = intArray[0];
        int min = intArray[0];
        int diff;

        for (int i=0; i<intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        diff = max - min;
        return diff;
    }
}
