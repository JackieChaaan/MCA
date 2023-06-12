// Student interface
interface Student {
    String getName();
    int getAcademicScore();
}

// Sports interface
interface Sports {
    int getSportsScore();
}

// Result class implementing Student and Sports interfaces
class Result implements Student, Sports {
    private String name;
    private int academicScore;
    private int sportsScore;

    public Result(String name, int academicScore, int sportsScore) {
        this.name = name;
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }

    public String getName() {
        return name;
    }

    public int getAcademicScore() {
        return academicScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }

    public void displayScores() {
        System.out.println("Name: " + getName());
        System.out.println("Academic Score: " + getAcademicScore());
        System.out.println("Sports Score: " + getSportsScore());
    }
}

// Main class
public class Main14 {
    public static void main(String[] args) {
        Result result = new Result("John", 85, 90);
        result.displayScores();
    }
}

