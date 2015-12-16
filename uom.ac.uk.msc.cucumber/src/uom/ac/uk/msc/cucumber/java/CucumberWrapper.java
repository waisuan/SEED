package uom.ac.uk.msc.cucumber.java;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class CucumberWrapper {
	private String message;
	private String code;
	private EObject source;
	private EAttribute literal;
	private ArrayList<String> data = new ArrayList<String>();

	public CucumberWrapper() {
	}

	public CucumberWrapper(EObject source, EAttribute literal, String code,
			String message) {
		this.source = source;
		this.literal = literal;
		this.code = code;
		this.message = message;
	}

	public CucumberWrapper(EObject source, String data, EAttribute literal,
			String code, String message) {
		this.source = source;
		this.data.add(data);
		this.literal = literal;
		this.code = code;
		this.message = message;
	}

	public CucumberWrapper(EObject source, List<String> data,
			EAttribute literal, String code, String message) {
		this.source = source;
		this.data.addAll(data);
		this.literal = literal;
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public EObject getSource() {
		return source;
	}

	public void setSource(EObject source) {
		this.source = source;
	}

	public EAttribute getLiteral() {
		return literal;
	}

	public void setLiteral(EAttribute literal) {
		this.literal = literal;
	}

	public String[] getData() {
		return data.toArray(new String[data.size()]);
	}

	public void setData(String data) {
		this.data.add(data);
	}

	public void setData(List<String> data) {
		this.data.addAll(data);
	}

}
