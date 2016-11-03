package javaJpa;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertArtist {
	public static final String PERSISTENCE_UNIT_NAME = "javaJpa";
 public static void main(String arg[]){
	 EntityManagerFactory emf =Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	 EntityManager manager=emf.createEntityManager();
	 ArtistDao dao=new ArtistDao(manager);
	 String artistNames[]={"bella","Demif","Helof"};
	 for(String artistName:artistNames){
		 Artist artist=new Artist();
		 artist.setName(artistName);
		 dao.createArtist(artist);
	 }
		
		
 }
}
