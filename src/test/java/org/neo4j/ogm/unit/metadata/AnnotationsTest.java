package org.neo4j.ogm.unit.metadata;

import org.junit.Test;
import org.neo4j.ogm.metadata.MetaData;

import static org.junit.Assert.assertEquals;

/**
 * @author vince
 */
public class AnnotationsTest {


    @Test
    public void shouldLoadMetaDataWithComplexAnnotations() {

        MetaData metaData = new MetaData("org.neo4j.ogm.domain.annotations");

        assertEquals("org.neo4j.ogm.domain.annotations.SimpleNode", metaData.classInfo("SimpleNode").name());
        assertEquals("org.neo4j.ogm.domain.annotations.OtherNode", metaData.classInfo("OtherNode").name());

    }
}
