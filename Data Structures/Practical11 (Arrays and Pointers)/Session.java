package Practical11;

public class Session {
    private final int sessionId;
    private final String location;
    private final Talk[] talkList;
    private int size;

    public Session(int sessionId, String location) {
        this.sessionId = sessionId;
        this.location = location;
        this.talkList = new Talk[4]; //Capacity for 4 talks
        this.size = 0;
    }


    public void scheduleTalk(Talk talk) {
    // Check if the talkList is already full
    if (size >= talkList.length) {
        System.out.println("Session " + sessionId + " is already full. Cannot schedule more talks.");
    }
    // Insert the new talk in ascending order based on start time
    int index = size;
    // Move talks to make room for the new talk while maintaining in ascending order
    while (index > 0 && talkList[index - 1].getStartTime().isAfter(talk.getStartTime())) {
        talkList[index] = talkList[index - 1];
        index--;
    }
    // Insert the new Talk at the correct position
    talkList[index] = talk;
    // Increment the size to reflect the addition
    size++;
    }


    public void cancelTalk(Talk talk) {
        /// Find the index of the talk to cancel
        int index = -1;
        for (int i = 0; i < size; i++) {
            // Check if the current talk matches the one to cancel
            if (talkList[i] != null && talkList[i].equals(talk)) {
                index = i; // Record the index of the talk to cancel
                break; // Exit once the talk is found
            }
        }
        // If the talk to cancel is found
        if (index >= 0) {
            /// Shift elements in the array to remove the canceled talk
            for (int i = index; i < size - 1; i++) {
                talkList[i] = talkList[i + 1];
            }
            size--; // Decrement the size to reflect the removal of the talk
        }
    }

    //Altered toString() for a human friendly representation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Session ID: ").append(sessionId).append(", Location: ").append(location).append("\n");
        for (Talk talk : talkList) {
            if (talk != null) {
                sb.append(talk).append("\n");
            }
        }
        return sb.toString();
    }
}

