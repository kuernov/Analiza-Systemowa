package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SystemKsiegowy.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class SystemKsiegowy_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.SystemKsiegowy#aplikanci
	 **/
	public static volatile ListAttribute<SystemKsiegowy, Aplikant> aplikanci;
	
	/**
	 * @see pl.edu.pwr.abis.domain.SystemKsiegowy#id
	 **/
	public static volatile SingularAttribute<SystemKsiegowy, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.SystemKsiegowy
	 **/
	public static volatile EntityType<SystemKsiegowy> class_;

	public static final String APLIKANCI = "aplikanci";
	public static final String ID = "id";

}

