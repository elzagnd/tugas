package rain;
import java.util.Scanner;

public class DaftarMakanan {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	     

	    int pilih;
	    double jumlah,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total_keseluruhan;
	    char ulang;
	     
	    do {
	    	System.out.println("Warmindo Makan");
			System.out.println("RAIN");
			System.out.println("---------------");
			System.out.println("1. Nasi Goreng");
			System.out.println("2. Nasi Uduk");
			System.out.println("3. Nasi Kuning");
			System.out.println("4. Nasi Kucing");
			System.out.println("5. Nasi Orak-arik");
			System.out.println("6. Nasi Magelangan");
			System.out.println("7. Keluar");
			System.out.println("----------------");
			System.out.println("Pilih [1-7] :");
	       
	      System.out.print("Sebutkan pilihan anda : ");
	      pilih = input.nextInt();
	    
	      switch(pilih) {
	      case 1:
				System.out.print("Nasi Goreng At 12K, beli berapa porsi = ");
				jumlah=input.nextDouble();
				total1=jumlah*12000;
				System.out.println("Nasi Goreng yang kamu pesan seharga = Rp."+total1);
	                        break;
			case 2:
				System.out.print("Nasi Uduk At 10k, beli berapa porsi =");
				jumlah=input.nextDouble();
				total2=jumlah*10000;
				System.out.println("Nasi Uduk yang kamu pesan seharga = Rp."+total2);
	                        break;
			case 3:
				System.out.print("Nasi Kuning At 10k , beli berapa porsi =");
				jumlah=input.nextDouble();
				total3=jumlah*10000;
				System.out.println("Nasi Kuning yang kamu pesan seharga = Rp."+total3);
	                        break;
			case 4:
				System.out.print("Nasi Kucing At 3k, beli berapa porsi =");
				jumlah=input.nextDouble();
				total4=jumlah*3000;
				System.out.println("Nasi Kucing yang kamu pesan seharga = Rp."+total4);
	                        break;
			case 5:
				System.out.print("Nasi Orak-Arik At 10k, beli berapa porsi =");
				jumlah=input.nextDouble();
				total5=jumlah*10000;
				System.out.println("Nasi Orak-Arik yang kamu pesan seharga = Rp."+total5);
	                        break;
			case 6:
				System.out.print("Nasi Magelangan At 12k,mau beli berapa porsi =");
				jumlah=input.nextDouble();
				total6=jumlah*12000;
				System.out.println("Nasi Magelangan yang kamu pesan seharga = Rp."+total6);
	                        break;
	                case 7:
	                        System.out.println("Tidak Jadi Membeli, Karena Uangnya habis");
	                        System.exit(0);
				
			}
	    
	      System.out.println();
	    
	      System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
	      System.out.print("y/n ? : ");
	      ulang = input.next().charAt(0);
	       
	      System.out.println();
	    }
	    while (ulang!= 'n');
	    
	   total_keseluruhan=(total1+total2+total3+total4+total5+total6);
	   System.out.println("Total Pesanan = "+total1+" + "+total2+" + "+total3+" + "+total4+" + "+total5+" + "+total6+" = "+total_keseluruhan);
	   System.out.println("Terimakasih Telah Memesan");
	}

}
