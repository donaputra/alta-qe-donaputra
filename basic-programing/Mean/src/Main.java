public class Main {
    private static float Mean(float[] numbers){
        // your code here
        float jumlah =0;
        for (float number : numbers) {
            jumlah = jumlah + number;
            System.out.println(number);
        }
        float mean = jumlah/ numbers.length;
        return mean;
    }

        public static void main(String[] args){
        float[] value ={1, 2, 3, 4};
        System.out.println(Mean(value)); //2.5
         }
}