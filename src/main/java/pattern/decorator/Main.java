package main.java.pattern.decorator;

public class Main {
    public static void main(String[] args) {
        ScheduleRoom basicScheduleRoom =  new ScheduleRoom.ScheduleRoomBuilder(2,3).build();

       // Room partyRoom = new PartyRoomDecorator(basicScheduleRoom);
       // Room escapeRoom = new EscapeRoomDecorator(basicScheduleRoom);
        // partyRoom.meeting();
        System.out.println("**********************");
        //escapeRoom.meeting();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
    }
}
