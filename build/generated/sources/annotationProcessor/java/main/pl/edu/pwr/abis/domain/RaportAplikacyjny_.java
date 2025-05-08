package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RaportAplikacyjny.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class RaportAplikacyjny_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportAplikacyjny#czyZatwierdzony
	 **/
	public static volatile SingularAttribute<RaportAplikacyjny, Boolean> czyZatwierdzony;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportAplikacyjny
	 **/
	public static volatile EmbeddableType<RaportAplikacyjny> class_;

	public static final String CZY_ZATWIERDZONY = "czyZatwierdzony";

}

