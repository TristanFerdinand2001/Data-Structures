package Practical12;
import java.util.*;

public class Paper {
    private int id;
    private String title;
    private LinkedList<Review> reviewList;

    public Paper(int id, String title) {
        this.id = id;
        this.title = title;
        this.reviewList = new LinkedList<>();

    }

    public void submitReview(Review review) {
        // Check review is not already submitted
        if (!reviewList.contains(review)) {
            reviewList.add(review); // Add review to the list
            Collections.sort(reviewList); // Sort list after addition
        } else {
            // Notify if the review has already been submitted
            System.out.println("Review already submitted by " + review.getReviewer());
        }
    }

    public void updateReview(Review updatedReview) {
         // Find the review to update
        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).getId() == updatedReview.getId()) {
                reviewList.set(i, updatedReview); // Update the review
                Collections.sort(reviewList); // Sort the list after update
            }
        }
    }

    public void retractReview(int reviewId) {
        // Find the review by its id
        for (Review review : reviewList) {
            if (review.getId() == reviewId) {
                reviewList.remove(review); /// Remove the review from the list
                Collections.sort(reviewList); // Sort the list after removal
            }
        }
    }

    ///Print reviews for each paper
    public void printReviews() {
        for (Review review : reviewList) {
            System.out.println(review);
        }
    }


    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = (LinkedList<Review>) reviewList;
    }
}


