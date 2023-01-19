import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        application();


    }

    public static void application() {
        ArrayList<Boolean> additionalInformation = new ArrayList<>();
        ArrayList<Candidate> listCandidates = new ArrayList<>();
        User user = new User();

        firstCandidate firstCandidate = new firstCandidate("Jan", "Kowalski", 26, 190, 100);
        secondCandidate secondCandidate = new secondCandidate("Piotr", "Nowak", 35, 180, 100);
        thirdCandidate thirdCandidate = new thirdCandidate("Alan", "Kwiecinski", 45, 175, 90);
        fourthCandidate fourthCandidate = new fourthCandidate("Joanna", "Kwiatek", 55, 170, 80);
        fifthCandidate fifthCandidate = new fifthCandidate("Katarzyna", "Cichopek", 30, 170, 100);
        sixthCandidate sixthCandidate = new sixthCandidate("Lena", "Pojasek", 40, 165, 70);

        listCandidates.add(firstCandidate);
        listCandidates.add(secondCandidate);
        listCandidates.add(thirdCandidate);
        listCandidates.add(fourthCandidate);
        listCandidates.add(fifthCandidate);
        listCandidates.add(sixthCandidate);

        additionalInformation.add(firstCandidate.isOwnBusiness());
        additionalInformation.add(firstCandidate.isLoveAnimals());
        additionalInformation.add(secondCandidate.isDivorced());
        additionalInformation.add(secondCandidate.isLoveParties());
        additionalInformation.add(thirdCandidate.isOwnHouse());
        additionalInformation.add(thirdCandidate.isMotivationLove());
        additionalInformation.add(fourthCandidate.isStableRelationship());
        additionalInformation.add(fourthCandidate.isHaveChildren());
        additionalInformation.add(fifthCandidate.isSmoking());
        additionalInformation.add(fifthCandidate.isItalianCuisine());
        additionalInformation.add(sixthCandidate.isHaveAnimals());
        additionalInformation.add(sixthCandidate.isStudentStatus());


        CandidatesList candidatesList = presentationOfCandidates(listCandidates);
        welcomeDateZone();
        user.survey();
        userReferences(user);
        int[] points = pointsPresentation(additionalInformation, user, candidatesList);
        winner(points, candidatesList);


    }

    public static CandidatesList addingCandidates(ArrayList<Candidate> listCandidates) {
        CandidatesList candidatesList = new CandidatesList();

        for (int i = 0; i < 6; i++) {
            candidatesList.getCandidatesList().add(listCandidates.get(i));
        }

        return candidatesList;
    }


    public static CandidatesList refillingCandidates(ArrayList<Candidate> candidatesList) {
        CandidatesList listCandidates = addingCandidates(candidatesList);
        String gender;
        String hairColor;
        String hobby;

        for (int i = 0; i < 6; i++) {
            gender = listCandidates.getCandidatesList().get(i).genderCandidate();
            listCandidates.getCandidatesList().get(i).setGender(gender);

            hairColor = listCandidates.getCandidatesList().get(i).hairColorCandidate();
            listCandidates.getCandidatesList().get(i).setHairColor(hairColor);

            hobby = listCandidates.getCandidatesList().get(i).hobbyCandidate();
            listCandidates.getCandidatesList().get(i).setHobby(hobby);
        }

        return listCandidates;
    }


    public static CandidatesList presentationOfCandidates(ArrayList<Candidate> candidatesList) {
        CandidatesList listCandidates = refillingCandidates(candidatesList);

        for (int i = 0; i < 6; i++) {
            System.out.println(listCandidates.getCandidatesList().get(i));
            System.out.println();
        }


        return listCandidates;
    }


    public static void welcomeDateZone() {
        System.out.print("""
                Welcome to Date Zone  dating site.
                Are you looking for your soulmate?
                This is the perfect place for you !!!
                 We have prepared 6-th candidates for you !!!
                 Are you ready?
                                
                """);
    }

    public static void userReferences(User user) {
        System.out.println(user);
    }

    public static int scoringSystem(CandidatesList listCandidates, User user, int candidateNumber, ArrayList<Boolean> additionalInformation) {
        int[] ageRange = user.getAge();
        int points = 0;
        Candidate candidate = listCandidates.getCandidatesList().get(candidateNumber);


        if (candidate.getAge() >= ageRange[0] && candidate.getAge() <= ageRange[1]) {
            points++;
        }

        int[] heightRange = user.getHeight();

        if (candidate.getHeight() >= heightRange[0] && candidate.getHeight() <= heightRange[1]) {
            points++;
        }

        int[] weightRange = user.getWeight();

        if (candidate.getWeight() >= weightRange[0] && candidate.getWeight() <= weightRange[1]) {
            points++;
        }

        String hairColor = user.getHairColor();
        if (candidate.getHairColor().equals(hairColor)) {
            points++;
        }

        String hobby = user.getHobby();
        if (candidate.getHobby().equals(hobby)) {
            points++;
        }


        points = additionalPoints(candidateNumber, points, candidate, user, additionalInformation);

        return points;

    }

    public static int additionalPoints(int candidateNumber, int points, Candidate candidate, User user, ArrayList<Boolean> additionalInformation) {
        int positionInArray = 0;

        switch (candidateNumber) {
            case 1 -> positionInArray = 2;

            case 2 -> positionInArray = 4;

            case 3 -> positionInArray = 6;

            case 4 -> positionInArray = 8;

            case 5 -> positionInArray = 10;


        }


        switch (candidateNumber) {
            case 0 -> {
                if (additionalInformation.get(positionInArray) && user.getBusiness().equals("I prefer someone to run their own business")) {
                    points++;
                }
                positionInArray++;
                if (additionalInformation.get(positionInArray) && user.getAnimals().equals("I love animals")) {
                    points++;
                }
            }
            case 1 -> {
                if (additionalInformation.get(positionInArray) && user.getDivorced().equals("I don't mind if someone is divorced, it's even better because I am too")) {
                    points++;
                }
                positionInArray++;
                if (additionalInformation.get(positionInArray) && user.getParties().equals("I love party")) {
                    points++;
                }
            }
            case 2 -> {
                if (additionalInformation.get(positionInArray) && user.getHouse().equals("If someone has their own house it is advantage")) {
                    points++;
                }
                positionInArray++;
                if (additionalInformation.get(positionInArray) && user.getMotivation().equals("My motivation is love")) {
                    points++;
                }
            }
            case 3 -> {
                if (additionalInformation.get(positionInArray) && user.getRelationship().equals("I really want to be in stable relationship")) {
                    points++;
                }
                positionInArray++;
                if (additionalInformation.get(positionInArray) && user.getChildren().equals("I don't mind if someone has children, it's even better because I have as well")) {
                    points++;
                }
            }
            case 4 -> {
                if (additionalInformation.get(positionInArray) && user.getSmoking().equals("I do not mind. It is even better because I smoke cigarettes as well")) {
                    points++;
                }
                positionInArray++;
                if (additionalInformation.get(positionInArray) && user.getItalianCuisine().equals("I love italian cuisine")) {
                    points++;
                }
            }
            case 5 -> {
                if (additionalInformation.get(positionInArray) && user.getHaveAnimals().equals("I love animals and I have two dogs")) {
                    points++;
                }
                positionInArray++;
                if (additionalInformation.get(positionInArray) && user.getStudentStatus().equals("I don't mind if someone is a student, it's even better because I am as well")) {
                    points++;
                }
            }
        }
        if (user.getOrientation().equals("I am interested in men") && candidate.getGender().equals("Female")) {
            points = 0;
        }

        if (user.getOrientation().equals("I am interested in women") && candidate.getGender().equals("Male")) {
            points = 0;
        }

        return points;
    }

    private static int[] pointsPresentation(ArrayList<Boolean> additionalInformation, User user, CandidatesList candidatesList) {
        int[] points = new int[6];

        for (int i = 0; i < 6; i++) {
            points[i] = scoringSystem(candidatesList, user, i, additionalInformation);
        }

        for (int j = 0; j < points.length; j++) {
            System.out.println(candidatesList.getCandidatesList().get(j).getFirstName() + " " + candidatesList.getCandidatesList().get(j).getLastName() + " scored: " + points[j] + " points");
        }

        return points;
    }

    private static void winner(int[] points, CandidatesList candidatesList) {
        int max = Integer.MIN_VALUE;
        int numberOfMax = 0;
        int arrayPosition = 0;


        for (int point : points) {
            max = Math.max(max, point);
        }


        for (int point : points) {
            if (point == max) {
                numberOfMax++;
            }
        }
        int[] arrayIndex = new int[numberOfMax];
        for (int k = 0; k < points.length; k++) {
            if (points[k] == max) {
                arrayIndex[arrayPosition] = k;
                arrayPosition++;
            }
        }

        System.out.println("""

                We have found the best candidate/candidates for you!!!
                The winner is or winners are:
                """);

        for (int index : arrayIndex) {

            System.out.println(candidatesList.getCandidatesList().get(index).getFirstName() + " " + candidatesList.getCandidatesList().get(index).getLastName() + " with result: " + max + " points");

        }

    }
}
