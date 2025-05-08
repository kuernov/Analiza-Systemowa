package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(OcenaIndywidualna.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OcenaIndywidualna_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna#projekt
	 **/
	public static volatile SingularAttribute<OcenaIndywidualna, Projekt> projekt;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna#czyZatwierdzona
	 **/
	public static volatile SingularAttribute<OcenaIndywidualna, Boolean> czyZatwierdzona;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna#planowanaDataOpracowania
	 **/
	public static volatile SingularAttribute<OcenaIndywidualna, LocalDateTime> planowanaDataOpracowania;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna#asesor
	 **/
	public static volatile SingularAttribute<OcenaIndywidualna, Asesor> asesor;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna#id
	 **/
	public static volatile SingularAttribute<OcenaIndywidualna, OcenaIndywidualnaId> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna
	 **/
	public static volatile EntityType<OcenaIndywidualna> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualna#ocena
	 **/
	public static volatile SingularAttribute<OcenaIndywidualna, String> ocena;

	public static final String PROJEKT = "projekt";
	public static final String CZY_ZATWIERDZONA = "czyZatwierdzona";
	public static final String PLANOWANA_DATA_OPRACOWANIA = "planowanaDataOpracowania";
	public static final String ASESOR = "asesor";
	public static final String ID = "id";
	public static final String OCENA = "ocena";

}

