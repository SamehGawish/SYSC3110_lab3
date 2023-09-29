import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;


    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            this.buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Faris");
        BuddyInfo buddy2 = new BuddyInfo("mostafa");
        BuddyInfo buddy3 = new BuddyInfo("Omar");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy2);
        addressBook.addBuddy(buddy3);
        addressBook.removeBuddy(buddy);

    }

}
