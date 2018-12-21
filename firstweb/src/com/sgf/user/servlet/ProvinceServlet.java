package com.sgf.user.servlet;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import javax.management.Attribute;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuers on 2018/9/25.
 */
public class ProvinceServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        // 使用DOM4J解析xml文档
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/com/test/testxml/china.xml");
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(inputStream);
            // xpath查询所有province元素的name属性
            List<Attribute> provinceNameAttributeList = document.selectNodes("//province/@name");
            // 用来装载所有name属性值
            List<String> provinceNames = new ArrayList();
            // 遍历每个属性，获取属性名称，添加到list中
            for(Attribute proAttr : provinceNameAttributeList) {
                provinceNames.add((String) proAttr.getValue());
            }
            String str = provinceNames.toString();
            resp.getWriter().print(str.substring(1, str.length()-1));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
