import java.rmi.server.ServerNotActiveException;

// class SecondLarget{
//   public static void main(String args[]){
//     int arr[]={6,5,4,3,2,1};
//     for(int i=0;i<arr.length;i++){
//       if( i<arr.length-2 && arr[i]>arr[i+1] ){
//         int temp=arr[i];
//         arr[i]=arr[i+1];
//         arr[i+1]=temp;
//       }
//     }
//     for(int i =0;i<arr.length;i++){
//       System.out.println(arr[i]);
//     }
//   }
// }

// class SecondLargest {
//   public static void main(String args[]) {
//     int arr[] = { 1, 2, 5, 4, 3 };
//     int largest = arr[0];
//     int secondLargest = arr[1];
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] > largest) {
//         secondLargest = largest;
//         largest = arr[i];
//       }
//       if (arr[i] < largest && arr[i] > secondLargest) {
//         secondLargest = arr[i];
//       }
//     }
//     System.out.println(secondLargest);
//   }
// }

/**
 * SecondLargest
 */
public class SecondLargest {
  public int sendlar(int arr[]) {
    int largest = arr[0];
    int secondLargest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      }
      if (arr[i] < largest && arr[i] > secondLargest) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 5, 4, 3 };
    SecondLargest s = new SecondLargest();

    int ans = s.sendlar(arr);
    System.out.println(ans);
  }
}