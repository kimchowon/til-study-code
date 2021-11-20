package solid.ocp.wrong;

/**
 * 성적표
 */
public class GradeCard {

    private long grade;

    public GradeCard(long grade) {
        this.grade = grade;
    }

    public void print() {
        System.out.println("grade is " + grade);
    }
}
