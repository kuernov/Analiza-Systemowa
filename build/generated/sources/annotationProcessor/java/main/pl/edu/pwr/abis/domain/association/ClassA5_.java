package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassA5.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassA5_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA5#attributeA
	 **/
	public static volatile SingularAttribute<ClassA5, String> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA5#classB5
	 **/
	public static volatile SetAttribute<ClassA5, ClassB5> classB5;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA5#id
	 **/
	public static volatile SingularAttribute<ClassA5, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA5
	 **/
	public static volatile EntityType<ClassA5> class_;

	public static final String ATTRIBUTE_A = "attributeA";
	public static final String CLASS_B5 = "classB5";
	public static final String ID = "id";

}

