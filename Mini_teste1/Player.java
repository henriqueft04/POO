package ZTesteAula;

public class Player {

    //privates
    private String name;
    private int id;
    private String club;

    //constructor
    public Player(String name, String club) {

        this.name = name;
        this.club = club;
        this.id = autoId();
    }

    //getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getClub() {
        return club;
    }

    //auto id creater
    public static int autoId() {
        int id = 0;
        return id++;
    }



    //toString
    @Override
    public String toString() {
        return "Payer{" + "name=" + name + ", id=" + id + ", club=" + club + '}';
    }
    
}
