package solid.ocp.proper;

/**
 * 성적표
 */
public class GradeCard implements StudentInfo{

    private long grade;

    public GradeCard(long grade) {
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println("grade is " + grade);
    }
}
