public class Pm extends Karyawan{
	String nama;
	String alamat;
	private int gaji;
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji anda sebesar = "+gaji);
		}else{
			System.out.println("maaf gaji anda terlalu banyak");
		}
	}
}