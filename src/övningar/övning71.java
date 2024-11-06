package övningar;

public class övning71 {
    public static void main(String[] args) {
        //En array med 50 inlästa tal finns.
        int[] numbers = {1,2,3,4,5,6,7,8,9,10, 1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        //Ta reda på hur många tal som är större än det första talet.

        //Skapa en räknare för antalet "Stora tal".
        int counter = 0;

        //Vilket är första talet
        int first = numbers[0];

        //Jämföra om ett tal är större än det första talet
        for(int i=1; i<numbers.length;i++){
        if (numbers[i]> first) {
            //isåfall öka räknaren med 1
            counter++;
            }
        }
        System.out.println(counter);

    }
}
