package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Ocena.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Ocena_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Ocena#projekt
	 **/
	public static volatile SingularAttribute<Ocena, Projekt> projekt;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Ocena#czyZatwierdzona
	 **/
	public static volatile SingularAttribute<Ocena, Boolean> czyZatwierdzona;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Ocena#ocenaPEM
	 **/
	public static volatile ListAttribute<Ocena, OcenaPEM> ocenaPEM;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Ocena#planowanaDataOpracowania
	 **/
	public static volatile SingularAttribute<Ocena, LocalDateTime> planowanaDataOpracowania;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Ocena#id
	 **/
	public static volatile SingularAttribute<Ocena, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Ocena
	 **/
	public static volatile EntityType<Ocena> class_;

	public static final String PROJEKT = "projekt";
	public static final String CZY_ZATWIERDZONA = "czyZatwierdzona";
	public static final String OCENA_PE_M = "ocenaPEM";
	public static final String PLANOWANA_DATA_OPRACOWANIA = "planowanaDataOpracowania";
	public static final String ID = "id";

}

