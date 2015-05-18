package web;

public class Web {
	int status;
	String name;
	
	public Web() {
		
	}
	
	public Web(String name, int status) {
		this.name = name;
		this.status = status;
	}
	
	public static void hostOn(String IP) {
		;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
