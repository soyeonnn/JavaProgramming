public class AverageFinder {
    double computeAverage(int[] intArray) {
        int sum = 0;
        double average;
        for(int i=0; i< intArray.length; i++) {
            sum += intArray[i];
        }
        average = sum / (double) (intArray.length);
        return average;
    }
}
