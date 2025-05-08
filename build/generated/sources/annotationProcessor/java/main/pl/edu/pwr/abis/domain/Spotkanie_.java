package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Spotkanie.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Spotkanie_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Spotkanie#miejsce
	 **/
	public static volatile SingularAttribute<Spotkanie, Adres> miejsce;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Spotkanie#termin
	 **/
	public static volatile SingularAttribute<Spotkanie, LocalDateTime> termin;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Spotkanie#harmonogram
	 **/
	public static volatile SingularAttribute<Spotkanie, Harmonogram> harmonogram;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Spotkanie#typ
	 **/
	public static volatile SingularAttribute<Spotkanie, TypSpotkania> typ;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Spotkanie#id
	 **/
	public static volatile SingularAttribute<Spotkanie, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Spotkanie
	 **/
	public static volatile EntityType<Spotkanie> class_;

	public static final String MIEJSCE = "miejsce";
	public static final String TERMIN = "termin";
	public static final String HARMONOGRAM = "harmonogram";
	public static final String TYP = "typ";
	public static final String ID = "id";

}

