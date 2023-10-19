package Summary131023.Case;

import java.util.*;

public class OminousArrays {

    public static void main(String[] args) {

        Random r = new Random();
        int arrLength = r.nextInt(1, 5) * 2;
        int arrCount = r.nextInt(7);
        System.out.println("Deep inside her bog hideout, a malevolent witch" +
                " is brewing an evil concoction ");
        System.out.println("of " + arrCount + " ominous arrays," +
                " each measured to be exactly " + arrLength + " elements long with devilish accuracy...");
        int[][] arrayOfArrays = new int[arrCount][];
        for (int i = 0; i < arrCount; i++) {
            int[] addedArray = new int[arrLength];
            arrayOfArrays[i] = populateArray(addedArray);
        }
        System.out.println("==========================");
        System.out.println("The arrays brewed by the evil-intending witch are ominous indeed. These are");
        for (int i = 0; i < arrCount; i++) {
            System.out.println("Array " + (i+1) + ": " + Arrays.toString(arrayOfArrays[i]));
        }
        System.out.println("==========================");
        List<Integer> ominousList = new ArrayList<>();
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                ominousList.add(arrayOfArrays[i][j]);
            }
        }
        System.out.println("A mandrake herb, collected by the evil witch from under a hanged man on the 3rd day,");
        System.out.println("has helped her stir these arrays into a tantalising (and ominous!) list...");
        ominousList.sort(Comparator.naturalOrder());
        for (int i = 0; i < ominousList.size(); i++) System.out.printf(ominousList.get(i) + " ");
        System.out.println();
        System.out.println("==========================");
        System.out.println("Tears of a dead virgin have helped the blasphemous witch");
        System.out.println("split the ominous list into two chilling lists of odds and evens!");
        List<Integer> oddsList = new ArrayList<>();
        List<Integer> evensList = new ArrayList<>();
        for (int i = 0; i < ominousList.size(); i++) {
            if (ominousList.get(i) % 2 == 0) {
                evensList.add(ominousList.get(i));
            } else {
                oddsList.add(ominousList.get(i));
            }
        }
        System.out.println("Odd numbers are: " + oddsList);
        System.out.println("Even numbers are: " + evensList);
        System.out.println("==========================");
        System.out.println("The witch is nearing completion... If everything is right, her potion");
        System.out.println("will make all cadavers raise their rotting limbs from all local graveyards");

        List<Integer> auxiliary = new ArrayList<>();
        int loopCounter = ominousList.size() + Math.abs(oddsList.size() - evensList.size());
        // здесь собственно слияние в нужный набор данных
        for (int i = 0; i < loopCounter; i++) {
            int oneBeingAdded = -1;
            if (i % 2 == 0) {
                if (!evensList.isEmpty()) {
                    oneBeingAdded = popSimulation(evensList);
                } else if (!oddsList.isEmpty()) loopCounter++;
            } else {
                if (!oddsList.isEmpty()) {
                oneBeingAdded = popSimulation(oddsList);
                } else if (!evensList.isEmpty()) loopCounter++;
            }
           auxiliary.add(oneBeingAdded);

        }
        int[] result = new int[auxiliary.size()];
        for (int i = 0; i < auxiliary.size(); i++) {
            result[i] = auxiliary.get(i);
        }

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("==========================");
        // Клепаем строку для печати
        int daemonCounter = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < result.length; i++) {
            if (result[i] == -1) {
                sb.append("DAEMON!, ");
                daemonCounter++;
            } else {
                sb.append(result[i]).append(", ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        String output = sb.toString();

        if (daemonCounter == 0) {
            System.out.println("The witch stroke a perfect match and succeeded in her ominous endeavour");
            System.out.println("of raising the local dead from their graves! Just look at the perfect spell she came up with!");

        } else {
            String postfix = "";
            if (daemonCounter != 1) postfix = "s";
            System.out.println("Oh no! The witch's arrays turned out to be unbalanced, and she has summoned");
            System.out.println(daemonCounter + " terrible daemon" + postfix + " from the Hell itself!");
            System.out.println("Just look at what came up!");
        }
        System.out.println(output);
        System.out.println();
        System.out.println("And that concludes this evening's witching hour :)");

    }

    public static int[] populateArray (int[] array) {
        Random evilNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = evilNumber.nextInt(1, 101);
        }
        return array;
    }

    public static Integer popSimulation (List<Integer> ominousList) {
        Integer returnable = ominousList.get(0);
        ominousList.remove(0);
        return returnable;
    }


 }
