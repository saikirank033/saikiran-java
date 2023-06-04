public class second extends first{
    @Override
    public void name(){
        System.out.println("Sai Kiran");
    }
    public static void main(String[] args){
        first s2= new second();
        s2.name();
    }

}
