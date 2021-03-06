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
package org.apache.stanbol.ontologymanager.ontonet.api.scope;

import java.util.Set;

/**
 * A registry that keeps track of the active ontology scopes in a running KReS instance. <br>
 * <br>
 * TODO deprecate scope registration methods and manage registration automcatically.
 * 
 * @author alexdma
 * 
 */
public interface ScopeRegistry {

    /**
     * Adds a scope registration listener to this registry. If the listener was already added, this should
     * result in no effect.
     * 
     * @param listener
     *            the listener to be added
     */
    void addScopeRegistrationListener(ScopeEventListener listener);

    /**
     * Removes all registered scope registration listeners.
     */
    void clearScopeRegistrationListeners();

    /**
     * 
     * @param scopeID
     * @return true iff an ontology scope with ID <code>scopeID</code> is registered.
     */
    boolean containsScope(String scopeID);

    /**
     * Removes an ontology scope from this registry, thus deactivating the scope and all of its associated
     * spaces. All attached listeners should hear this deregistration on their
     * <code>scopeDeregistered()</code> method.
     * 
     * @param scope
     *            the ontology scope to be removed
     */
    void deregisterScope(OntologyScope scope);

    /**
     * Returns the set of registered ontology scopes.
     * 
     * @return the set of ontology scopes
     */
    Set<OntologyScope> getRegisteredScopes();

    /**
     * Returns the unique ontology scope identified by the given ID.
     * 
     * @param scopeID
     *            the scope identifier
     * @return the ontology scope with that ID, or null if no scope with such ID is registered
     */
    OntologyScope getScope(String scopeID);

    void setScopeActive(String scopeID, boolean active);

    boolean isScopeActive(String scopeID);

    Set<OntologyScope> getActiveScopes();

    /**
     * Returns the set of registered scope registration listeners, in no particular order.
     * 
     * @return the set of scope registration listeners
     */
    Set<ScopeEventListener> getScopeRegistrationListeners();

    /**
     * Equivalent to <code>registerScope(scope, false)</code>.
     * 
     * @param scope
     *            the ontology scope to be added
     */
    void registerScope(OntologyScope scope);

    /**
     * Adds an ontology scope to this registry, thus activating the scope if <code>activate</code> is set and
     * (at a bare minumum) its core space. All attached listeners should hear this registration on their
     * <code>scopeRegistered()</code> method.
     * 
     * @param scope
     *            the ontology scope to be added
     */
    void registerScope(OntologyScope scope, boolean activate);

    /**
     * Removes a scope registration listener from this registry. If the listener was not previously added,
     * this should result in no effect.
     * 
     * @param listener
     *            the listener to be removed
     */
    void removeScopeRegistrationListener(ScopeEventListener listener);

}
