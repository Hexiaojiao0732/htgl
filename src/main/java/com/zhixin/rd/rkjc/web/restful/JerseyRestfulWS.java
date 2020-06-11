package com.zhixin.rd.rkjc.web.restful;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.zhixin.rd.rkjc.web.restful.entity.XmlBean;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.jersey.spi.resource.Singleton;
import com.zhixin.rd.rkjc.web.entity.UserEntity;

@Path("/ws")
@Component
@Scope("request")
@Singleton
public class JerseyRestfulWS {

//	@InjectParam
//	private IRoomGroupService roomGroupService;

	/**
	 * Hello Word 测试 http://127.0.0.1:8081/interrogate-web/restful/ws/hello
	 */
	@GET
	@Scope("request")
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		try {
//			roomGroupService.delete(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret = "Hello World!";
		return ret;
	}

	/**
	 * Hello Word 测试 http://127.0.0.1:8081/interrogate-web/restful/ws/hello
	 */
	@GET
	@Scope("request")
	@Path("/head")
	@Produces(MediaType.TEXT_PLAIN)
	public String head(@Context HttpServletRequest request) {
		System.out.println("-------------head------------ " + request.getHeader("AUTH-TOKEN"));
		return request.getHeader("AUTH-TOKEN");
	}

	/**
	 * 传递简单参数测试
	 * http://127.0.0.1:8081/interrogate-web/restful/ws/pathParam/11/22/
	 */
	@GET
	@Scope("request")
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/pathParam/{tokenid}/{userid}")
	public String pathParam(@PathParam("tokenid") String tokenid, @PathParam("userid") String userid,
			@Context HttpServletRequest request) {
		return "return tokenid: " + tokenid + " , userid: " + userid;
	}

	/**
	 * 返回JSON测试 http://127.0.0.1:8081/interrogate-web/restful/ws/listUsers/
	 */
	@GET
	@Scope("request")
	@Path("/listUsers/{token}")
	// @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserEntity> listUsers(@PathParam("token") String token, @Context HttpServletResponse response) {
		if (!"abc".equalsIgnoreCase(token)) {
			try {
				response.sendRedirect("http://127.0.0.1:8081/interrogate-web/403.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		List<UserEntity> users = new ArrayList<UserEntity>();
		for (int i = 0; i < 10; i++) {
			users.add(i, new UserEntity());
		}
		return users;
	}

	/**
	 * 返回JSON测试 http://127.0.0.1:8081/interrogate-web/restful/ws/mapUsers/
	 */
	@GET
	@Scope("request")
	@Path("/mapUsers")
	// @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Map<Integer, UserEntity> mapUsers() {
		Map<Integer, UserEntity> users = new HashMap<Integer, UserEntity>();
		for (int i = 0; i < 10; i++) {
			users.put(i, new UserEntity());
		}
		return users;
	}

	/**
	 * 返回XML测试 http://127.0.0.1:8081/interrogate-web/restful/ws/getXml/
	 */
	@GET
	@Path("/getXml")
	@Produces(MediaType.APPLICATION_XML)
	public XmlBean getXmlBean() {
		XmlBean p = new XmlBean();
		return p;
	}

	/**
	 * 返回XML测试 http://127.0.0.1:8081/interrogate-web/restful/ws/getXmls/
	 */
	@GET
	@Path("/getXmls")
	@Produces(MediaType.APPLICATION_XML)
	public List<XmlBean> getXmlBeans() {
		List<XmlBean> xmls = new ArrayList<XmlBean>();
		for (int i = 0; i < 10; i++) {
			xmls.add(new XmlBean());
		}
		return xmls;
	}

	/**
	 * POST测试 http://127.0.0.1:8081/interrogate-web/restful/ws/postadd/
	 */
	@POST
	@Path("/post")
	@Produces(MediaType.TEXT_PLAIN)
	public String post(@FormParam("id") int id, @FormParam("name") String name) {
		System.out.println("-----------------------post------------------------" + id + " , " + name);
		return "return id: " + id + " , name: " + name;
	}

	/**
	 * POST测试 http://127.0.0.1:8081/interrogate-web/restful/ws/postaddjson/
	 */
	@POST
	@Path("/postJson")
	@Produces(MediaType.APPLICATION_JSON)
	public UserEntity postJson(@FormParam("id") int id, @FormParam("name") String name) {
		System.out.println("-----------------------postJson------------------------" + id + " , " + name);
		UserEntity u = new UserEntity();
		u.setId(id);
		u.setRealName(name);
		return u;
	}

	/**
	 * POST测试 http://127.0.0.1:8081/interrogate-web/restful/ws/postadduserjson/
	 */
	@POST
	@Path("/postUser")
	@Produces(MediaType.APPLICATION_JSON)
	public UserEntity postUser(UserEntity user) {
		System.out.println("-----------------------postUser------------------------" + user);
		user.setDescription("from restful server!!!");
		return user;
	}

	/**
	 * DELETE测试 http://127.0.0.1:8081/interrogate-web/restful/ws/delete/123
	 */
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String delete(@PathParam("id") String id, @Context HttpServletRequest request) {
		return "delete id: " + id;
	}

	/**
	 * PUT测试 http://127.0.0.1:8081/interrogate-web/restful/ws/put
	 */
	@PUT
	@Path("/put")
	@Produces(MediaType.APPLICATION_JSON)
	public UserEntity put(@QueryParam("id") int id, @QueryParam("name") String name) {
		UserEntity u = new UserEntity();
		u.setId(id);
		u.setRealName(name);
		return u;
	}

	/**
	 * POST测试 http://127.0.0.1:8080/interrogate-web/restful/ws/dhcTest
	 */
	@POST
	@Path("/dhcTest")
	@Produces(MediaType.TEXT_PLAIN)
	public String dhcTest(String jsonStr) throws JSONException {
		System.out.println("--------------------------------------");
		System.out.println(jsonStr);
		System.out.println("--------------------------------------");
		JSONObject object = new JSONObject();
		object.put("rtn", 0);
		object.put("message", "OK");
		return object.toString();
	}

}
