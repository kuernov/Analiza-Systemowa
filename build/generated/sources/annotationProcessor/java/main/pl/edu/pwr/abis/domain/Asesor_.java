package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Asesor.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Asesor_ extends pl.edu.pwr.abis.domain.EkspertIPMA_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Asesor#ocenyIndywidualne
	 **/
	public static volatile SetAttribute<Asesor, OcenaIndywidualna> ocenyIndywidualne;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Asesor#id
	 **/
	public static volatile SingularAttribute<Asesor, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Asesor
	 **/
	public static volatile EntityType<Asesor> class_;

	public static final String OCENY_INDYWIDUALNE = "ocenyIndywidualne";
	public static final String ID = "id";

}

