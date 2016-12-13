
class Student{
	String ime;
	String prezime;
	String godiste;
	int godina;
	boolean redovni;
	boolean aktivan;
	
}


public class App {
	
	public static void main (String[] args){
 
	Student student1 = new Student();
	student1.ime  = "Marko";
	student1.prezime = "Markovic";
	student1.godiste = "1991";
	student1.godina = 4;
	student1.redovni = false;
	student1.aktivan = true;
	
	
	Student student2 = new Student();
	student2.ime  = "Jovana";
	student2.prezime = "Jovanovic";
	student2.godiste = "1996";
	student2.godina = 2;
	student2.redovni = true;
	student2.aktivan = true;
	
	
	}
}


