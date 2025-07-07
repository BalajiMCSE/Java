import java.util.*;
class Remove{
  public static void main(String[] args)
  {
    int[] arr={1,3,4,4,4,6,6};
    remove(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void remove(int[] a)
  {
    int j=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]!=a[j]){
        a[i++]=a[j];
      }
    }
  }
}
