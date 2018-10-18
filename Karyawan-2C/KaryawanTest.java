
public class KaryawanTest{
	public static void main(String[] args) {
		String mainSubject = "Physics";
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Iyan Lowe");
	p.setAlamat("Juntinyuat");
	p.setGaji(60);

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Jamilah");
	p.setAlamat("Xompiang");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Aisyah");
	d.setAlamat("Deket Jamilah");
	d.setGaji(50);
	}
}