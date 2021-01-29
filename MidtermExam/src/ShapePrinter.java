public class ShapePrinter {
    public void printTriangle(int height) {
        for (int i=1; i<=height; i++) {
            for (int j=1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void printPyramid(int height) {
        for (int i=1; i<=height; i++) {
            for (int j=(height-i); j>0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printFloydsPyramid(int height) {
        int maxNum = height * (height + 1) / 2;
        int lenOfMaxNum = (String.valueOf(maxNum)).length();
        int printNum = 1;

        for (int i=1; i<=height; i++) {
            for (int j=1; j<=i; j++) {
                int lenOfCurNum = (String.valueOf(printNum)).length();
                for (int k=1; k<=lenOfMaxNum-lenOfCurNum; k++) {
                    System.out.print(" ");
                }
                System.out.print(printNum + " ");
                printNum++;
            }
            System.out.println("");
        }
    }
}
