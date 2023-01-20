public class FourthCandidate extends Candidate {
    private final boolean stableRelationship;
    private final boolean haveChildren;


    public FourthCandidate(String firstName, String lastName, int age, int height, int weight) {
        super(firstName, lastName, age, height, weight);
        this.stableRelationship = true;
        this.haveChildren = true;
    }

    public boolean isStableRelationship() {
        return stableRelationship;
    }

    public boolean isHaveChildren() {
        return haveChildren;
    }


    @Override
    public String toString() {
        String one;
        String two;

        if (stableRelationship) {
            one = "I look for stable relationship";
        } else {
            one = "I do not look for stable relationship";
        }

        if (haveChildren) {
            two = "I have children";
        } else {
            two = "I do not have children";
        }

        return super.toString() + "\n" + one + "\n" + two;
    }
}
