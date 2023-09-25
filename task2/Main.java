package Summary220923.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<Team<? extends Participant>> globalPool = new ArrayList<>();

    Team<Student> studentTeam1 = new Team<Student>("Скубенты 1").generateStudentTeam("Скубенты 1", 4);
    globalPool.add(studentTeam1);
    Team<Student> studentTeam2 = new Team<Student>("Скубенты 2").generateStudentTeam("Скубенты 2", 4);
    globalPool.add(studentTeam2);
    Team<Student> studentTeam3 = new Team<Student>("Скубенты 3").generateStudentTeam("Скубенты 3", 4);
    globalPool.add(studentTeam3);
    Team<Student> studentTeam4 = new Team<Student>("Скубенты 4").generateStudentTeam("Скубенты 4", 4);
    globalPool.add(studentTeam4);
    Team<Adult> adultTeam1 = new Team<Adult>("Олды 1").generateAdultTeam("Олды 1", 4);
    globalPool.add(adultTeam1);
    Team<Adult> adultTeam2 = new Team<Adult>("Олды 2").generateAdultTeam("Олды 2", 4);
    globalPool.add(adultTeam2);
    Team<Adult> adultTeam3 = new Team<Adult>("Олды 3").generateAdultTeam("Олды 3", 4);
    globalPool.add(adultTeam3);
    Team<Adult> adultTeam4 = new Team<Adult>("Олды 4").generateAdultTeam("Олды 4", 4);
    globalPool.add(adultTeam4);
    Team<Pupil> pupilTeam1 = new Team<Pupil>("Школие 1").generatePupilTeam("Школие 1", 4);
    globalPool.add(pupilTeam1);
    Team<Pupil> pupilTeam2 = new Team<Pupil>("Школие 2").generatePupilTeam("Школие 2", 4);
    globalPool.add(pupilTeam2);
    Team<Pupil> pupilTeam3 = new Team<Pupil>("Школие 3").generatePupilTeam("Школие 3", 4);
    globalPool.add(pupilTeam3);
    Team<Pupil> pupilTeam4 = new Team<Pupil>("Школие 4").generatePupilTeam("Школие 4", 4);
    globalPool.add(pupilTeam4);
    playTournament(globalPool);
    }

    public static void playTournament(List<Team<? extends Participant>> globalPool) {
        List<Team<Student>> allStudents = new ArrayList<>();
        List<Team<Adult>> allAdults = new ArrayList<>();
        List<Team<Pupil>> allPupils = new ArrayList<>();
        for (Team<? extends Participant> team : globalPool) {
            if (team.getParticipantList().get(0).getAge() > 17 && team.getParticipantList().get(0).getAge() < 26)
                allStudents.add((Team<Student>) team);
            else if (team.getParticipantList().get(0).getAge() > 25) allAdults.add((Team<Adult>) team);
            else if (team.getParticipantList().get(0).getAge() < 18) allPupils.add((Team<Pupil>) team);

        }
        System.out.println("Student teams:");
        for (Team<Student> element : allStudents) {
            System.out.println(element.getName());
        }
        System.out.println("Adult teams:");
        for (Team<Adult> element : allAdults) {
            System.out.println(element.getName());
        }
        System.out.println("Pupil teams:");
        for (Team<Pupil> element : allPupils) {
            System.out.println(element.getName());
        }

        playInGroup(allStudents);
        playInGroup(allAdults);
        playInGroup(allPupils);

        displayScores(allStudents);
        displayScores(allAdults);
        displayScores(allPupils);

    }

    public static void playInGroup(List<? extends Team<? extends Participant>> ageGroup) {
        for (int i = 0; i < ageGroup.size(); i++) {
            for (int j = i + 1; j < ageGroup.size(); j++) {
                ageGroup.get(i).playWith(ageGroup.get(j));
            }
        }
    }

    public static void displayScores(List<? extends Team<? extends Participant>> ageGroup) {
        Collections.sort(ageGroup, new Team.TeamComparator());
        System.out.println("Announcing the groundbreaking results of games played in the "
                + ageGroup.get(0).getParticipantList().get(0).getClass().getSimpleName() + " group!");
        String postfixAuxilia = "st";
        System.out.println("Winners:");
        for (int i = 0; i < 3; i++) {
            if (i == 1) postfixAuxilia = "nd";
            if (i == 2) postfixAuxilia = "rd";
            System.out.println((i + 1) + postfixAuxilia + " place: " + ageGroup.get(i).getName() + " with "
                    + ageGroup.get(i).getCurrentScore() + " points!");
        }
    }

    }

    