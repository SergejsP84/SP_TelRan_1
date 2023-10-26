package LuhnCheckerAttempt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @GetMapping("/")
    public String home() {
        return "index page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/checkLuhn")
    public String checkLuhn(@RequestParam("number") String number) {
        boolean isLuhnValid = checkLuhnValidity(processInputString(number));
        if (isLuhnValid) {
            return "The number " + number + " is Luhn-valid!";
        } else {
            return "Sorry, the number " + number + " is not Luhn-valid.";
        }
    }


    public static List<Integer> processInputString(String input) {
        char[] processing = input.toCharArray();
        List<Character> digitsOnly = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (char c : processing) {
            if (c == '0' || c == '1' || c == '2' || c == '3'
                    || c == '4' || c == '5' || c == '6'
                    || c == '7' || c == '8' || c == '9') {
                digitsOnly.add(c);
            }
        }
        if (digitsOnly.size() < 1) {
            System.out.println("The input contains no digits!");
        } else {
            System.out.println("The cleared list of digits is as follows:");
            System.out.printf(digitsOnly.get(0).toString());
            if (digitsOnly.size() > 1) {
                for (int i = 1; i < digitsOnly.size(); i++) {
                    System.out.printf("-" + digitsOnly.get(i).toString());
                }
                System.out.println();
            }
            for (Character character : digitsOnly) {
                output.add(Integer.parseInt(String.valueOf(character)));
            }
        }
        return output;
    }

    public static boolean checkLuhnValidity(List<Integer> input) {
        if (input.size() < 1) return false;
        boolean valid = false;
        List<Integer> processedList = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (i % 2 == 0) {
                if (input.get(i) * 2 < 10) {
                    processedList.add(input.get(i) * 2);
                } else {
                    processedList.add(input.get(i) * 2 - 9);
                }
            }
            else {
                processedList.add(input.get(i));
            }
        }
        int checkSum = 0;
        for (Integer digit : processedList) {
            checkSum += digit;
        }
        if (checkSum % 10 == 0) valid = true;
        return valid;
    }

}

