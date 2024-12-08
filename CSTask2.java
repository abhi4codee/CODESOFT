import java.util.Scanner;

public class CSTask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int[] subjectScores = new int[numberOfSubjects];
        String[] subjectNames = new String[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = sc.next();

            System.out.print("Enter the score obtained in " + subjectNames[i] + " (out of 100): ");
            subjectScores[i] = sc.nextInt();
        }

        int totalScore = calculateTotalScore(subjectScores);
        double averageMark = calculateAverageMark(totalScore, numberOfSubjects);
        String studentGrade = calculateGrade(averageMark);

        displayResults(totalScore, averageMark, studentGrade, subjectNames, subjectScores);
    }

    private static int calculateTotalScore(int[] subjectScores) {
        int totalScore = 0;
        for (int score : subjectScores) {
            totalScore += score;
        }
        return totalScore;
    }

    private static double calculateAverageMark(int totalScore, int numberOfSubjects) {
        return (double) totalScore / numberOfSubjects;
    }

    private static String calculateGrade(double averageMark) {
        if (averageMark >= 90) {
            return "A";
        } else if (averageMark >= 80) {
            return "B";
        } else if (averageMark >= 70) {
            return "C";
        } else if (averageMark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    private static void displayResults(int totalScore, double averageMark, String studentGrade, String[] subjectNames, int[] subjectScores) {
        System.out.println("\n----------RESULT----------");
        System.out.println("--------------------------");
        
        for (int i = 0; i < subjectNames.length; i++) {
            System.out.println(subjectNames[i] + ": " + subjectScores[i]);
        }
        System.out.println("Total Score: " + totalScore);
        System.out.printf("Average Mark: %.2f%%%n", averageMark);
        System.out.println("Grade: " + studentGrade);
    }
}
