package com.verisign.api;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SOAPLoggingHandler implements LogicalHandler<LogicalMessageContext> {

	private static final Logger LOG = LoggerFactory.getLogger(SOAPLoggingHandler.class);

	@Override
	public void close(MessageContext ctx) {
	}

	@Override
	public boolean handleFault(LogicalMessageContext ctx) {
		if(!LOG.isDebugEnabled())
			return false;
		
		Boolean outboundProperty = (Boolean) ctx
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		String msgDirection = (outboundProperty.booleanValue()) ? "Outbound Request"
				: "Inbound Response";

		StringBuilder msg = new StringBuilder();
		msg.append(msgDirection)
			.append(" {exception}")
			.append(getXML(ctx.getMessage()))
			;

		LOG.debug(msg.toString());
		return false;
	}

	@Override
	public boolean handleMessage(LogicalMessageContext ctx) {
		if(!LOG.isDebugEnabled())
			return true;

		Boolean outboundProperty = (Boolean) ctx
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		String msgDirection = (outboundProperty.booleanValue()) ? "Outbound Request"
				: "Inbound Response";
		StringBuilder msg = new StringBuilder();
		msg.append(msgDirection)
			.append(getXML(ctx.getMessage()))
			;

		LOG.debug(msg.toString());
		return true;
	}
	
	private String getXML(LogicalMessage aMsg) {
		Source src = aMsg.getPayload();
		StreamResult result = new StreamResult(new StringWriter());

		try {
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer = factory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(
					"{http://xml.apache.org/xslt}indent-amount", "4");
			transformer.transform(src, result);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result.getWriter().toString();
	}


}
