package Assignment2;

//Java Program for the Birthday problem
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class BirthdayProblem {

    //Function to get a random birthday from the possible 365 birthdays
    public static int getRandomBirthday()
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(0, 366);
    }

    //Function to add birthdays of all the n people in a list
    public static List generateBirthdays( int n ) {
        List<Integer> birthdays = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int randomBirthday = getRandomBirthday();
            birthdays.add(randomBirthday);
        }
        return birthdays;
    }

    //Function to check coincidence in birthdays
    public static boolean aloc( List<Integer> birthdays ) {
        Set<Integer> uniqueBirthdays = new HashSet<>();

        for (int x : birthdays)
            uniqueBirthdays.add(x);

        int num_birthdays = birthdays.size();
        int num_unique_birthdays = uniqueBirthdays.size();

        boolean has_coincidence = (num_birthdays != num_unique_birthdays);

        return  has_coincidence;
    }

    //Function to calculate the probability
    public static double estimate(int n, int simulation) {
        int num = 0;

        for (int i = 0; i < simulation; i++) {
            List<Integer> birthdays = generateBirthdays(n);
            boolean has_coincidence = aloc(birthdays);

            if (has_coincidence)
                num += 1;
        }
            double probability = (double) num / (double) simulation;

            return probability;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, simulation;
        n = sc.nextInt();
        simulation = sc.nextInt();
        System.out.println(estimate(n, simulation));
    }
}
