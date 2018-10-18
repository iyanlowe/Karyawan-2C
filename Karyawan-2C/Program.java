public class Program extends Karyawan{
	String nama;
	String alamat;
	private int gaji;
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Gaji anda sebesar = "+uang);
		}else{
			System.out.println("maaf gaji anda terlalu banyak");
		}
	}
}