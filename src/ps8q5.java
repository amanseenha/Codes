class TommyVecetti{
    public void running(){
        System.out.println("Tommy Vecetti is Running.");
    }
    public void driving(){
        System.out.println("Tommy Vecetti is Driving.");
    }
    public void sleeping(){
        System.out.println("Tommy Vecetti is Sleeping.");
    }
    public void fighting(){
        System.out.println("Tommy Vecetti is Fighting.");
    }


}
public class ps8q5 {
    public static void main(String[] args) {
        TommyVecetti action = new TommyVecetti();
        action.running();
        action.driving();
        action.sleeping();
        action.fighting();
    }
}
