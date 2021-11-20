package solid.ocp.proper;

/**
 * 출석부
 */
public class Attendance implements StudentInfo {

    private String attendanceYn;

    public Attendance(String attendanceYn) {
        this.attendanceYn = attendanceYn;
    }

    @Override
    public void print() {
        System.out.println("attendance is " + attendanceYn);
    }
}
