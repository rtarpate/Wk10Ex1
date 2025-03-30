
public class VotingProgram {

    //creates stoarge for votes
    static Map<String, Integer> votes = new HashMap<>();


    public static void main(String[] args) {
        //decalvrs canadites
        String can1 = "Trump";
        String can2 = "Kamala";
        String can3 = "Kenny";

        //decalvers vairble
        int choice = 0;

        //vote count
        votes.put(can1, 0);
        votes.put(can2, 0);
        votes.put(can3, 0);

        //creates scanner
        Scanner myObj = new Scanner(System.in);

        //creates loop
        while (true) {
            //promt user input
            System.out.println("Who do you vote for? 1 for " + can1 + ", 2 for " + can2 + ", 3 for " + can3 + ", 4 for reset votes");

            //collect user input
            choice = myObj.nextInt();
            myObj.nextLine(); // Consume the newline character

            //switch for user input
            switch (choice) {
                case 1:
                    castVote(can1);
                    break;
                case 2:
                    castVote(can2);
                    break;
                case 3:
                    castVote(can3);
                    break;
                case 4:
                    resetVotes();
                    break;
                default:
                    break;
            }
        }
    }

    //process to add for candiante
    static void castVote(String candidateName) {
        votes.put(candidateName, votes.get(candidateName) + 1);
        displayResults();
        System.out.println();
    }

    //process to display results
    static void displayResults() {
        for (Map.Entry<String, Integer> vote : votes.entrySet()) {
            System.out.println(vote.getKey() + " " + vote.getValue());
        }
        System.out.println();
    }

    //process to reset votes
    static void resetVotes() {
        Map<String, Integer> newVotes = new HashMap<>();
        for (Map.Entry<String, Integer> vote : votes.entrySet()) {
            newVotes.put(vote.getKey(), 0);
        }
        votes = newVotes;
        displayResults();
        System.out.println();
    }
}