
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat tumpuk = new StackFloat();
		//memasukkan 
		tumpuk.push((float) 165.0);tumpuk.cetak();
		tumpuk.push((float)156.0);tumpuk.cetak();
		tumpuk.push((float)170.9);tumpuk.cetak();
		tumpuk.push((float)188.2);tumpuk.cetak();
		tumpuk.push((float)206.9);tumpuk.cetak();
		//mengeluarkan
		tumpuk.pop();tumpuk.cetak();
		

	}

}
