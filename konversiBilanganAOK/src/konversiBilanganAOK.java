import java.util.Scanner;

public class konversiBilanganAOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mulai = true;

        while (mulai) {
            System.out.println("\nProgram Konversi Bilangan!");
            System.out.println("\n|=========|| MENU ||=========|");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Biner");
            System.out.println("7. Keluar Program");
            System.out.print("   Masukkan pilihan anda: ");
        
            int input = scanner.nextInt();
            scanner.nextLine();
            
            switch (input){
                case 1 -> {
                    System.out.println("\nKonversi Biner ke Desimal");
                    System.out.print("Masukkan angka Biner: ");
                    
                    String biner = scanner.nextLine();
                    int hasilDesimal = Integer.parseInt(biner, 2);
                    System.out.println("Angka desimal dari " + biner + " adalah " + hasilDesimal);
                    break;
                }
                case 2 -> {
                    System.out.println("\nKonversi Desimal ke Biner");
                    System.out.print("Masukkan Angka Desimal: ");
                    
                    int desimal = scanner.nextInt();
                    String hasilBiner = Integer.toBinaryString(desimal);
                    System.out.println("Ankga biner dari "+ desimal + " adalah " + hasilBiner);
                }
                case 3 -> {
                    System.out.println("\nKonversi Biner ke Hexa");
                    System.out.print("Masukkan Bilangan Biner: ");
                    
                    String biner = scanner.nextLine();
                    int desimal = Integer.parseInt(biner,2);
                    String hasilHexa = Integer.toHexString(desimal);
                    System.out.println("Angka hexa dari " + biner + " adalah " + hasilHexa.toUpperCase());
                }
                case 4 -> {
                    System.out.println("\nKonversi Hexa ke Biner");
                    System.out.print("Masukkan angka hexa: ");
                    
                    String hexa = scanner.nextLine().toUpperCase();
                    int desimal = Integer.parseInt(hexa, 16);
                    String hasilBiner = Integer.toBinaryString(desimal);
                    System.out.println("Ankga biner dari " + hexa + " adalah " + hasilBiner);
                }
                case 5 -> { 
                    System.out.println("\nKonversi Desimal ke Hexa");
                    System.out.print("Masukkan angka desimal: ");
                    
                    String desimal = scanner.nextLine();
                    int biner = Integer.parseInt(desimal);
                    String hasilHexa = Integer.toHexString(biner);
                    System.out.println("Angka hexa dari " + desimal + " adalah " + hasilHexa.toUpperCase());
                }
                case 6 -> { 
                    System.out.println("\nKonversi Hexa ke Desimal");
                    System.out.print("Masukkan angka hexa: ");

                    String hexa = scanner.nextLine();
                    int hasilDesimal = Integer.parseInt(hexa, 16);
                    System.out.println("Angka desimal dari " + hexa + " adalah " + hasilDesimal);
                }
                case 7 -> {
                    mulai = false;
                    System.out.println("\nKeluar dari Program...");
                    System.out.println("Sampai jumpa user!");
                    break;
                }
                default -> {
                    System.out.println("\nInput tidak sesuai!"); 
                    System.out.println("Masukkan angka 1-7");
                } 
            }
        }
        scanner.close();
    }
}

/*
 * Nama  : Akhtar Hafiz Puliwarna
 * NIM   : 235150707111013
 * Prodi : Teknologi Informasi (A)
 */