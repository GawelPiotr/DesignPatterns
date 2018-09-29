package main.java.pattern.decorator;

public class ScheduleRoom {
    private int startTime;
    private int endTime;

    //optional
    private boolean drinkservice;
    private boolean flipBoard;
    private boolean projector;
    private  String projectorType;

    private ScheduleRoom(ScheduleRoomBuilder builder){
        this.startTime      = builder.startTime;
        this.endTime        = builder.endTime;
        this.drinkservice   = builder.drinkservice;
        this.flipBoard      = builder.flipBoard;
        this.projector      = builder.projector;
        this.projectorType  = builder.projectorType;

    }

    public static class ScheduleRoomBuilder{
        private int startTime;
        private int endTime;

        //optional
        private boolean drinkservice;
        private boolean flipBoard;
        private boolean projector;
        private  String projectorType;
        public void  meeting() {
            System.out.println("Perform meeting with starndard equipment room");
        }

        public ScheduleRoom build(){
            return new ScheduleRoom(this);
        }


        public ScheduleRoomBuilder(int startAt, int endAt)
        {
            this.startTime = startAt;
            this.endTime = endAt;
        }

        public ScheduleRoomBuilder addDrinkService(){
            this.drinkservice = true;
            return this;
        }
        public ScheduleRoomBuilder addFlipBoard(){
            this.flipBoard = true;
            return this;
        }
        public ScheduleRoomBuilder addProjector(String projectorType){
            this.projector = true;
            this.projectorType = projectorType;
            return this;
        }


    }
}
