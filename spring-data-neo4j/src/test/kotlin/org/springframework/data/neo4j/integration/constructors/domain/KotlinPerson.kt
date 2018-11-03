/*
 * Copyright (c)  [2011-2018] "Pivotal Software, Inc." / "Neo Technology" / "Graph Aware Ltd."
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

package org.springframework.data.neo4j.integration.constructors.domain

import org.jetbrains.annotations.NotNull
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship
import org.springframework.lang.NonNull

/**
 * @author Nicolas Mervaillie
 */
@NodeEntity
data class KotlinPerson(
        @Id var name: String,
        @NonNull @NotNull var firstName: String,
        @Relationship var thing: Thing,
        @Relationship var friendships: List<KotlinFriendship> = emptyList<KotlinFriendship>()) {
}

@NodeEntity
data class Thing(
        @Id var name: String
)