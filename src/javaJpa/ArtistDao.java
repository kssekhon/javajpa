package javaJpa;

import javax.persistence.EntityManager;

public class ArtistDao {
	/**
	 * @param entityManager
	 */
	public ArtistDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	private EntityManager entityManager;
	

	public void createArtist(Artist artist) {
		entityManager.getTransaction().begin();
		entityManager.persist(artist);
		entityManager.getTransaction().commit();
    }
}
