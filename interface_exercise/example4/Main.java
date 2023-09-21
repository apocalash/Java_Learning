//program to show use of interface by sports
package interface_exercise.example4;

interface Play{
    void game();
}
class Basketball implements Play{
    @Override
    public void game() {
        System.out.println("we are playing basketball");
    }
}
class Football implements Play{
    @Override
    public void game() {
        System.out.println("we are playing football");
    }
}

public class Main {
    public static void main(String[] args){
        Basketball basketball = new Basketball();
        basketball.game();

        Football football = new Football();
        football.game();
    }
}
