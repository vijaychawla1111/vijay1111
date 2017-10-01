public class FindSecondLargest {

      int[] array = {1,2,4,6,7,8,9,0};
      public static String LARGEST = "Second Largest among the Numbers";
      public static String SMALLEST = "Second Smallest among the Numbers";

	public static void main(String args[]) {

		FindSecondLargest fsl = new FindSecondLargest();
		fsl.secLargest();
		fsl.secSmallest();

		
		
    }            
        void secLargest() {        

            //Second Largest
		    int firstLargest = array[0];
            int secondLargest = array[0];

            for(int i=0;i<array.length;i++) {
                if(array[i]>firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = array[i];
                }
            }
            System.out.println(LARGEST+" "+secondLargest);
           }
		
        void secSmallest() { 

            //Second Smallest
            int firstSmallest = array[0];
            int secondSmallest = array[0];

            for(int i=0;i<array.length;i++) {
                if(array[i]<firstSmallest) {
                    secondSmallest = firstSmallest;
                    firstSmallest = array[i];
                }
            }
            System.out.println(SMALLEST+" "+secondSmallest);
        }
		
}
