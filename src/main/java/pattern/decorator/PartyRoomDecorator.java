package main.java.pattern.decorator;

public class PartyRoomDecorator extends BasicRoomDecorator {
    public PartyRoomDecorator (Room room){
        super(room);
    }

    @Override
    public void meeting() {
        super.meeting();
        System.out.println("Room included barman and alcohol shelf. Also  dance area with DJ ");
    }
}
