public class Main {
    public static void main(String[] args) {
      try{
        int[] arr = new int[10];
        System.out.println(arr[9001]);
      } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception occurred");
        // System.out.println(e);
        e.printStackTrace();

      }

      try{
        int i = 0/0;
      } catch(ArithmeticException e ){
        System.out.println("Exception occurred");
        // System.out.println(e);
        e.printStackTrace();
      }

      try{
        Class cls = Class.forName("java.lang.Kyle");

      } catch(ClassNotFoundException e){
        System.out.print("Exception occurred");
        e.printStackTrace();
      }
    }
}
