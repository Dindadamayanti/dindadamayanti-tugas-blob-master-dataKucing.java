class Kucing{
private String nama;
private String jenis;
private int umur;
private int tahunlahir;

public Kucing (String nma,String jns,int umr,int thnlhir) {
this.nama=nma;
this.jenis=jns;
this.umur=umr;
this.tahunlahir=thnlhir;
}

public void tampildataKucing()
{
System.out.println("===== Data Kucing ======");
System.out.println("Nama kucing \t \t: "+this.nama);
System.out.println("Jenis kucing \t \t: "+this.jenis);
System.out.println("Umur kucing \t \t: "+this.umur+" bulan");
System.out.println("Tahun lahir kucing \t: "+this.tahunlahir);
   }
}

class dataKucing{
public static void main(String[] args) {
Kucing cat=new Kucing("Momo","Persia", 9 , 2017);
cat.tampildataKucing();
   }
}