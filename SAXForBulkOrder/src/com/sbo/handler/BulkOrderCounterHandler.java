package com.sbo.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BulkOrderCounterHandler extends DefaultHandler{
	int threshold = 30;
	String elementName;
	int qty;
	@Override
	public void startDocument() throws SAXException {
		this.elementName = elementName;
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		attributes.getLength();
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

	}
	

}
