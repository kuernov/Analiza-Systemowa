package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OpowiedzNaPytanie.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OpowiedzNaPytanie_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.OpowiedzNaPytanie#pytanie
	 **/
	public static volatile SingularAttribute<OpowiedzNaPytanie, PytanieNaWizyteStudyjna> pytanie;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OpowiedzNaPytanie#raport
	 **/
	public static volatile SingularAttribute<OpowiedzNaPytanie, RaportWizytyStudyjnej> raport;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OpowiedzNaPytanie#odpowiedz
	 **/
	public static volatile SingularAttribute<OpowiedzNaPytanie, String> odpowiedz;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OpowiedzNaPytanie#id
	 **/
	public static volatile SingularAttribute<OpowiedzNaPytanie, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OpowiedzNaPytanie
	 **/
	public static volatile EntityType<OpowiedzNaPytanie> class_;

	public static final String PYTANIE = "pytanie";
	public static final String RAPORT = "raport";
	public static final String ODPOWIEDZ = "odpowiedz";
	public static final String ID = "id";

}

