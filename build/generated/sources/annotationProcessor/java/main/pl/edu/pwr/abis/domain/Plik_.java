package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Plik.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Plik_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Plik#rozmiar
	 **/
	public static volatile SingularAttribute<Plik, Float> rozmiar;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Plik#rozszerzenie
	 **/
	public static volatile SingularAttribute<Plik, String> rozszerzenie;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Plik
	 **/
	public static volatile EmbeddableType<Plik> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Plik#nazwa
	 **/
	public static volatile SingularAttribute<Plik, String> nazwa;

	public static final String ROZMIAR = "rozmiar";
	public static final String ROZSZERZENIE = "rozszerzenie";
	public static final String NAZWA = "nazwa";

}

