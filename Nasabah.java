
public class Nasabah {
    private String pesan;
    private int saldo;
    private String  namaNasabah;
    
   
    int noAntrian=0;
    
    public void nasabah(String nama){
        namaNasabah=nama;
        //System.out.println("Nama Nasabah : " );
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public String getPesan(){
         return pesan;
     }
     public int getSaldo(){
        return saldo;
    }
    
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("saldomu tidak mencukupi, mohon maaf !.");
            return saldo;
        }else{
            System.out.println("Sukses !!!!!!!!!!.");
            noAntrian++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println("saldomu tidak mencukupi, mohon maaf !");
            return saldo;
        }else{
            System.out.println("Sukses !!!!!!!!!! " + uang + " berhasil.");
            noAntrian++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   public void getNamaNasabah(){
   System.out.println("Nama Nasabah :"+ namaNasabah);
   }
}
