package com.fh.util.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SimpleAliDMSendMail {
    private static final String ALIDM_SMTP_HOST = "smtp.163.com";
    private static final int ALIDM_SMTP_PORT = 25;

    public static void main(String[] args) throws MessagingException {
        // 配置发送邮件的环境属性
        final Properties props = new Properties();
        // 表示SMTP发送邮件，需要进行身份验证
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", ALIDM_SMTP_HOST);
       // props.put("mail.smtp.port", ALIDM_SMTP_PORT);   
        // 如果使用ssl，则去掉使用25端口的配置，进行如下配置, 
         props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
         props.put("mail.smtp.socketFactory.port", "465");
         props.put("mail.smtp.port", "465");


        // 发件人的账号
        props.put("mail.user", "13161618211@163.com");
        // 访问SMTP服务时需要提供的密码
        props.put("mail.password", "719581][p");

        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        InternetAddress form = new InternetAddress(
                props.getProperty("mail.user"));
        message.setFrom(form);

        // 设置收件人
        InternetAddress to = new InternetAddress("1924836059@qq.com");
        message.setRecipient(MimeMessage.RecipientType.TO, to);

        // 设置邮件标题
        message.setSubject("测试邮件");
        // 设置邮件的内容体
        message.setContent("测试的HTML邮件", "text/html;charset=UTF-8");

        // 发送邮件
        Transport.send(message);
    }
}