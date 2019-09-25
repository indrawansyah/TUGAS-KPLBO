package latihan3;

public class Klasemen {
	private int main;
	private int menang;
	private int seri ;
	private int kalah;
	private Tim tim;
	private int nilai;
	
	public Klasemen(Tim tim) {
		super();
		this.tim = tim ;
	}
	
	public String toString() {
		return tim.getNama()+ " # "+ main+ " : "+menang+
				" - "+ seri+ " - "+kalah + " : N";
	}
	
	public void tambahPertandinganTim1(Pertandingan p) {
		main++;
		if (p.getStatusTim1() == Pertandingan.MENANG) {
			menang++;
			nilai = nilai = 3; 
		}
		else if (p.getStatusTim1() == Pertandingan.KALAH) {
			kalah++;
			nilai = nilai = 0;
		}else {
			seri++;
			nilai = nilai = 1 ;
		}
	}

}
