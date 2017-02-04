package id.demo.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@ManagedBean(name = "dummyBean")
@RequestScoped
public class DummyBean {
	
	private String msg;
	
	public DummyBean() {
		this.setMsg(this.readDummyValueFromBackend());
	}
	
	private String readDummyValueFromBackend() {
		String backendDummyUrl = "http://localhost:8080/backend/rest/dummy/hello/pippo";
		try {
			HttpResponse<String> response = Unirest.get(backendDummyUrl).asString();
			return response.getBody();
		} catch (UnirestException e) {
			e.printStackTrace();
			return "*** ERRORE CHIAMATA BACKEND ***";
		}
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
