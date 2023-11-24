package Summary241123;

import java.util.*;

public class SquaresBeOverlapping {

    public static void main(String[] args) {
        List<int[]> incomingList = new ArrayList<>();
        // для тестирования - раскомментить эту, закомментить следущую часть
        //        incomingList.add(new int[]{4, 4});
        //        incomingList.add(new int[]{2, 2});
        //        incomingList.add(new int[]{5, 3});
        //        incomingList.add(new int[]{6, 4});

        // генерируем квадраты
        Random r = new Random();
        int incomingListSize = r.nextInt(2, 7);
        System.out.println("Generating " + incomingListSize + " squares!");
        for (int i = 0; i < incomingListSize; i++) {
            int coordinateX = r.nextInt(-6, 7);
            int coordinateY = r.nextInt(-6, 7);
            incomingList.add(new int[]{coordinateX, coordinateY});
            System.out.println("Generated Square No. " + i + " at " + coordinateX + "," + coordinateY + "!");
        }


        System.out.println();
        System.out.println("==================");
        System.out.println();


        // делаем мапу со всеми возможными контактными координатами каждого квадрата
        Map<Integer, List<int[]>> globalMap = new HashMap<>();
        for(int i = 0; i < incomingList.size(); i++) {
            globalMap.put(i, getAllPoints(incomingList.get(i)));
        }

        // ещё одна мапа - здесь ключом будет строковое отображение конкретной точки координат из мапы globalMap,
        // в значение - номер квадрата, но так как их может быть несколько, приглось листом это всё
        Map<String, List<Integer>> allCoordinates = new HashMap<>();
        for (Map.Entry<Integer, List<int[]>> entry : globalMap.entrySet()) {
            for (int i = 0; i < 8; i++) {
                int[] point = entry.getValue().get(i);
                allCoordinates.computeIfAbsent(Arrays.toString(point), k -> new ArrayList<>()).add(entry.getKey());
            }
        }

        // печать результатов
        boolean anythingFound = false;
        for (Map.Entry<String, List<Integer>> entry : allCoordinates.entrySet()) {
            if (entry.getValue().size() > 1) {
                anythingFound = true;
                System.out.println("Squares " + entry.getValue() + " do overlap at point " + entry.getKey() + "!");
            }
        }
        if (!anythingFound) System.out.println("There are no overlapping squares here");
    }

    // получение всех возможных контактных точек квадрата
    public static List<int[]> getAllPoints(int[] item) {
        List<int[]> allPoints = new ArrayList<>();
        allPoints.add(new int[]{item[0] - 1, item[1] - 1});
        allPoints.add(new int[]{item[0] - 1, item[1]});
        allPoints.add(new int[]{item[0] - 1, item[1] + 1});
        allPoints.add(new int[]{item[0], item[1] - 1});
        allPoints.add(new int[]{item[0], item[1] + 1});
        allPoints.add(new int[]{item[0] + 1, item[1] - 1});
        allPoints.add(new int[]{item[0] + 1, item[1]});
        allPoints.add(new int[]{item[0] + 1, item[1] + 1});
        return allPoints;
    }

}
