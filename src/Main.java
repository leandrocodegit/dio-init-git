public class Main {

    public static void main(String[] args) {


        System.out.printf("Hello word");

        for (int i =0;  i < 100; i++){

            try {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception err){

            }

        }

    }

}
