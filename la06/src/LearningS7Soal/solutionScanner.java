package LearningS7Soal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PersonaTwo {
	String nama;
	String address;
	String phoneNumber;
	String emailAddress;

	PersonaTwo(String nama, String address, String phoneNumber, String emailAddress) {
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

class MuridTwo extends Persona {
	final String status;

	MuridTwo(String nama, String address, String phoneNumber, String emailAddress, String status) {
		super(nama, address, phoneNumber, emailAddress);
		this.status = status;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "\nStatus: " + this.status;
	}

}

class PegawaiTwo extends PersonaTwo {
	int office;
	double salary;
//	MyDate dateHired;
	String dateHired;

	public PegawaiTwo(String nama, String address, String phoneNumber, String emailAddress, int office, double salary,
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

class DosenTwo extends PegawaiTwo {
	String officeHours;
	String jabatanAkademik;

	public DosenTwo(String nama, String address, String phoneNumber, String emailAddress, int office, double salary,
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

class StaffTwo extends PegawaiTwo {
	String title;

	public StaffTwo(String title, String nama, String address, String phoneNumber, String emailAddress, int office,
			double salary, String dateHired) {
		super(nama, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title = title;
	}

	public String toString() {
		return "Title: " + this.title + "\n" + super.toString();
	}

}

public class solutionScanner {

	public ArrayList<String> listPersonaField;
	public ArrayList<Object> listPegawaiField;
	public void personaInput(Scanner myObj) {
		ArrayList<String> personaArray = new ArrayList<String>();
		System.out.print("Nama: ");
		String nama = myObj.next();
		
		myObj.nextLine();
		System.out.print("Address : ");
		String address = myObj.nextLine();

//		myObj.nextLine();
		System.out.print("Phone Number : ");
		String phoneNumber = myObj.nextLine();

//		myObj.nextLine();
		System.out.print("Email Address : ");
		String emailAddress = myObj.next();
		
		
		Collections.addAll(personaArray, nama, address, phoneNumber, emailAddress);
//		personaArray.addAll(nama);
//		personaArray.add(address);
//		personaArray.add(phoneNumber);
//		personaArray.add(emailAddress);
		
		this.listPersonaField = personaArray;
	}
	
	public void pegawaiInput(Scanner myObj) {
		ArrayList<Object> pegawaiArray = new ArrayList<>();
		
		myObj.nextLine();
		System.out.print("Office : ");
		int office = myObj.nextInt();

		myObj.nextLine();
		System.out.print("Salary : ");
		double salary = myObj.nextDouble();
		
		System.out.print("Date Hired :");
		String dateHired = myObj.nextLine();
		Collections.addAll(pegawaiArray, office, salary, dateHired);
		
		this.listPegawaiField = pegawaiArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=================");
		System.out.println("1. Input Dosen");
		System.out.println("2. Input Murid");
		System.out.println("3. Input Staff");
		System.out.println("=================");

		System.out.print("Pilih Angka Input : ");
		Scanner myObj = new Scanner(System.in);
		int angka = myObj.nextInt();
		switch (angka) {
		case 1:
			System.out.println("User Akan Menginput Dosen");
			solutionScanner ip = new solutionScanner();
//			ip.pers
			ip.personaInput(myObj);
			ip.pegawaiInput(myObj);
			System.out.println(ip.listPersonaField);
			
			myObj.nextLine();
			System.out.print("Jabatan Akademik : ");
			String jabatanAkademik = myObj.nextLine();

			System.out.print("Office Hours : ");
			String officeHours = myObj.nextLine();

//			Dosen dosen = new Dosen(ip.listPersonaField.get(0), 
//					ip.listPersonaField.get(1), ip.listPersonaField.get(2), ip.listPersonaField.get(3), 
//					ip.listPegawaiField.get(0), ip.listPegawaiField.get(1), ip.listPegawaiField.get(2), 
//					officeHours,jabatanAkademik);
//
//			System.out.println("======================");
//			System.out.println(dosen.toString());
			break;
		case 2:
			System.out.println("User Akan Menginput Murid");
			
			break;
		case 3:
			System.out.println("User Akan Menginput Staff");
			break;
		}
	}

}
