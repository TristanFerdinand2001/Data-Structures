package Practical11;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Talk implements Comparable<Talk> {
    private int talkId;
    private String speaker;
    private String title;
    private LocalDateTime startTime;

    public Talk(int talkId, String speaker, String title, String startTime) {
        this.talkId = talkId;
        this.speaker = speaker;
        this.title = title;
        this.startTime = LocalDateTime.parse(startTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
    
    public LocalDateTime getStartTime() {
        return startTime;
    }
    
    /// Human-friendly representation
    @Override
    public String toString() {
        return "Talk ID: " + talkId + ", Speaker: " + speaker + ", Title: " + title + ", Start Time: " + startTime;
    }

    @Override
    public int compareTo(Talk time) {
        return startTime.compareTo(time.startTime);
    }


    //Getters and Setters
    public void setTalkId(int talkId) {
        this.talkId = talkId;
    }

    public int getTalkId() {
        return talkId;
    }


    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}

