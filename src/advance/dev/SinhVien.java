package advance.dev;

public class SinhVien {
	private String name;
	private int old;
	private float toan;
	private float ly;
	private float hoa;
	
	public SinhVien() {
		
	}
	public float dtb() {
		return( toan + ly + hoa) /3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	public String toString() {
		return String.format(" Name: %s - Old:%d - Dtb:%.1f",name,old,dtb()) ;
	}

}
