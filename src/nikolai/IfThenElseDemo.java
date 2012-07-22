package nikolai;

public class IfThenElseDemo {
    public static void main(String[] args) {
        int points = 82;
        char grade;

        if (points >= 90) {
            grade = 'A';
        } else if (points >= 80) {
            grade = 'B';
        } else if (points >= 70) {
            grade = 'C';
        } else if (points >= 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
    }
}
