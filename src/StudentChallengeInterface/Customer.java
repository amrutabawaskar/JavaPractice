package StudentChallengeInterface;

public class Customer implements IMember{
    String name;
    public Customer(String name) {
        this.name = name;
    }
   public String callBack(){

        System.out.println("Invite for sale"+name);
        return name;
    }
}
