package övningar;

public class övning68 {
    public static void main(String[] args) {
        //En array med 50 inlästa tal
        int[] numbers = {1,2,3,4,5,6,7,8,9,10, 1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        int number = 34;
        //Fördubbla värdet på talen på varje plats i arrayn
        //Gå igenom nummer för nummer
        //För varje nummer multiplicera med 2
        for(int i=0; i<50; i++){
            numbers[i] = numbers[i] * 2;
            //System.out.println(i);
        }
        number = number * 2;
        numbers[1] = numbers[1] * 2;

        for(int i=0; i<50; i++){
            System.out.println(numbers[i]);
        }
        //System.out.println(number);
        //System.out.println(numbers[1]);


    }
}
