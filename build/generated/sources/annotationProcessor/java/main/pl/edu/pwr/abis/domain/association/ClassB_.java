package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassB.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassB_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB#classA
	 **/
	public static volatile SingularAttribute<ClassB, ClassA> classA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB#classA_
	 **/
	public static volatile SingularAttribute<ClassB, ClassA> classA_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB#id
	 **/
	public static volatile SingularAttribute<ClassB, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB#attributeB
	 **/
	public static volatile SingularAttribute<ClassB, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB
	 **/
	public static volatile EntityType<ClassB> class_;

	public static final String CLASS_A = "classA";
	public static final String CLASS_A_ = "classA_";
	public static final String ID = "id";
	public static final String ATTRIBUTE_B = "attributeB";

}

