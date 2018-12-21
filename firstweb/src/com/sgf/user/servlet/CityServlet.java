package com.sgf.user.servlet;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by yuers on 2018/9/25.
 */
public class CityServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/xml;charset=utf-8");

        // 获取省份参数
        String provinceName = req.getParameter("provinceName");
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("china.xml");
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(input);
            // 查询指定省份名称的<province>元素
            Element provinceElement = (Element)doc.selectSingleNode("//province[@name='" + provinceName + "']");
            // 把元素转换成字符串发送给客户端
            resp.getWriter().print(provinceElement.asXML());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
