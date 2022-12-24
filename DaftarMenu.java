package rain;
import java.util.Scanner;
public class DaftarMenu {
	private void welcome() {
    }
    public static void main(String[] args) {
        
        Scanner input;
        String textInBold = "";
        System.out.print("\033[0;1m"+textInBold);
        
        char  ulang;
        double TK;
        Nasgor Ng = new Nasgor();
        Nasduk Nu = new Nasduk();
        Naskun Nkn = new Naskun();
        Naskuc Nkc = new Naskuc();
        Nasrik No = new Nasrik();
        Nasmag Nm = new Nasmag();
        
            input = new Scanner (System.in);
            DaftarMenu DM = new DaftarMenu ();
            DM.welcome();
            System.out.println("===#Warung Makan#===");
            System.out.println("========RAIN========");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Goreng ---- Rp. 12.000");
            System.out.println();
            System.out.println("2. Nasi Uduk -------- Rp. 10.000");
            System.out.println();
            System.out.println("3. Nasi Kuning ------ Rp. 10.000");
            System.out.println();
            System.out.println("4. Nasi Kucing ------ Rp. 3.000");
            System.out.println();
            System.out.println("5. Nasi Orak-Arik --- Rp. 10.000");
            System.out.println();
            System.out.println("6. Nasi Magelangan - Rp.12.000");
            System.out.println();
            System.out.println("7. Keluar -- Tidak Jadi Pesan");
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------");
        do{
            System.out.println("Pilih [1-7] ----------------:");
            System.out.print("Masukan Pilihan Anda        : ");
            int kode = input.nextInt();
            switch(kode){
                
            case 1 :
            Ng.setNama("Nasgor");
            Ng.Infodaftarmenu();
            System.out.println("Harga Nasi Goreng Rp. 12.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Ng.setjml1(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Ng.getjml1()+" porsi, seharga Rp."+Ng.getT1());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
                
            case 2 :
            Nu.setNama("Nasduk");
            Nu.Infodaftarmenu();
            System.out.println("Harga Nasi Uduk Rp. 10.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nu.setjml2(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nu.getjml2()+" porsi, seharga Rp."+Nu.getT2());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 3 :
            Nkn.setNama("Naskun");
            Nkn.Infodaftarmenu();
            System.out.println("Harga Nasi Kuning Rp. 10.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nkn.setjml3(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nkn.getjml3()+" porsi, seharga Rp."+Nkn.getT3());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 4 :
            Nkc.setNama("Naskuc");
            Nkc.Infodaftarmenu();
            System.out.println("Harga Nasi Kucing Rp. 3.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nkc.setjml4(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nkc.getjml4()+" porsi, seharga Rp."+Nkc.getT4());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;

            case 5 :
            No.setNama("Nasrik");
            No.Infodaftarmenu();
            System.out.println("Harga Nasi Orak-Arik Rp. 10.000");
            System.out.print("Mau pesan berapa porsi ? ");
            No.setjml5(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +No.getjml5()+" porsi, seharga Rp."+No.getT5());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 6 :
            Nm.setNama("Nasmag");
            Nm.Infodaftarmenu();
            System.out.println("Harga Nasi Magelangan Rp. 12.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nm.setjml6(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nm.getjml6()+" porsi, seharga Rp."+Nm.getT6());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 7:
            System.out.println();
            System.out.println("Tidak Jadi Membeli, Karena Uangnya habis");
            System.out.println();
            System.out.println();
            System.exit(0);
            
        }
        System.out.println();
        System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
                System.out.print("Untuk meneruskan (enter : Y (ya) atau tidak meneruskan (enter : T (tidak) ? : ");
                ulang = input.next().charAt(0);
                System.out.println();
                System.out.print("\u001B[2J");
                
            }
            while (ulang !='t');
            TK=(Ng.getT1()+Nu.getT2()+Nkn.getT3()+Nkc.getT4()+No.getT5()+Nm.getT6());
            System.out.println("Menu Yang Telah Anda Pesan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Goreng Seharga Rp. 12.000 sebanyak "+Ng.getjml1()+" porsi, dengan total harga Rp."+Ng.getT1());
            System.out.println();
            System.out.println("2. Nasi Uduk seharga Rp. 10.000 sebanyak "+Nu.getjml2()+" porsi, dengan total harga Rp."+Nu.getT2());
            System.out.println();
            System.out.println("3. Nasi Kuning seharga Rp. 10.000 sebanyak "+Nkn.getjml3()+" porsi, dengan total harga Rp."+Nkn.getT3());
            System.out.println();
            System.out.println("4. Nasi Kucing seharga Rp. 3.000 sebanyak "+Nkc.getjml4()+" porsi, dengan total harga Rp."+Nkc.getT4());
            System.out.println();
            System.out.println("5. Nasi Orak-Arik seharga Rp. 10.000 sebanyak "+No.getjml5()+" porsi, dengan total harga Rp."+No.getT5());
            System.out.println();
            System.out.println("6. Nasi Magelangan seharga Rp. 12.000 sebanyak "+Nm.getjml6()+" porsi, dengan total harga Rp."+Nm.getT6());
            System.out.println();
            System.out.println();
            System.out.println("Total Seluruh Tagihan Yang Harus Di Bayar Adalah Rp."+TK);
            System.out.println();
            System.out.println("Terimakasih Telah Datang Dan Memesan Di Warung Makan Rain  ^^");
            System.out.println();
            System.out.println();
            input.close();
            
        }
    }
