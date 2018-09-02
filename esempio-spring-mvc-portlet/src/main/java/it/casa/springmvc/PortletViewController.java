package it.casa.springmvc;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;





@Controller("PortletViewController")
@RequestMapping("VIEW")
public class PortletViewController {
	
	
	@RenderMapping
	public String defaultPortlet1Render(RenderRequest renderRequest, RenderResponse renderResource , Model model) {
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		renderRequest.setAttribute("name", "Nome settato nel controller");		
		return "view";
	}

}
