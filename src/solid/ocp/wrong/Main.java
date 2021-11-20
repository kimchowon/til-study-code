package solid.ocp.wrong;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        // 프린터로 출석부 정보를 출력
        Attendance attendance = new Attendance("Y");
        printer.printAttendance(attendance);

        // 프린터로 성적표 정보를 출력
        GradeCard gradeCard = new GradeCard(80);
        printer.printGradeCard(gradeCard);
    }
}
