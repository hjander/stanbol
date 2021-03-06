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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.17 at 10:53:39 AM EEST 
//


package org.apache.stanbol.cmsadapter.servicesapi.model.web;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMSObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMSObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}uniqueRef"/>
 *         &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}localname"/>
 *         &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}namespace" minOccurs="0"/>
 *         &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}objectTypeRef"/>
 *         &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}parentRef" minOccurs="0"/>
 *         &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}path"/>
 *         &lt;sequence>
 *           &lt;element ref="{web.model.servicesapi.cmsadapter.stanbol.apache.org}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="children" type="{web.model.servicesapi.cmsadapter.stanbol.apache.org}CMSObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMSObject", propOrder = {
    "uniqueRef",
    "localname",
    "namespace",
    "objectTypeRef",
    "parentRef",
    "path",
    "property",
    "children"
})
@XmlSeeAlso({
    ClassificationObject.class,
    ContentObject.class
})
public class CMSObject {

    @XmlElement(required = true)
    protected String uniqueRef;
    @XmlElement(required = true)
    protected String localname;
    protected String namespace;
    @XmlElement(required = true)
    protected String objectTypeRef;
    protected String parentRef;
    @XmlElement(required = true)
    protected String path;
    protected List<Property> property;
    protected List<CMSObject> children;

    /**
     * Gets the value of the uniqueRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRef() {
        return uniqueRef;
    }

    /**
     * Sets the value of the uniqueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRef(String value) {
        this.uniqueRef = value;
    }

    /**
     * Gets the value of the localname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalname() {
        return localname;
    }

    /**
     * Sets the value of the localname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalname(String value) {
        this.localname = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the objectTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTypeRef() {
        return objectTypeRef;
    }

    /**
     * Sets the value of the objectTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTypeRef(String value) {
        this.objectTypeRef = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRef(String value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMSObject }
     * 
     * 
     */
    public List<CMSObject> getChildren() {
        if (children == null) {
            children = new ArrayList<CMSObject>();
        }
        return this.children;
    }

}
