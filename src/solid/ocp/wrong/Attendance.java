package solid.ocp.wrong;

/**
 * 출석부
 */
public class Attendance {

    private String attendanceYn;

    public Attendance(String attendanceYn) {
        this.attendanceYn = attendanceYn;
    }

    public void print() {
        System.out.println("attendance is " + attendanceYn);
    }
}
