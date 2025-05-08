package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassA1.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassA1_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA1#classB1
	 **/
	public static volatile SingularAttribute<ClassA1, ClassB1> classB1;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA1#attributeA
	 **/
	public static volatile SingularAttribute<ClassA1, String> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA1#id
	 **/
	public static volatile SingularAttribute<ClassA1, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA1
	 **/
	public static volatile EntityType<ClassA1> class_;

	public static final String CLASS_B1 = "classB1";
	public static final String ATTRIBUTE_A = "attributeA";
	public static final String ID = "id";

}

