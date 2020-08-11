package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class Ranking 
{
	@GeneratedValue
	@Id	

	private int id;
	private String RanKing;
	
	@OneToOne
	private Persona persona;
	
	
	@OneToOne
	private Ranking raking;
	
	
	
	
	public Ranking() {
		super();
	}


	public Ranking(int id) {
		super();
		this.id = id;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRanKing() {
		return RanKing;
	}


	public void setRanKing(String ranKing) {
		RanKing = ranKing;
	}


	

	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	

	public Ranking getRaking() {
		return raking;
	}


	public void setRaking(Ranking raking) {
		this.raking = raking;
	}


	@Override
	public String toString() {
		return "Ranking [id=" + id + ", RanKing=" + RanKing + "]";
	}
	
	
	

}
