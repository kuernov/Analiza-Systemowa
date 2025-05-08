package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RaportWizytyStudyjnej.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class RaportWizytyStudyjnej_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportWizytyStudyjnej#projekt
	 **/
	public static volatile SingularAttribute<RaportWizytyStudyjnej, Projekt> projekt;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportWizytyStudyjnej#odpowiedzi
	 **/
	public static volatile ListAttribute<RaportWizytyStudyjnej, OpowiedzNaPytanie> odpowiedzi;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportWizytyStudyjnej#id
	 **/
	public static volatile SingularAttribute<RaportWizytyStudyjnej, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportWizytyStudyjnej
	 **/
	public static volatile EntityType<RaportWizytyStudyjnej> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportWizytyStudyjnej#zalaczniki
	 **/
	public static volatile SingularAttribute<RaportWizytyStudyjnej, Dokument> zalaczniki;

	public static final String PROJEKT = "projekt";
	public static final String ODPOWIEDZI = "odpowiedzi";
	public static final String ID = "id";
	public static final String ZALACZNIKI = "zalaczniki";

}

