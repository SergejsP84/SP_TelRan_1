package Summary131023.Classtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChessTask {
    public static void main(String[] args) {
        List<int[][]> queensList = new ArrayList<>();
        List<int[][]> busyFields = new ArrayList<>();
        List<int[][]> kingList = new ArrayList<>();
        Random r = new Random();
        int kingPosition1 = r.nextInt(8);
        int kingPosition2 = r.nextInt(8);
        int[][] kingPosition = new int[1][2];
        kingPosition[0][0] = kingPosition1;
        kingPosition[0][1] = kingPosition2;
        System.out.println("Created a King");
        busyFields.add(kingPosition);
        kingList.add(kingPosition);
        int numberOfQueens = r.nextInt(2, 6);
        System.out.println("Created " + numberOfQueens + " Queens");
        for (int i = 0; i < numberOfQueens; i++) {
            int queenPosition1, queenPosition2;
            int[][] queenPosition;
            boolean validPosition = false;
            while (!validPosition) {
                queenPosition1 = r.nextInt(8);
                queenPosition2 = r.nextInt(8);
                queenPosition = new int[1][2];
                queenPosition[0][0] = queenPosition1;
                queenPosition[0][1] = queenPosition2;
                if (!isOccupied(queenPosition, busyFields)) {
                    queensList.add(queenPosition);
                    busyFields.add(queenPosition);
                    validPosition = true;
                }
            }
        }
        paintBoard(queensList, kingList);
        checkIfThreatened(queensList, kingList);
    }

    private static boolean isOccupied(int[][] position, List<int[][]> busyFields) {
        for (int[][] occupiedPosition : busyFields) {
            if (Arrays.deepEquals(occupiedPosition, position)) return true;
        }
        return false;
    }

    public static void paintBoard(List<int[][]> queensList, List<int[][]> kingList) {
        char[][] field = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) field[i][j] = '-';
        }
        for (int[][] kingPosition : kingList) {
            field[kingPosition[0][0]][kingPosition[0][1]] = 'K';
        }

        for (int[][] queenPosition : queensList) {
            field[queenPosition[0][0]][queenPosition[0][1]] = 'Q';
        }
        System.out.println("   A B C D E F G H");
        int iteratorAuxilia = 1;
        for (int i = 0; i < 8; i++) {
            String space = "  ";
            System.out.print(iteratorAuxilia + space);
            for (int j = 0; j < 8; j++) {
                System.out.print(field[i][j] + " ");
            }
            iteratorAuxilia++;
            System.out.println();
        }
    }

    public static void checkIfThreatened(List<int[][]> queensList, List<int[][]> kingList) {
        int checkCounter = 0;
        // горизонталь
        for (int[][] queen : queensList) {
            int queenRow = queen[0][0];
            int kingRow = kingList.get(0)[0][0];
            if (queenRow == kingRow) {
                checkCounter++;
            }
        }
        // вертикаль
        for (int[][] queen : queensList) {
            int queenColumn = queen[0][1];
            int kingColumn = kingList.get(0)[0][1];
            if (queenColumn == kingColumn) {
                checkCounter++;
            }
        }
        // диагональ
        for (int[][] queen : queensList) {
            int queenRow = queen[0][0];
            int queenColumn = queen[0][1];
            int kingRow = kingList.get(0)[0][0];
            int kingColumn = kingList.get(0)[0][1];
            int rowDifference = Math.abs(queenRow - kingRow);
            int columnDifference = Math.abs(queenColumn - kingColumn);
            if (rowDifference == columnDifference) {
                checkCounter++;
            }
        }

        if (checkCounter == 0) {
            System.out.println("The lucky King has escaped all the evil Queens!");
        } else if (checkCounter == 1) {
            System.out.println("Watch out! There is a pesky Queen out there to get our King!");
        } else {
            System.out.println("Oh no! The poor King is under attack by " + checkCounter + " enraged Queens at once!");
        }
    }

}
