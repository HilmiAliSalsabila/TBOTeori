public class InformasiBuah {
    public static void main(String[] args) {
        Buah buah1 = new Apel();
        Buah buah2 = new Jeruk();
        Buah buah3 = new Mangga();

        System.out.println("Informasi Apel :");
        buah1.infoBuah();

        System.out.println("\nInformasi Jeruk : ");
        buah2.infoBuah();

        System.out.println("\nInformasi Mangga : ");
        buah3.infoBuah();
    }
}
