package StudentChallengeInterface;

public class Store {
    IMember mem[]=new IMember[10];
    int count=0;

    public int register(IMember m){

        mem[count++]=m;
        return count;
    }

   public String callForSell(){
        System.out.println("Inside Store CallForSell");
        for(int i=0;i<count;i++){
            String name=mem[i].callBack();
            return name;
        }
        return null;
    }

}
