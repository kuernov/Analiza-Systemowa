package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassA2.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassA2_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA2#attributeA
	 **/
	public static volatile SingularAttribute<ClassA2, String> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA2#classB2
	 **/
	public static volatile SetAttribute<ClassA2, ClassB2> classB2;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA2#id
	 **/
	public static volatile SingularAttribute<ClassA2, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA2
	 **/
	public static volatile EntityType<ClassA2> class_;

	public static final String ATTRIBUTE_A = "attributeA";
	public static final String CLASS_B2 = "classB2";
	public static final String ID = "id";

}

