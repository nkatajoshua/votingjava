import java.util.Scanner;

public class VotingSystem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] votes = new int[3];
    String[] candidates = {"Candidate A", "Candidate B", "Candidate C"};

    System.out.println("Welcome to the voting system!");

    for (int i = 0; i < 10; i++) {
      System.out.println("Enter your vote (1, 2, or 3):");
      int vote = input.nextInt();
      votes[vote - 1]++;
    }

    int winnerIndex = 0;
    for (int i = 1; i < 3; i++) {
      if (votes[i] > votes[winnerIndex]) {
        winnerIndex = i;
      }
    }

    System.out.println("Election Results:");
    for (int i = 0; i < 3; i++) {
      System.out.println(candidates[i] + ": " + votes[i] + " votes");
    }
    System.out.println("The winner is " + candidates[winnerIndex]);
  }
}

