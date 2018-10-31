
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		//memasukkan 
		tumpuk.push("muhammad mohar");tumpuk.cetak();
		tumpuk.push("ASWANDI");tumpuk.cetak();
		tumpuk.push("nadra");tumpuk.cetak();
		tumpuk.push("aswad");tumpuk.cetak();
		tumpuk.push("nilasari");tumpuk.cetak();
		//mengeluarkan
		tumpuk.pop();tumpuk.cetak();

	}

}
