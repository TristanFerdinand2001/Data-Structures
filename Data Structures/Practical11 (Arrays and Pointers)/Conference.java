package Practical11;

public class Conference {
    public static void main(String[] args) {
        //The sessions and their attributes
        Session session1 = new Session(1, "Room A");
        Session session2 = new Session(2, "Room B");
        Session session3 = new Session(3, "Room C");
        Session session4 = new Session(4, "Room D");

        //The Talks and their attributes for all different sessions
        //Room A Session 1
        Talk talk1 = new Talk(1, "Bob", "Talk 1", "2023-11-07T09:00:00");
        Talk talk2 = new Talk(2, "John", "Talk 2", "2023-11-07T10:00:00");
        Talk talk3 = new Talk(3, "Harry", "Talk 3", "2023-11-07T11:00:00");
        Talk talk4 = new Talk(4, "James", "Talk 4", "2023-11-07T12:00:00");
        //Room B Session 2
        Talk talk5 = new Talk(5, "Bill", "Talk 5", "2023-11-07T09:00:00");
        Talk talk6 = new Talk(6, "Ayub", "Talk 6", "2023-11-07T10:00:00");
        Talk talk7 = new Talk(7, "James", "Talk 7", "2023-11-07T11:00:00");
        Talk talk8 = new Talk(8, "Tom", "Talk 8", "2023-11-07T12:00:00");
        //Room C Session 3
        Talk talk9 = new Talk(9, "Sophie", "Talk 9", "2023-11-07T09:00:00");
        Talk talk10 = new Talk(10, "James", "Talk 10", "2023-11-07T10:00:00");
        Talk talk11 = new Talk(11, "Poppy", "Talk 11", "2023-11-07T11:00:00");
        Talk talk12 = new Talk(12, "George", "Talk 12", "2023-11-07T12:00:00");
        //Room D Session 4
        Talk talk13 = new Talk(13, "Ben", "Talk 13", "2023-11-07T09:00:00");
        Talk talk14 = new Talk(14, "John", "Talk 14", "2023-11-07T10:00:00");
        Talk talk15 = new Talk(15, "Harry", "Talk 15", "2023-11-07T11:00:00");
        Talk talk16 = new Talk(16, "James", "Talk 16", "2023-11-07T12:00:00");


        ///Scheduling talks
        session1.scheduleTalk(talk1);
        session1.scheduleTalk(talk2);
        session1.scheduleTalk(talk3);
        session1.scheduleTalk(talk4);

        session2.scheduleTalk(talk5);
        session2.scheduleTalk(talk6);
        session2.scheduleTalk(talk7);
        session2.scheduleTalk(talk8);

        session3.scheduleTalk(talk9);
        session3.scheduleTalk(talk10);
        session3.scheduleTalk(talk11);
        session3.scheduleTalk(talk12);

        session4.scheduleTalk(talk13);
        session4.scheduleTalk(talk14);
        session4.scheduleTalk(talk15);
        session4.scheduleTalk(talk16);

        //Cancel Talk
        session1.cancelTalk(talk1);

        ///Printing out all sessions
        System.out.println("Conference Schedule:");
        System.out.println(session1);
        System.out.println(session2);
        System.out.println(session3);
        System.out.println(session4);


    }
}


