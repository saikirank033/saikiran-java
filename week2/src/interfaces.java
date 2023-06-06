interface vehicle {
    public void vehiclesound();
}

interface human {
    public void humansound();
}
class car implements vehicle,human {
    @java.lang.Override
    public void vehiclesound() {
        System.out.println("The car sounds like drrrrr");
    }
    public void humansound(){
        System.out.println("David sounds like jai ballaya");
    }


}


public class interfaces {
    public static void main(String[] args){
        car mycar = new car();

        mycar.vehiclesound();
        mycar.humansound();
    }
}

