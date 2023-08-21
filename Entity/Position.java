package Entity;

public class Position {
    public enum PositionName {
        DEV, TEST, SCRUM_MASTER, PM
    }
    int id;
    PositionName name;
}
