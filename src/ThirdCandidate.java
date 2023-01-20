public class ThirdCandidate extends Candidate {
    private final boolean ownHouse;


    private final boolean motivationLove;

    public ThirdCandidate(String firstName, String lastName, int age, int height, int weight) {
        super(firstName, lastName, age, height, weight);
        this.ownHouse = true;
        this.motivationLove = true;
    }

    public boolean isOwnHouse() {
        return ownHouse;
    }

    public boolean isMotivationLove() {
        return motivationLove;
    }


    @Override
    public String toString() {
        String one;
        String two;

        if (ownHouse) {
            one = "I have own house";
        } else {
            one = "I have rented apartment";
        }

        if (motivationLove) {
            two = "My motivation is to find true love";
        } else {
            two = "I want to make friends with someone";
        }

        return super.toString() + "\n" + one + "\n" + two;
    }
}
