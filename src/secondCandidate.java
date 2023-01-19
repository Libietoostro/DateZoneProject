public class secondCandidate extends Candidate {
    private final boolean divorced;
    private final boolean loveParties;


    public secondCandidate(String firstName, String lastName, int age, int height, int weight) {
        super(firstName, lastName, age, height, weight);
        this.divorced = true;
        this.loveParties = false;
    }

    public boolean isDivorced() {
        return divorced;
    }

    public boolean isLoveParties() {
        return loveParties;
    }


    @Override
    public String toString() {
        String one;
        String two;

        if (divorced) {
            one = "I am divorced";
        } else {
            one = "I am spinster";
        }

        if (loveParties) {
            two = "I love parties";
        } else {
            two = "I don't like parties";
        }

        return super.toString() + "\n" + one + "\n" + two;
    }
}
