package com.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Class modélisant un article
 */
@Entity
@Table(name="Article")
public class Article implements Serializable {
	
	/** Identifiant de Sérialisation  */
	private static final long serialVersionUID = -4011003122881905362L;

	/* Attributs */
	
	@Id
	@GeneratedValue
	@Column(name="idArticle", nullable=false)
	private int idArticle;
	private String titre;
	private String resume;
	private String corps;
	//TODO
//	private List<Tag> tags;
//	private Utilisateur auteur;
	private boolean visible;
	@Temporal(TemporalType.TIMESTAMP)
	private Date publication;
	@Temporal(TemporalType.TIMESTAMP)
	private Date miseAJour;
	
	/* Constructeurs */

	/**
	 * Constructeur vide
	 */
	public Article() {
	}

	/**
	 * Constructeur initialisant les paramètres
	 * @param idArticle
	 * @param titre
	 * @param resume
	 * @param corps
	 * @param visible
	 * @param publication
	 * @param miseAJour
	 */
	public Article(int idArticle, String titre, String resume, String corps,
			boolean visible, Date publication, Date miseAJour) {
		super();
		this.idArticle = idArticle;
		this.titre = titre;
		this.resume = resume;
		this.corps = corps;
		this.visible = visible;
		this.publication = publication;
		this.miseAJour = miseAJour;
	}

	/* Get & Set */
	
	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Date getPublication() {
		return publication;
	}

	public void setPublication(Date publication) {
		this.publication = publication;
	}

	public Date getMiseAJour() {
		return miseAJour;
	}

	public void setMiseAJour(Date miseAJour) {
		this.miseAJour = miseAJour;
	}
}
