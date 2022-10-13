public class Main {
    public static void main(String[] args) {

        int sayi1 = 15;
        int sayi2 = 60;
        int sayi3 = 50;
        int enBuyuk = sayi1;
        String mesaj = "En Büyük Sayı :";

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println(mesaj + enBuyuk);
    }
}