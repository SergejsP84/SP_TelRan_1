package ElevatorsYetAgain;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random r1 = new Random(); // для кол-ва этажей
        Random r2 = new Random(); // для кол-ва лифтов
        Random r3 = new Random(); // начальный этаж пути
        Random r4 = new Random(); // конечный этаж пути
        int floorNumber = r3.nextInt(1, 10001); // потом поменять на рандомное значение
        int elevatorCount = r4.nextInt(10, 10001); // потом поменять на рандомное значение
        Elevator[] crazyElevators = new Elevator[elevatorCount]; // Массив лифтов

        // Создаём лифты
        for (int i = 0; i < elevatorCount; i++) {
            int depFloor = r3.nextInt(1, floorNumber);
            int arrFloor = r4.nextInt(depFloor, floorNumber + 1);
            while (arrFloor <= r4.nextInt(depFloor, floorNumber + 1)) {
                arrFloor = r4.nextInt(depFloor, floorNumber + 1);
                }
            crazyElevators[i] = new Elevator(depFloor, arrFloor, i+1);
        }

        // Для наглядности, потом закомментировать
//        System.out.println("Created " + elevatorCount + " elevators!");
//        for (int i = 0; i < crazyElevators.length; i++) {
//            System.out.println("Elevator " + (i+1) + " departs from floor " + crazyElevators[i].getDepartureFloor() +
//                    " and goes to floor " + crazyElevators[i].getArrivalfloor());
//        }
//        System.out.println();

        // Находим нижний возможный и верхний возможный этаж
        int bottomFloor = floorNumber - 1;
        int topFloor = 0;
        for (int i = 0; i < crazyElevators.length; i++) {
            if (crazyElevators[i].getDepartureFloor() < bottomFloor) bottomFloor = crazyElevators[i].getDepartureFloor();
            if (crazyElevators[i].getArrivalfloor() > topFloor) topFloor = crazyElevators[i].getArrivalfloor();
        }
        System.out.println("We are going to start from floor " + bottomFloor);
        System.out.println("In theory, we could reach as high as floor " + topFloor);

        // Устанавливаем все потенциальные точки начала пути и точки их прибытия
        int counterAuxilia1 = 0;
        for (int i = 0; i < crazyElevators.length; i++) {
            if (crazyElevators[i].getDepartureFloor() == bottomFloor) counterAuxilia1++;
        }
        Elevator[] validStartELevators = new Elevator[counterAuxilia1]; // все лифты, которые едут с нижнего этажа
        int counterAuxilia2 = 0;
        int[] elevatorNumbers = new int [counterAuxilia1];
        for (int i = 0; i < crazyElevators.length; i++) {
            if (crazyElevators[i].getDepartureFloor() == bottomFloor) {
                validStartELevators[counterAuxilia2] = crazyElevators[i];
                elevatorNumbers[counterAuxilia2] = i+1;
                counterAuxilia2++;
                }
            }

        // Для наглядности, потом закомментировать
        System.out.println();
        System.out.println("We have a total of " + counterAuxilia2 + " elevator(s) to start the journey with. These are:");
        for (int i = 0; i < validStartELevators.length; i++) {
            System.out.println("Elevator " + elevatorNumbers[i] + ", which starts from floor " + validStartELevators[i].getDepartureFloor()
                + " and stops at floor " + validStartELevators[i].getArrivalfloor());
        }

        // Создаём листы для возможных решений
        List<Integer> directTrip_elevatorNumber = new ArrayList<>();
        List<Elevator> brachingFurtherElevators = new ArrayList<>();
        List<Integer> branchingFurther_elevatorNumber = new ArrayList<>();
        List<Integer> branchingFurther_arrivesTo = new ArrayList<>();


        // Проверяем лифты начала пути на возможность ветвления
        for (int i = 0; i < validStartELevators.length; i++) {
            if (validStartELevators[i].getArrivalfloor() == topFloor) {
                directTrip_elevatorNumber.add(i+1);
                System.out.println("Elevator " + elevatorNumbers[i] + " gets us straight to the top floor"); // потом закомментировать
            }
            else {
//                System.out.println("Elevator " + validStartELevators[i].getElevatorNumber() + " gets us to floor " + validStartELevators[i].getArrivalfloor()); // потом закомментировать
                brachingFurtherElevators.add(validStartELevators[i]);
            }

        }

        System.out.println("Direct travel options: " + directTrip_elevatorNumber.toString()); // потом закомментировать
//        System.out.println("Branching elevator numbers: " + branchingFurther_elevatorNumber.toString() + ", arriving to " + branchingFurther_arrivesTo.toString()); // потом закомментировать

        // Сниппет на тот случай, если нету лифтов, которые прямо едут на врехний этаж, и нету ветвящихся лифтов - ни хрена нет, короче
        if (directTrip_elevatorNumber.isEmpty() && branchingFurther_elevatorNumber.isEmpty()) {
            int auxilia3 = 0;
            for (int i = 0; i < validStartELevators.length; i++) {
                if (validStartELevators[i].getArrivalfloor() > auxilia3) auxilia3 = validStartELevators[i].getArrivalfloor();
            }
            }
        shellForDOEOF(brachingFurtherElevators, crazyElevators);
        }


    public static List<Elevator> determineOtherElevatorsOnFloors (List<Elevator> branchingFurtherElevators, Elevator[] crazyElevators, int tripCount, Set<Elevator> visitedElevators) {

        if (branchingFurtherElevators.isEmpty()) {
            if (tripCount == 0) tripCount = 1;
            System.out.println();
            System.out.println("==============================================");
            System.out.println("The maximum number of trips we can do to reach the top possible floor is " + tripCount);
            return null;
        }
        tripCount++;
        List<Elevator> furtherElevatorOptions = new ArrayList<>();


            for (Elevator elevator : branchingFurtherElevators) {
                for (int i = 0; i < crazyElevators.length; i++) {
                    if (elevator.getArrivalfloor() == crazyElevators[i].getDepartureFloor() && !visitedElevators.contains(crazyElevators[i])) {
                        System.out.println("Elevator " + (i + 1) + " can continue upwards from floor " + elevator.getArrivalfloor() + "!"); // потом закомментить
                        furtherElevatorOptions.add(crazyElevators[i]);
                        visitedElevators.add(crazyElevators[i]);
                    }
                }
            }

        return determineOtherElevatorsOnFloors(furtherElevatorOptions, crazyElevators, tripCount, visitedElevators);
    }

    public static List<Elevator> shellForDOEOF (List<Elevator> branchingFurtherElevators, Elevator[] crazyElevators) {
        int counter = 0;
        Set<Elevator> visitedElevators = new HashSet<>();
        return determineOtherElevatorsOnFloors(branchingFurtherElevators, crazyElevators, counter, visitedElevators);
    }

    public static int getMaxListValue (List<Integer> listInQuestion) {
        int maxValue = 0;
        for (Integer number : listInQuestion) {
            if (number > maxValue) maxValue = number;
        }
        return maxValue;
    }

}
