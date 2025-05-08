package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Webinarium.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Webinarium_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Webinarium#termin
	 **/
	public static volatile SingularAttribute<Webinarium, LocalDateTime> termin;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Webinarium#harmonogram
	 **/
	public static volatile SingularAttribute<Webinarium, Harmonogram> harmonogram;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Webinarium#typ
	 **/
	public static volatile SingularAttribute<Webinarium, TypWebinarium> typ;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Webinarium#id
	 **/
	public static volatile SingularAttribute<Webinarium, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Webinarium#trener
	 **/
	public static volatile SingularAttribute<Webinarium, Osoba> trener;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Webinarium
	 **/
	public static volatile EntityType<Webinarium> class_;

	public static final String TERMIN = "termin";
	public static final String HARMONOGRAM = "harmonogram";
	public static final String TYP = "typ";
	public static final String ID = "id";
	public static final String TRENER = "trener";

}

