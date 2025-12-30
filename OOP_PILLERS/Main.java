abstract class Remote {
    abstract void function();
}
class AcRemote extends Remote{

    @Override
    void function() {
        System.out.println("Operates AC");
    }
    

}
class TvRemote extends Remote{

    @Override
    void function() {
        System.out.println("Operates TV");
    }
    

}
public class Main {
    public static void main(String[] args) {
        // Remote remote = new AcRemote();
        // remote.function();
        // remote = new TvRemote();
        // remote.function();

        Remote[] obj = {new AcRemote(), new TvRemote()}; //now you can refer any subclass using the common-parent
        for(Remote remote : obj) {
            remote.function();
        } //run-time polymorphism
    }
}