package id.demo.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "dummyBean")
@RequestScoped
public class DummyBean {
	
	private String msg;
	
	public DummyBean() {
		this.setMsg("Messaggio dummy");
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
