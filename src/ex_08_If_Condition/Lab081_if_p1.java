package ex_08_If_Condition;

public class Lab081_if_p1 {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if (age>25) {
            System.out.println("You can vote");
        }else {
            System.out.println("you can't vote");
        }

    }
}
