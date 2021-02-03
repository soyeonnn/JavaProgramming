import java.util.ArrayList;

public class Main {
    public static int getNextIndex(int length, int k, int index) {
        int returnNum = index;
        if (returnNum == length) {returnNum = 0; }

        for (int i=0;i<k-1;i++) {
            returnNum++;
            if (returnNum == length) {
                returnNum = 0;
            }
        }
        return returnNum;
    }

    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();

        // circle 리스트에 1번부터 n번까지 저장
        for(int i=1;i<=n;i++) {
            circle.add(i);
        }

        int circleLength = n;
        int removeIndex = k-1;

        for(int i=0;i<n-1;i++) {
            System.out.println(circle.get(removeIndex) + "번 군사가 죽습니다.");
            circle.remove(removeIndex);
            circleLength -= 1;
            removeIndex = getNextIndex(circleLength, k, removeIndex);
        }
        return circle.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}