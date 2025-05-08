package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ZalacznikiAplikacyjne.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ZalacznikiAplikacyjne_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne#zdjecia
	 **/
	public static volatile ListAttribute<ZalacznikiAplikacyjne, Plik> zdjecia;
	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne#listPolecajacy
	 **/
	public static volatile SingularAttribute<ZalacznikiAplikacyjne, Plik> listPolecajacy;
	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne#logotyp
	 **/
	public static volatile SingularAttribute<ZalacznikiAplikacyjne, Plik> logotyp;
	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne#oswiadczenie
	 **/
	public static volatile SingularAttribute<ZalacznikiAplikacyjne, Plik> oswiadczenie;
	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne#film
	 **/
	public static volatile SingularAttribute<ZalacznikiAplikacyjne, Plik> film;
	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne
	 **/
	public static volatile EmbeddableType<ZalacznikiAplikacyjne> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.ZalacznikiAplikacyjne#oswiadczenieInicjatora
	 **/
	public static volatile SingularAttribute<ZalacznikiAplikacyjne, Plik> oswiadczenieInicjatora;

	public static final String ZDJECIA = "zdjecia";
	public static final String LIST_POLECAJACY = "listPolecajacy";
	public static final String LOGOTYP = "logotyp";
	public static final String OSWIADCZENIE = "oswiadczenie";
	public static final String FILM = "film";
	public static final String OSWIADCZENIE_INICJATORA = "oswiadczenieInicjatora";

}

