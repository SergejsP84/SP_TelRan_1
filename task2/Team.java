package Summary220923.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;


public class Team<S extends Participant> {
    private String name;
    private List<Participant> participantList = new ArrayList<>();
    private int currentScore = 0;

    public int getCurrentScore() {
        return currentScore;
    }

    public static class TeamComparator implements Comparator<Team<? extends Participant>> {
        @Override
        public int compare(Team<? extends Participant> team1, Team<? extends Participant> team2) {
            return Integer.compare(team2.getCurrentScore(), team1.getCurrentScore());
        }
    }

    public String getName() {
        return name;
    }

    public void increaseScore (Team<S> team, int increase) {
        team.currentScore += increase;
    }

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant participant) {
        participantList.add(participant);
        System.out.println("Participant [" + participant + "] was added to the team [" + name + "]");
    }

    public void addNewStudent(Student student) {
        participantList.add(student);
        System.out.println("Student [" + student + "] was added to the team [" + name + "]");
    }

    public void addNewAdult(Adult adult) {
        participantList.add(adult);
        System.out.println("Adult [" + adult + "] was added to the team [" + name + "]");
    }

    public void addNewPupil(Pupil pupil) {
        participantList.add(pupil);
        System.out.println("Pupil [" + pupil + "] was added to the team [" + name + "]");
    }

    public String generateRandomName() {
        String name = new String();
        String[] namePool = {
                "Alice", "Alan", "Andrew", "Ash", "Jack", "John", "Jill", "James", "Kenny", "Kevin", "Kirk", "Kyle",
                "George", "Gilbert", "Gary", "Gillome", "Harold", "Hunter", "Henry", "HIllary", "Nick", "Norman", "Nancy", "Naomi",
                "Stanley", "Sydney", "Stewart", "Donald", "Deborah", "Dean", "Tiffany", "Thomas", "Theodore", "Trevor"
        };
        Random random = new Random();
        name = namePool[random.nextInt(0, namePool.length)];
        return name;
    }

    public Team<Student> generateStudentTeam(String name, int quantity) {
        Team<Student> studentTeam = new Team<>(name);
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            String studentName = generateRandomName();
            int randomAge = 18 + random.nextInt(8);
            Student student = new Student(studentName, randomAge);
            studentTeam.addNewStudent(student);
        }
        return studentTeam;
    }

    public Team<Adult> generateAdultTeam(String name, int quantity) {
        Team<Adult> adultTeam = new Team<>(name);
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            String adultName = generateRandomName();
            int randomAge = 26 + random.nextInt(30);
            Adult adult = new Adult(adultName, randomAge);
            adultTeam.addNewAdult(adult);
        }
        return adultTeam;
    }

    public Team<Pupil> generatePupilTeam(String name, int quantity) {
        Team<Pupil> pupilTeam = new Team<>(name);
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            String pupilName = generateRandomName();
            int randomAge = 7 + random.nextInt(11);
            Pupil pupil = new Pupil(pupilName, randomAge);
            pupilTeam.addNewPupil(pupil);
        }
        return pupilTeam;
    }

//    public void playGroupTournament

    public void playWith(Team<? extends Participant> team) {
        String winnerName;
        Random random = new Random();
        if (this.getClass() != team.getClass()) {
            System.out.println("Age group mismatch! The game is cancelled!");
            return;
        }
        int teamLeftScore = random.nextInt(0, 10);
        int teamRightScore = random.nextInt(0, 10);
        System.out.println("An exciting game between " + this.name + " and " + team.name + "!");
        System.out.println(this.name + " scores " + teamLeftScore + " points!");
        System.out.println(team.name + " scores " + teamRightScore + " points!");
        if(teamLeftScore > teamRightScore) {
            winnerName = this.name;
            System.out.println(winnerName + " wins! Its overall score goes up by " + (teamLeftScore - teamRightScore) + "!");
            this.currentScore += (teamLeftScore - teamRightScore);
        } else if (teamLeftScore < teamRightScore) {
            winnerName = team.name;
            System.out.println(winnerName + " wins! Its overall score goes up by " + (teamRightScore - teamLeftScore) + "!");
            team.currentScore += (teamRightScore - teamLeftScore);
        }
        else {
            System.out.println("The game is a draw!");
            System.out.println("Both teams gain one point!");
            this.currentScore += 1;
            team.currentScore += 1;
        }
        System.out.println("=======================================");
    }
}