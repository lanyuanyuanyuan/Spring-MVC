package com.lanyuanyuan;

/**
 * 一、Spring集成web环境
 * 1.ApplicationContext应用上下文获取方式：
 * 可以使用ServletContextListener监听wen启动，然后创建上下文对象ApplicationContext。
 * Spring提供获取应用上下文的工具
 * 步骤：
 * 1.1 配置ContextLoaderListener监听器
 * 1.2 使用WebApplicationContextUtils获得应用上下文对象
 * 二、SpringMVC框架
 *  1.SpringMVC开发步骤：
 *  1.1 导入SpringMVC的包
 *  1.2 配置Spring核心控制器DispatcherServlet（前端控制器）
 *  1.3 编写Controller类和视图页面
 *  1.4 将Controller使用注解配置到Spring容器中（@Controller）、配置映射
 *  1.5 配置spring-mvc.xml文件（配置组件扫描）
 *  1.6 执行访问测试
 *  2.SpringMVC流程图:
 *                                      Tomcat服务器
 *                  Tomcat引擎                                        Web应用
 *                  1.接收客户端请求，解析请求资源地址
 *         ---->    2.创建代表请求 request对象 ------------>request---->Service(req,resp) {
 *   客      请求    3.创建代表响应 response对象 ---------->response----->//获得请求资源地址，映射         Controller
 *   户    <----    4.调用目标资源                                       访问真实资源 <-------------->  Controller
 *   端      响应    5.获得resp中的内容，组装成http响应返回客户端             }    |                        Controller
 *                                                    ⬆---------------------|
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}