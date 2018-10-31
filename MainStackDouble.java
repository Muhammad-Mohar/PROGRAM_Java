
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble tumpuk = new StackDouble();
		//memasukkan
		tumpuk.push(40.47);tumpuk.cetak();
		tumpuk.push(30.90);tumpuk.cetak();
		tumpuk.push(50.77);tumpuk.cetak();
		tumpuk.push(80.22);tumpuk.cetak();
		tumpuk.push(57.86);tumpuk.cetak();
		//mengeluarkan
		tumpuk.pop();tumpuk.cetak();

	}

}
