package bookstore.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class kirja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
    private Long id;
    private String Nimike;
    private String Tekija;
    private String Vuosi;
    
    public kirja() {}
    
	public kirja(String nimike, String tekija, String vuosi) {
		super();
		Nimike = nimike;
		Tekija = tekija;
		Vuosi = vuosi;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNimike() {
		return Nimike;
	}


	public void setNimike(String nimike) {
		Nimike = nimike;
	}


	public String getTekija() {
		return Tekija;
	}


	public void setTekija(String tekija) {
		Tekija = tekija;
	}


	public String getVuosi() {
		return Vuosi;
	}


	public void setVuosi(String vuosi) {
		Vuosi = vuosi;
	}

	@Override
	public String toString() {
		return "kirja [id=" + id + ", Nimike=" + Nimike + ", Tekija=" + Tekija + ", Vuosi=" + Vuosi + "]";
	}
    
	

    
}
