/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.stanbol.entityhub.yard.solr.impl.queryencoders;

import java.util.Arrays;
import java.util.Collection;

import org.apache.stanbol.entityhub.yard.solr.model.IndexValue;
import org.apache.stanbol.entityhub.yard.solr.model.IndexValueFactory;
import org.apache.stanbol.entityhub.yard.solr.query.ConstraintTypePosition;
import org.apache.stanbol.entityhub.yard.solr.query.EncodedConstraintParts;
import org.apache.stanbol.entityhub.yard.solr.query.IndexConstraintTypeEncoder;
import org.apache.stanbol.entityhub.yard.solr.query.IndexConstraintTypeEnum;
import org.apache.stanbol.entityhub.yard.solr.query.ConstraintTypePosition.PositionType;

public class LeEncoder implements IndexConstraintTypeEncoder<Object> {
    private static final ConstraintTypePosition POS = new ConstraintTypePosition(PositionType.value, 2);
    private static final String DEFAULT = "*";

    private IndexValueFactory indexValueFactory;

    public LeEncoder(IndexValueFactory indexValueFactory) {
        if (indexValueFactory == null) {
            throw new IllegalArgumentException("The parsed IndexValueFactory MUST NOT be NULL!");
        }
        this.indexValueFactory = indexValueFactory;
    }

    @Override
    public void encode(EncodedConstraintParts constraint, Object value) {
        IndexValue indexValue;
        if (value == null) {
            indexValue = null; // default value
        } else if (value instanceof IndexValue) {
            indexValue = (IndexValue) value;
        } else {
            indexValue = indexValueFactory.createIndexValue(value);
        }
        String geConstraint = String
                .format("TO %s]", indexValue != null && indexValue.getValue() != null
                                  && !indexValue.getValue().isEmpty() ? indexValue.getValue() : DEFAULT);
        constraint.addEncoded(POS, geConstraint);
    }

    @Override
    public boolean supportsDefault() {
        return true;
    }

    @Override
    public Collection<IndexConstraintTypeEnum> dependsOn() {
        return Arrays.asList(IndexConstraintTypeEnum.GE);
    }

    @Override
    public IndexConstraintTypeEnum encodes() {
        return IndexConstraintTypeEnum.LE;
    }

    @Override
    public Class<Object> acceptsValueType() {
        return Object.class;
    }

}
