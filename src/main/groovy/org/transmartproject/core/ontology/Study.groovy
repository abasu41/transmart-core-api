package org.transmartproject.core.ontology

import org.transmartproject.core.dataquery.Patient
import org.transmartproject.core.users.ProtectedResource

/**
 * A study (or trial) represents a unit of patients and data for these patients.
 */
public interface Study extends ProtectedResource {

    /**
     * The (hopefully unique) name of the study.
     *
     * This is the <code>{@link #getOntologyTerm()}.name</code> in uppercase.
     *
     * @return the name of the study
     */
    String getName()

    /**
     * The ontology term object associated with this object.
     * @return the ontology term
     */
    OntologyTerm getOntologyTerm()

    /**
     * All the patients belonging to this study.
     * @return the patients for this study
     */
    Set<Patient> getPatients()
}
