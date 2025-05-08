package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Organizacja.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Organizacja_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#czyZweryfikowany
	 **/
	public static volatile SingularAttribute<Organizacja, Boolean> czyZweryfikowany;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#aplikanci
	 **/
	public static volatile ListAttribute<Organizacja, Aplikant> aplikanci;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#id
	 **/
	public static volatile SingularAttribute<Organizacja, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#adres
	 **/
	public static volatile SingularAttribute<Organizacja, Adres> adres;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#numerNIP
	 **/
	public static volatile SingularAttribute<Organizacja, String> numerNIP;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja
	 **/
	public static volatile EntityType<Organizacja> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#nazwa
	 **/
	public static volatile SingularAttribute<Organizacja, String> nazwa;
	
	/**
	 * @see pl.edu.pwr.abis.domain.Organizacja#eksperci
	 **/
	public static volatile ListAttribute<Organizacja, EkspertIPMA> eksperci;

	public static final String CZY_ZWERYFIKOWANY = "czyZweryfikowany";
	public static final String APLIKANCI = "aplikanci";
	public static final String ID = "id";
	public static final String ADRES = "adres";
	public static final String NUMER_NI_P = "numerNIP";
	public static final String NAZWA = "nazwa";
	public static final String EKSPERCI = "eksperci";

}

