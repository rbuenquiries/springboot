package beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Phone {
	private String name;
	private String model;
	private int modelyear;
	private int price;
	private String[] contacts;
	private List<String> audiolist;
	private Set<String> whatsappcontacts;
	private Map<String, String> actormovie;

	/*
	 * public Phone() { System.out.println("Phone object"); }
	 */
	public Phone(String name, String model, int modelyear, int price) {
		super();
		System.out.println("Phone object via constructor");
		System.out.println("name"+name);
		System.out.println("model"+model);
		System.out.println("modelyear"+modelyear);
		System.out.println("price"+price);
		this.name = name;
		this.model = model;
		this.modelyear = modelyear;
		this.price = price;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	public void setModel(String model) {
		System.out.println("setModel");
		this.model = model;
	}

	public void setModelyear(int modelyear) {
		System.out.println("setModelyear");
		this.modelyear = modelyear;
	}

	public void setContacts(String[] contacts) {
		System.out.println("setContacts");
		this.contacts = contacts;
	}

	public void setAudiolist(List<String> audiolist) {
		System.out.println("setAudiolist");
		this.audiolist = audiolist;
	}

	public void setWhatsappcontacts(Set<String> whatsappcontacts) {
		System.out.println("setWhatsappcontacts");
		this.whatsappcontacts = whatsappcontacts;
	}

	public void setActormovie(Map<String, String> actormovie) {
		System.out.println("setActormovie");
		this.actormovie = actormovie;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", model=" + model + ", modelyear=" + modelyear + ", price=" + price
				+ ", contacts=" + Arrays.toString(contacts) + ", audiolist=" + audiolist + ", whatsappcontacts="
				+ whatsappcontacts + ", actormovie=" + actormovie + "]";
	}

	

}
