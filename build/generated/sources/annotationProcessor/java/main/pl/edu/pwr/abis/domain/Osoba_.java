package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Osoba.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Osoba_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Osoba
	 **/
	public static volatile EmbeddableType<Osoba> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Osoba#daneKontaktowe
	 **/
	public static volatile SingularAttribute<Osoba, DaneKontaktowe> daneKontaktowe;

	public static final String DANE_KONTAKTOWE = "daneKontaktowe";

}

