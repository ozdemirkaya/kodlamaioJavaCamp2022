public class Main {
    public static void main(String[] args) {

        int number = 1;
        boolean isPrime = true;
        String mesaj = "Sayı Asaldır.";
        String mesaj2 = "Sayı Asal Değildir.";

        if (number<1){
            System.out.println("Geçersiz Sayı.");
            return;
        }
        if(number==1){
            System.out.println(mesaj2);
            return;
        }


        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime == true){
            System.out.println(mesaj);
        }else{
            System.out.println(mesaj2);
        }

    }
}