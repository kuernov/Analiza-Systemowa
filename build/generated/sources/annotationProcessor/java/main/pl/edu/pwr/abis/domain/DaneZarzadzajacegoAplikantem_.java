package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DaneZarzadzajacegoAplikantem.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DaneZarzadzajacegoAplikantem_ extends pl.edu.pwr.abis.domain.DaneKontaktowe_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneZarzadzajacegoAplikantem#stanowisko
	 **/
	public static volatile SingularAttribute<DaneZarzadzajacegoAplikantem, String> stanowisko;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneZarzadzajacegoAplikantem
	 **/
	public static volatile EmbeddableType<DaneZarzadzajacegoAplikantem> class_;

	public static final String STANOWISKO = "stanowisko";

}

