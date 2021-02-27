package Day_5;

public class CandidateScore {
    public static void main(String[] args) {
        int age = 20;
        int javaScore = 90;

        if( (age >= 20 && age <= 30) && javaScore>=80 ){
            System.out.println(age*1.5 + javaScore*4.5);
        }
        else if ( (age >= 20 && age <= 30)  && javaScore < 80 ) {
            System.out.println(age*1.5 + javaScore*3.5);
        }
        else if (age > 30 && javaScore >=80) {
            System.out.println(age*1.1+javaScore*4.5);
        }
        else if (age > 30 && javaScore < 80) {
            System.out.println(age*1.1 + javaScore*3.5);
        }
        else {
            System.out.println("Please enter a valid age or java Score");
        }

    }
}
