package org.lessons.java.christmas;

public class Gift {

	//Declaring variables
	private String regalo;
	private String destinatario;
	
	
	
	//Constructor
	public Gift(String regalo, String destinatario) {
		
		setRegalo(regalo);
		setDestinatario(destinatario);
		
	}



	
	//Regalo functions
	public String getRegalo() {
		return regalo;
	}

	public void setRegalo(String regalo) {
		this.regalo = regalo;
	}



	
	//Destinatario functions
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
	
	
	@Override
    public String toString() {
        return "Regalo: " + getRegalo() + " - Destinatario: " + getDestinatario();
    }
	
}
