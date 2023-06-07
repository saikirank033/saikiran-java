public class rotate {
  public static void main(String args[]){
      int[] a= {1, 2, 3, 4, 5, 6, 7};
      int k=2;
      int[] c=new int[a.length];
      int j=0;
      for(int i=a.length-k;i<a.length;i++){

          c[j]=a[i];
          System.out.println(c[j]);
          j++;

      }
      for (int i=0;i<a.length-k;i++){
          c[j]=a[i];
          System.out.println(c[j]);
          j++;
      }

  }
}