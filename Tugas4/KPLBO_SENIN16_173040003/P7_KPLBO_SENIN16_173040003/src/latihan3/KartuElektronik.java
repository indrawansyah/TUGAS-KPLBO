package latihan3;

public abstract class KartuElektronik implements Kartu {
	protected String kodeBank;
	protected String PIN;

	public KartuElektronik(String kodeBank, String PIN) {
		this.kodeBank = kodeBank;
		this.PIN = encode(PIN);

	}

	public boolean otentikasi(String pin) {
		if (this.PIN.equals(encode(pin))) {
			return true;

		} else {
			return false;
		}
	}

	public String getKodeBank() {
		return kodeBank;
	}

}
