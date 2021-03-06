/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.neo4j.ogm.domain.forum;

import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

/**
 * Represents a forum that contains a number of topics.
 * @author Vince Bickers
 */
public class Forum {

    private Long id;

    @Relationship(type="HAS_TOPIC")
    private List<ForumTopicLink> topicsInForum;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ForumTopicLink> getTopicsInForum() {
        return topicsInForum;
    }

    public void setTopicsInForum(List<ForumTopicLink> topicsInForum) {
        this.topicsInForum = topicsInForum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
