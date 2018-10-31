import java.util.ArrayList;


public class ArrayListObject {

	public static void main(String[] args) {
	ArrayList<Object> arrayList = new ArrayList<Object>();
	arrayList.add((" \n Muhammad Mohar\n ") + ("D0217321\n " ) + ( "Informatika B \n")+(" pambusuang\n "));
	arrayList.add(("\n Aswandi \n") + (" D0217001\n " ) + ("Informatika B \n")+(" sendana \n"));
	arrayList.add(("\n aswad \n") + (" D0217319\n " ) + ( "Informatika B\n ")+("tammangalle \n"));
	arrayList.add(("\n Rosalina\n ") + ("D0217002\n " ) + ( "Informatika B\n ")+("mamasa\n "));
	arrayList.add(("\n Nilasari\n ") + ("D0217322 \n" ) + ( " Informatika B \n")+(" sendana\n "));
	
	System.out.println("Biodata mahasiswa : " + arrayList.toString());

	}

}
