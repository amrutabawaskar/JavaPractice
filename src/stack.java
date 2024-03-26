import java.util.Arrays;

public class stack {
    static  int top=-1;
    static int[] A=new int[5];
    public static void push(int x) throws StackOverFlowException{
    if(top==4){
        throw new StackOverFlowException();
    }
        else{
            top++;
            A[top]=x;
    }

    }
    public static int pop() throws StackUnderFlowException{
    if(top==-1){
        throw new StackUnderFlowException();
    }
    else{
        int x=A[top];
        top--;
        return x;
    }
    }
public static void main(String args[]){
try {
    push(40);
    push(30);
    push(10);
    push(20);
    push(50);
    int x=pop();
    int y=pop();
}
catch (StackOverFlowException e){
    System.out.println("Push Exception: "+e);
}
catch (StackUnderFlowException e){
    System.out.println("Pop Exception: "+e);
}
finally {
    System.out.println("Array:");
    for(int i=0;i<5;i++){
        System.out.println(A[i]);
    }
    System.out.println("top is at :"+top);
}



}
}
class StackOverFlowException extends Exception{
public String toString(){
    return "Stack is full";
}

}
class StackUnderFlowException extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}