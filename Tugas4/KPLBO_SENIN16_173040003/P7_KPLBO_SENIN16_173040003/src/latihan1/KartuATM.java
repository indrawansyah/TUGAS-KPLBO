package latihan1;

public class KartuATM extends KartuElektronik {

	public KartuATM(String kodeBank, String PIN) {
		super(kodeBank, PIN);
	}

	public String encode(String PIN) {
		return PIN.concat("X");
	}

}
