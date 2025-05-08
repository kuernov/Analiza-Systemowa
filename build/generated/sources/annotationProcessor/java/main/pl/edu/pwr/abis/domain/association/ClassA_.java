package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassA.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassA_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA#classB_
	 **/
	public static volatile SingularAttribute<ClassA, ClassB> classB_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA#classB
	 **/
	public static volatile SingularAttribute<ClassA, ClassB> classB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA#attributeA
	 **/
	public static volatile SingularAttribute<ClassA, String> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA#id
	 **/
	public static volatile SingularAttribute<ClassA, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassA
	 **/
	public static volatile EntityType<ClassA> class_;

	public static final String CLASS_B_ = "classB_";
	public static final String CLASS_B = "classB";
	public static final String ATTRIBUTE_A = "attributeA";
	public static final String ID = "id";

}

