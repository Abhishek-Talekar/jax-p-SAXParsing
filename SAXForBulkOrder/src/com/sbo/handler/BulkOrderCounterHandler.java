package com.sbo.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BulkOrderCounterHandler extends DefaultHandler {
	int threshold = 30;
	String elementName;
	int qty;

	@Override
	public void startDocument() throws SAXException {
		elementName = null;
		qty = 0;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("quantity")) {
			this.elementName = qName;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String qData = new String(ch, start, length);
		System.out.println(qData);
		if (elementName != null && elementName.length() > 0) {
			
			if(elementName.equals("quantity"))
			{
				qty = Integer.parseInt(qData);	
				if(qty>=30) {
				System.out.println("Total Quantity:"+qty+" This is Bulk Order.");
				}
				else {
					System.out.println("Not a bulk order as Quantity is:" +qty);
				}
			}
		
			
		}
		elementName = null;
	}

}
