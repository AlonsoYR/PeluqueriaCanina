package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Dueno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T18:27:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> m_numc;
    public static volatile SingularAttribute<Mascota, String> m_aes;
    public static volatile SingularAttribute<Mascota, String> m_col;
    public static volatile SingularAttribute<Mascota, String> m_obs;
    public static volatile SingularAttribute<Mascota, String> m_ale;
    public static volatile SingularAttribute<Mascota, String> m_raz;
    public static volatile SingularAttribute<Mascota, Dueno> due;
    public static volatile SingularAttribute<Mascota, String> m_nom;

}