

import java.util.Scanner;

public class Soal4_AhmadFarisAlmuzakki_2101092028 {
    public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
		
		int i,fakt,n;
		
		i=1;
		fakt=1;
		
		System.out.println("\n===PROGRAM MENGHITUNG FAKTORIAL MENGGUNAKAN WHILE===");
		System.out.print("\nMasukkan Bilangan Yang Ingin Di Faktorialkan : ");
		n = in.nextInt();
		
		i = n;
		
		while (i>0){
			fakt = fakt*i;
			i--;
		}
		
		System.out.print ("\nNilai Faktorial dari "+n+" : "+fakt+"\n");
    }
}


