package Entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Habilidades {
	@GeneratedValue
	@Id	

	
	
	private int id;
	private String volar;
	
	@OneToMany(mappedBy = "ranking")
	private List<Ranking>ranking = new ArrayList<Ranking>();
	
	
	public Habilidades() {
	}



	public Habilidades( String volar) {
		super();
		
		this.volar = volar;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getVolar() {
		return volar;
	}



	public void setVolar(String volar) {
		this.volar = volar;
	}


	

	

	public List<Ranking> getRanking() {
		return ranking;
	}



	public void setRanking(List<Ranking> ranking) {
		this.ranking = ranking;
	}



	@Override
	public String toString() {
		return "Habilidades [id=" + id + ", volar=" + volar + "]";
	}
	

}
