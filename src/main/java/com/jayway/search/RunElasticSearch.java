package com.jayway.search;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;

public class RunElasticSearch {
	
	public static void main(String[] args) throws Exception {
		Node node = nodeBuilder().local(true).node();
		
		System.out.println("[Press any key to quit]");
		System.in.read();
		node.close();
	}
}
