package LearningS7Soal;


// Solve without data fields encapsulation
class Persona {
	String nama;
	String address;
	String phoneNumber;
	String emailAddress;

	Persona(String nama, String address, String phoneNumber, String emailAddress) {
		this.nama = nama;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "\nNama: " + this.nama + "\naddress: " + this.address + " \nphone_number: " + this.phoneNumber
				+ " \nemail_address: " + this.emailAddress;
	}
}

class Murid extends Persona {
	final String status;

	Murid(String nama, String address, String phoneNumber, String emailAddress, String status) {
		super(nama, address, phoneNumber, emailAddress);
		this.status = status;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "\nStatus: " + this.status;
	}

}

class Pegawai extends Persona {
	int office;
	double salary;
//	MyDate dateHired;
	String dateHired;

	public Pegawai(String nama, String address, String phoneNumber, String emailAddress, int office, double salary,
			String dateHired) {
		super(nama, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
//		this.dateHired = new myDate();
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice: " + this.office + "\nSalary: $" + this.salary + "\nDate hired: "
				+ this.dateHired;
	}
}

class Dosen extends Pegawai {
	String officeHours;
	String jabatanAkademik;

	public Dosen(String nama, String address, String phoneNumber, String emailAddress, int office, double salary,
			String dateHired, String officeHours, String jabatanAkademik) {
		super(nama, address, phoneNumber, emailAddress, office, salary, dateHired);

		this.officeHours = officeHours;
		this.jabatanAkademik = jabatanAkademik;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
//		System.out.println("debug " + super.toString());
		return "OfficeHours : " + this.officeHours + "\nJabatan Akademik : " + this.jabatanAkademik + super.toString();
	}

}

class Staff extends Pegawai {
	String title;

	public Staff(String title, String nama, String address, String phoneNumber, String emailAddress, int office,
			double salary, String dateHired) {
		super(nama, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title = title;
	}

	public String toString() {
		return "Title: " + this.title + super.toString();
	}

}

public class solutionWithoutEncapsulation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Objek Person");
		Persona persona = new Persona("Anderies", "Jln Anggrek No.1", "08111900639", "ndreznotanto@gmail.com");
		System.out.println(persona.toString());
		System.out.println("=======================");

		System.out.println("\nHello Objek Murid");
		Murid murid = new Murid("Anderies", "Jln Anggrek No.1", "08111900639", "ndreznotanto@gmail.com", "Freshman");
		System.out.println(murid.toString());
		System.out.println("=======================");

		System.out.println("\nHello Objek Pegawai");
		Pegawai pegawai = new Pegawai("Shelly", "Jln Anggrek No.1", "08111900639", "ndreznotanto@gmail.com", 1,
				15000000, "Ahli OOP");
		System.out.println(pegawai.toString());

		System.out.println("=======================");
		System.out.println("\nHello Objek Dosen");
		Dosen dosen = new Dosen("Anderies", "Jln Anggrek No.1", "08111900639", "anderies@binus.ac.id", 2, 1500000,
				"7 September 2020", "8 Hours", "Lektor Kepala");

		System.out.println(dosen.toString());

		System.out.println("=======================");
		System.out.println("\nHello Objek Staff");
		Staff staff = new Staff("Product Officer", "Anderies", "Jln Anggrek No.1", "08111900639",
				"anderies@binus.ac.id", 2, 7000000, "10 Septmber 2020");

		System.out.println(staff.toString());





	}

}
