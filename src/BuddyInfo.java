public class BuddyInfo {


    public String getName() {
        return name;
    }

    public BuddyInfo( String name){
        this.name = name;
    }

    private String name;

    public static void main(String[] args) {
        BuddyInfo friend = new BuddyInfo("Faris");
        System.out.println("hello " + friend.getName());
    }
}