
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        Nasabah n=new Nasabah();
        n.nasabah("Shelindriani");
        n.ambilUang(100000,"dipakai untuk beli tas");
        n.tabungan(200000000);
        n.ambilUang(500);
        System.out.println(n.getSaldo());

        System.out.println();
        Nasabah n1=new Nasabah();
        n1.nasabah("Akuu");
        n1.tabungan(50000000);
        n1.ambilUang(500000);
        n1.ambilUang(70000,"dipakai belanja sayur");
        
        System.out.println("\nTotal transaksi anda : ");
        
        n1.getNamaNasabah();
    }
    
}
