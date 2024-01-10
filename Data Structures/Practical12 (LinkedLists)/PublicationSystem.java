package Practical12;
import java.util.LinkedList;
import java.util.List;

public class PublicationSystem {
    public static void main(String[] args) {
        //Three papers
        Paper paper1 = new Paper(1, "Paper 1");
        Paper paper2 = new Paper(2, "Paper 2");
        Paper paper3 = new Paper(3, "Paper 3");

        // LinkedList for Reviews
        List<Review> reviews = new LinkedList<>();

        //Three reviews for paper 1
        reviews.add(new Review(1, " Harry",  6, 4, "Great paper"));
        reviews.add(new Review(2, " James",  7, 5, "Interesting work"));
        reviews.add(new Review(3, " Jim",  9, 3, "Excellent research"));
        //Three reviews for paper 2
        reviews.add(new Review(4, " Bob",   5,  3, " Nice try, please look over"));
        reviews.add(new Review(5, " Ilias",   7,  7, " Amazing paper"));
        reviews.add(new Review(6, " Tom",   4,  5, " Nice try, please look over"));
        //Three reviews for paper 3
        reviews.add(new Review(7, " Tim",  2,  9, " Good try, please revise"));
        reviews.add(new Review(8, " Jack",  5,  9, " Good paper"));
        reviews.add(new Review(9, " Ben",  3,  5, " Good Research, Look over"));

        //Submitting the reviews
        //Paper1
        paper1.submitReview(reviews.get(0));
        paper1.submitReview(reviews.get(1));
        paper1.submitReview(reviews.get(2));
        //Paper2
        paper2.submitReview(reviews.get(3));
        paper2.submitReview(reviews.get(4));
        paper2.submitReview(reviews.get(5));
        //Paper3
        paper3.submitReview(reviews.get(6));
        paper3.submitReview(reviews.get(7));
        paper3.submitReview(reviews.get(8));

        //Retracting reviews
        paper3.retractReview(1);
        paper3.retractReview(2);
        paper3.retractReview(3);

        // Printing reviews for each paper
        System.out.println("Reviews for Paper 1:");
        paper1.printReviews();

        System.out.println("Reviews for Paper 2:");
        paper2.printReviews();

        System.out.println("Reviews for Paper 3:");
        paper3.printReviews();

        //Update Review
        paper1.updateReview(new Review(1," Harry",  6, 4, "Great paper!"));
        System.out.println("------------------------------------" +
                "------------------------------------\n");

        // Calculating 'Best Paper Award' based on weighted average score
        double weightedScore1 = calculateWeightedScore(paper1);
        double weightedScore2 = calculateWeightedScore(paper2);
        double weightedScore3 = calculateWeightedScore(paper3);
        // Assigning 'Best Paper Award'
        int bestPaperId = 0;
        double maxWeightedScore = Math.max(weightedScore1, Math.max(weightedScore2, weightedScore3));
        if (maxWeightedScore == weightedScore1) {
            bestPaperId = paper1.getId();
        } else if (maxWeightedScore == weightedScore2) {
            bestPaperId = paper2.getId();
        } else if (maxWeightedScore == weightedScore3) {
            bestPaperId = paper3.getId();
        }
        System.out.println("The Best Paper Award goes to Paper " + bestPaperId);
    }

    // Calculate weighted score for papers
    public static double calculateWeightedScore(Paper paper)  {
        List<Review> reviews = paper.getReviewList();
        double totalScore = 0;
        double totalConfidence = 0;
        for (Review review : reviews) {
            totalScore += review.getScore() * review.getConfidence();
            totalConfidence += review.getConfidence();
        }
        return totalScore / totalConfidence;
    }
}

