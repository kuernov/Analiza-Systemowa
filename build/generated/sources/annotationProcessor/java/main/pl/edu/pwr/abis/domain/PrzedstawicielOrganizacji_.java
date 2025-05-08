package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PrzedstawicielOrganizacji.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PrzedstawicielOrganizacji_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.PrzedstawicielOrganizacji#aplikant
	 **/
	public static volatile SingularAttribute<PrzedstawicielOrganizacji, Aplikant> aplikant;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PrzedstawicielOrganizacji#dane
	 **/
	public static volatile SingularAttribute<PrzedstawicielOrganizacji, DaneKontaktowe> dane;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PrzedstawicielOrganizacji#id
	 **/
	public static volatile SingularAttribute<PrzedstawicielOrganizacji, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PrzedstawicielOrganizacji
	 **/
	public static volatile EntityType<PrzedstawicielOrganizacji> class_;

	public static final String APLIKANT = "aplikant";
	public static final String DANE = "dane";
	public static final String ID = "id";

}

