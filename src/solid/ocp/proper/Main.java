package solid.ocp.proper;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Attendance attendance = new Attendance("Y");
        printer.print(attendance);

        GradeCard gradeCard = new GradeCard(80);
        printer.print(gradeCard);
    }
}
