package Practical12;

public class Review implements Comparable<Review> {
    private int id;
    private String reviewer;
    private int score;
    private int confidence;
    private String summary;

    public Review(int id, String reviewer, int score, int confidence, String summary) {
        this.id = id;
        this.reviewer = reviewer;
        this.score = score;
        this.confidence = confidence;
        this.summary = summary;
    }

    // Compare based on reviews score
    @Override
    public int compareTo(Review otherReview) {
        return Integer.compare(otherReview.getScore(), this.getScore());
    }

    // Human-friendly representation
    @Override
    public String toString() {
        return "Review [ id=" + id + ", reviewer=" + reviewer + ", score=" + score + ", confidence=" + confidence + ", summary=" + summary + " ]";
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
