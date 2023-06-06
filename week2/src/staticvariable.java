 class static1 {
    static int y;
    static void data(int a){
        y=a;
    }
    static {
        data(1);
        System.out.println("block value");
    }
}
public class staticvariable {
    public static void main(String[] args){
        System.out.println(static1.y);
    }
>>>>>>> 2cf85d5a3881153f64d64938382b82ed713ba696
}