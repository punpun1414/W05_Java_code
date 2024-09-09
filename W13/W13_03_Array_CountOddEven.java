package W13;

public class W13_03_Array_CountOddEven {
    
    public static void main(String[] args) {
        // ให้นับเลขคู่เลขคี่ใน Array ด้านล่าง
            int [] numbers = {1, 5, 6, 8, 9, 10, 16, 11, 17, 18, 19, 20, 26, 30, 40, 48, 50} ;

        int countOdd = 0;
        int countEven = 0;

        for ( int i = 0 ; i < numbers.length ; i++ ){
            System.out.print(numbers[i] + " ");
            
            if (numbers[i] % 2 == 0) {
                countOdd++;

            }else{
                countEven++;
            }
        
        }
        
        System.out.println("\n Amout of all Number : "+ numbers.length);
        System.out.println(" Amout of Odd Number : "+ countOdd);
        System.out.println(" Amout of Even Number : "+ countEven);



    }

}
