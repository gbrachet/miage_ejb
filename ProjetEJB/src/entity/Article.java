package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Article database table.
 * 
 */
@Entity
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idArticle;

	private Object corps;

	private Timestamp miseAJour;

	private float prix;

	private Timestamp publication;

	private Object resume;

	private String statut;

	private String titre;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="utilisateur")
	private Utilisateur utilisateurBean;

	//bi-directional many-to-many association to Groupe
	@ManyToMany(mappedBy="articles")
	private List<Groupe> groupes;

	//bi-directional many-to-one association to LigneCommande
	@OneToMany(mappedBy="articleBean")
	private List<LigneCommande> ligneCommandes;

	//bi-directional many-to-one association to Tag
	@OneToMany(mappedBy="articleBean")
	private List<Tag> tags;

	public Article() {
	}

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public Object getCorps() {
		return this.corps;
	}

	public void setCorps(Object corps) {
		this.corps = corps;
	}

	public Timestamp getMiseAJour() {
		return this.miseAJour;
	}

	public void setMiseAJour(Timestamp miseAJour) {
		this.miseAJour = miseAJour;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Timestamp getPublication() {
		return this.publication;
	}

	public void setPublication(Timestamp publication) {
		this.publication = publication;
	}

	public Object getResume() {
		return this.resume;
	}

	public void setResume(Object resume) {
		this.resume = resume;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Utilisateur getUtilisateurBean() {
		return this.utilisateurBean;
	}

	public void setUtilisateurBean(Utilisateur utilisateurBean) {
		this.utilisateurBean = utilisateurBean;
	}

	public List<Groupe> getGroupes() {
		return this.groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public List<LigneCommande> getLigneCommandes() {
		return this.ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}