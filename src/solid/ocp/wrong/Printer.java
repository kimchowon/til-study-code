package solid.ocp.wrong;

/**
 * 학생 정보를 출력하는 클래스
 * 성적표, 출석부 등
 */
public class Printer {

    public void printAttendance(Attendance attendance) {
        attendance.print();
    }

    public void printGradeCard(GradeCard gradeCard) {
        gradeCard.print();
    }
}
