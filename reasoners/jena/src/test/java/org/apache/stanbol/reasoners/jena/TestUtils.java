package org.apache.stanbol.reasoners.jena;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.reasoner.rulesys.Rule;
import com.hp.hpl.jena.util.PrintUtil;

public class TestUtils {

	/**
	 * utility to print lists of statements
	 * 
	 * @param model
	 * @param resource
	 * @param property
	 * @return
	 */
	public static String printStatements(Model model, Resource resource,
			Property property) {

		Resource value = null;

		String output = "";
		StmtIterator iterator;
		if (resource == null && property == null && value == null) {
			iterator = model.listStatements();
		} else {
			iterator = model.listStatements(resource, property, value);
		}
		while (iterator.hasNext()) {
			Statement stmt = iterator.nextStatement();
			output += System.getProperty("line.separator") + " "
					+ PrintUtil.print(stmt);
		}
		return output;
	}

	/**
	 * Check whether a set of expected statements are present in the result set.
	 * Returns a set of expected statements which are NOT present in the result.
	 * 
	 * @param result
	 * @param expected
	 * @return
	 */
	public static Set<Statement> expectedStatementsCheck(
			Set<Statement> inferred, Set<Statement> expected) {
		Set<Statement> notInInferred = new HashSet<Statement>();
		for (Statement stat : expected) {
			if (!inferred.contains(stat)) {
				notInInferred.add(stat);
			}
		}
		return notInInferred;
	}

	/**
	 * This utility gets a jena rules file content string and parse it to return
	 * a List of Rule objects
	 * 
	 * @param source
	 * @return
	 */
	public static List<Rule> parseRuleStringAsFile(String source) {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(source.getBytes())));
		Rule.Parser parser = Rule.rulesParserFromReader(br);
		List<Rule> rules = Rule.parseRules(parser);
		return rules;
	}
}
