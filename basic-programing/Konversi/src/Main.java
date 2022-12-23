public class Main {
    public static void main(String[] args) {

        // input
        int studentScore = 80;
        String score = "";

        // Process: Your Solution Code Here
        if (studentScore >= 80 && studentScore <= 100) {
            score = "A";
        } else if (studentScore >= 65 && studentScore <= 79 ){
            score = "B+";
        } else if ( studentScore >= 50 && studentScore <= 64) {
            score = "B";
        } else if (studentScore >= 35 && studentScore <= 49) {
            score = "C";
        } else if (studentScore >= 0 && studentScore <= 34){
            score = "D";
        } else {
            score = "Invalid";
        }

        System.out.println(score);
    }
}
