public class parent {
    int x;
    public static void main(String[] args) {
       child mychild = new child(5,6);
       child mychild1 = new child(6);


    }
}
 class child extends parent {
    int y;
    public child(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public child(int y){
        this.y=y;
    }
}
