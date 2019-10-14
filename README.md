# SpringAop
1、创建pom.xml添加依赖
2、创建类 CustomerService.java 和 后面需要用到的方法
3、创建配置文件 SpringAOPAdvice.xml
4、创建BeforeMethod implements MethodBeforeAdvice 
5、在配置文件中创建对象及代理
    <bean id="customerServiceProxy" class="org.springframework.aop.framework.ProxyFactoryBean">
        <property name="target" ref="customerService" />
        <property name="interceptorNames">
            <list>
                <value>hiBeforeMethodBean</value>
6、编写App.java类 通过代理获取对象，调用方法（同理after,around,Afetr Throwing Advice）
