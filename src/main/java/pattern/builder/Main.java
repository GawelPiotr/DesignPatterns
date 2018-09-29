package main.java.pattern.builder;

public class Main {
    public static void main(String[] args) {
        ScheduleRoom scheduleRoom_1 = new ScheduleRoom.ScheduleRoomBuilder(8 , 16)
                .build();
        ScheduleRoom scheduleRoom_2 = new ScheduleRoom.ScheduleRoomBuilder(8 , 16)
                .addDrinkService()
                .addFlipBoard()
                .addProjector("large quality")
                .build();
    }
}
