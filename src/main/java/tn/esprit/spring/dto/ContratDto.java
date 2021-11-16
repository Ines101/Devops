package tn.esprit.spring.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import tn.esprit.spring.entities.TypeContrat;


@Data
@AllArgsConstructor
public class ContratDto {
	
	private int reference;
	private float salaire;
	private Date DateDebut;
	private String dureecontrat;
	private String type;
	
	public ContratDto(int reference, Date dateDebut, String typeContrat, float salaire) {
		super();
		this.reference = reference;
		this.DateDebut = dateDebut;
		this.type = typeContrat;
		this.salaire = salaire;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public String getDureecontrat() {
		return dureecontrat;
	}

	public void setDureecontrat(String dureecontrat) {
		this.dureecontrat = dureecontrat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
