package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OcenaKoncowa.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OcenaKoncowa_ extends pl.edu.pwr.abis.domain.Ocena_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaKoncowa#projekt
	 **/
	public static volatile SingularAttribute<OcenaKoncowa, Projekt> projekt;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaKoncowa#raportOcenyKoncowej
	 **/
	public static volatile ListAttribute<OcenaKoncowa, RaportOcenyKoncowej> raportOcenyKoncowej;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaKoncowa
	 **/
	public static volatile EntityType<OcenaKoncowa> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaKoncowa#status
	 **/
	public static volatile SingularAttribute<OcenaKoncowa, StatusOcenyKoncowej> status;

	public static final String PROJEKT = "projekt";
	public static final String RAPORT_OCENY_KONCOWEJ = "raportOcenyKoncowej";
	public static final String STATUS = "status";

}

