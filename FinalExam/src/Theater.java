public class Theater {
    private Seat[][] seats;
    private int rowCount, colCount;

    // Theater 생성자
    public Theater(int rowCount, int colCount) {
        // 알파벳은 26자
        if (rowCount > 26) {
            rowCount = 26; // number of alphabets
        }
        // seats 좌석 배열 생성
        seats = new Seat[rowCount][colCount];

        // 각 자리에 seat 인스턴스 생성
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }

        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    // 예약 정보(이름, 열, 행, 예약 좌석 수)를 파라미터로 받아 예약하는 메소드입니다.
    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        int row = getRowIndex(rowChar);

        // 예약 시도 정보가 영화관 좌석 수를 벗어났을 경우에 대한 처리
        if (row > rowCount || col > colCount || col + numSeat - 1 > colCount) {
            return false;
        }

        // 예약 된 자리가 있는지 확인하고, 있다면 false 리턴
        for (int i=col-1; i<col+numSeat-1; i++) {
            if (seats[row][i].isOccupied()) {
                return false;
            }
        }

        // 예약하기
       for (int i=col-1; i<col+numSeat-1; i++) {
            seats[row][i].reserve(name);
        }
        return true;
    }

    public int cancel(String name) {
        int cancelCount = 0;
        for (int i=0; i<rowCount; i++) {
            for (int j=0; j<colCount; j++) {
                if (seats[i][j].isOccupied() && seats[i][j].match(name)) {
                    seats[i][j].cancel();
                    cancelCount++;
                }
            }
        }
        return cancelCount;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        int cancelCount = 0;
        int row = getRowIndex(rowChar);

        if (row > rowCount || col > colCount) {
            return 0;
        }

        for (int i=col-1; i<col+numSeat-1; i++) {
            if(seats[row][i].isOccupied()) {
                seats[row][i].cancel();
                cancelCount++;
            }
        }
        return cancelCount;
    }

    public int getNumberOfReservedSeat() {
        int totalReserveNum = 0;
        for (int i=0; i<rowCount; i++) {
            for (int j=0; j<colCount; j++) {
                if (seats[i][j].isOccupied()) {
                    totalReserveNum++;
                }
            }
        }
        return totalReserveNum;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}